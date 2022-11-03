package com.z.TreeTest;

/**
 * @athor Fly
 * @data 2022/11/3 18:07
 * @Version 1.0
 */
public class BinaryTree {

    private int num;
    private BinaryTree leftTree;
    private BinaryTree rightTree;
    private BinaryTree head;
    private BinaryTree last;

    public BinaryTree(){}

    public BinaryTree(int num){this.num = num;}

    public void add(int num){
        if (head == null){
            head = new BinaryTree(num);
            return;
        }
        last = head;
        while (last != null){
            if (last.num == num) return;
            if (num > last.num){
                if (last.rightTree == null){
                    last.rightTree = new BinaryTree(num);
                    return;
                }
                last = last.rightTree;
            }
            if (num < last.num){
                if (last.leftTree == null){
                    last.leftTree = new BinaryTree(num);
                    return;
                }
                last = last.leftTree;
            }

        }
    }

    public void delete(int num){
        if (head == null){
            return;
        }
        last = head;
        while (true){
            if (num > last.num){
                if (num == last.rightTree.num && last.rightTree.rightTree == null && last.rightTree.leftTree == null){
                    last.rightTree = null;
                    return;
                }
                if (num == last.rightTree.num){
                    if (last.rightTree.rightTree != null && last.rightTree.leftTree != null){
                        last.rightTree.leftTree.rightTree = last.rightTree.rightTree;
                        last.rightTree = last.rightTree.leftTree;
                        break;
                    }else if(last.rightTree.rightTree == null){
                        last.rightTree = last.rightTree.leftTree;
                        break;
                    }else{
                        last.rightTree = last.rightTree.rightTree;
                        break;
                    }

                }
                last = last.rightTree;
            }else {
                if (num == last.leftTree.num && last.leftTree.rightTree == null && last.leftTree.leftTree == null){
                    last.leftTree = null;
                    return;
                }
                if (num == last.leftTree.num){
                    if (last.leftTree.leftTree != null && last.leftTree.rightTree != null){
                        last.leftTree.leftTree.rightTree = last.leftTree.rightTree;
                        last.leftTree = last.leftTree.leftTree;
                        break;
                    } else if(last.leftTree.rightTree == null){
                        last.leftTree = last.leftTree.leftTree;
                        break;
                    }else{
                        last.leftTree = last.leftTree.rightTree;
                        break;
                    }
                }
                last = last.leftTree;
            }
            continue;

        }
    }



}
