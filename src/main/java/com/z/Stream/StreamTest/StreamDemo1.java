package com.z.Stream.StreamTest;

import com.z.Stream.StreamTest.pojo.Author;
import com.z.Stream.StreamTest.pojo.Book;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @athor Fly
 * @data 2022/10/10 16:11
 * @Version 1.0
 */
public class StreamDemo1 {

    public static void main(String[] args) {
        List<Author> authors = getAuthors();
        //test1(authors);
        //test2();
        //test3();
        //test4();

        //distinct() 去重 根据object.equals()比较
//        authors.stream()
//                .distinct()
//                .forEach(author -> System.out.println(author.getName()));

        //sorted() 排序 可让实体类继承Comparator类重写方法更改排序
//        authors.stream()
//                .distinct()
//                .sorted((a1,a2)-> a2.getAge()-a1.getAge())
//                .forEach(author -> System.out.println(author.getAge()));

        //limit() 截取
//        authors.stream()
//                .distinct()
//                .sorted((a1,a2)-> a2.getAge()-a1.getAge())
//                .limit(2)
//                .forEach(author -> System.out.println(author.getAge()));

        //skip() 跳过
//        authors.stream()
//                .distinct()
//                .sorted((a1,a2)-> a2.getAge()-a1.getAge())
//                .skip(1)
//                .forEach(author -> System.out.println(author.getAge()));

        //flatMap 将流中的对象转换为流 max min 最大值最小值
//        Optional<Integer> max = authors.stream()
//                .flatMap(author -> author.getBooks().stream())
//                .distinct()
//                .map(Book::getScore)
//                .max((o1, o2) -> o2-o1);
//
//        System.out.println(max.get());

        //anyMatch一个满足条件返回true      allMatch全部满足条件返回true    nonMatch都不符合条件返回true 否则返回false
        //findAny 随机获取一个流           findFirst获取第一个流

        Map<String, List<Book>> map = authors.stream()
                .distinct()
                .collect(Collectors.toMap(author -> author.getName(), author -> author.getBooks()));

        System.out.println(map.get("余华"));


    }

    private static void test4() {
        Map<String, Integer> map = new HashMap<>();
        map.put("蜡笔小新",19);
        map.put("黑子",17);
        map.put("日向翔阳",16);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Stream<Map.Entry<String, Integer>> stream = entries.stream();

        stream.filter(maps -> maps.getValue()>16)
                .forEach(maps -> System.out.println(maps.getValue()));
    }

    private static void test3() {
        Author author = new Author(3L, "余华", 54, "活着", null);
        Author author1 = new Author(3L, "华", 54, "活着", null);

        HashSet<Author> set = new HashSet<>();
        set.add(author);
        set.add(author1);

        set.remove(author);
        System.out.println(set.toString());
    }

    private static void test2() {
        int[] arr = {1,2,3,4,5};
        Arrays.stream(arr).forEach(arrs -> System.out.println(arrs));
    }

    private static void test1(List<Author> authors) {
        authors.stream()
                .distinct()
                .filter(author -> author.getAge() < 55)
                .forEach(author -> System.out.println(author));
    }

    public static List<Author> getAuthors(){
        Author author1 = new Author(1L, "蒙多", 33, "一个从菜刀中明悟哲理的祖安人", null);
        Author author2 = new Author(2L, "莫言", 56, "晚熟的人", null);
        Author author3 = new Author(3L, "余华", 54, "活着", null);
        Author author4 = new Author(3L, "余华", 54, "活着", null);

        List<Book> books1 = new ArrayList<>();
        List<Book> books2 = new ArrayList<>();
        List<Book> books3 = new ArrayList<>();

        books1.add(new Book(1L,"刀的两侧是光明与黑暗","哲学,爱情",88,"用一把刀划分了爱情"));
        books1.add(new Book(2L,"一个人不能死在同一把刀下","个人成长,爱情",99,"讲述如何从失败中明悟真理"));

        books2.add(new Book(3L,"那风吹不到的地方","哲学",85,"带你用思维去领略世界的尽头"));
        books2.add(new Book(3L,"那风吹不到的地方","哲学",85,"带你用思维去领略世界的尽头"));
        books2.add(new Book(4L,"吹或不吹","爱情,个人传记",56,"一个哲学家的恋爱观注定很难把他所在的时代理解"));

        books3.add(new Book(5L,"你的剑就是我的剑","爱情",56,"无法想象一个武者能对他的伴侣这么的宽容"));
        books3.add(new Book(6L,"风与剑","个人传记",100,"两个哲学家灵魂和肉体的碰撞会激起怎么样的火花呢?"));
        books3.add(new Book(6L,"风与剑","个人传记",100,"两个哲学家灵魂和肉体的碰撞会激起怎么样的火花呢?"));

        author1.setBooks(books1);
        author2.setBooks(books2);
        author3.setBooks(books3);
        author4.setBooks(books3);

        ArrayList<Author> authorList = new ArrayList<>(Arrays.asList(author1, author2, author3, author4));
        return authorList;


    }

}
