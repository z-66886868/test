package com.z.Sort.Test;

import com.z.Sort.Test.pojo.GirlFriend;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @athor Fly
 * @data 2022/11/1 15:50
 * @Version 1.0
 */
public class GirlFriendTest {

    public static void main(String[] args) {

        GirlFriend girlFriend1 = new GirlFriend("万",20,168);
        GirlFriend girlFriend2 = new GirlFriend("邱",18,155);
        GirlFriend girlFriend3 = new GirlFriend("金",18,165);

        GirlFriend[] arr = {girlFriend1,girlFriend2,girlFriend3};

        Arrays.sort(arr, (o1, o2) -> {
            if (o1.getAge() != o2.getAge()) return o1.getAge() - o2.getAge();
            else if (o1.getHeight() != o2.getHeight()) return (int) (o1.getHeight() - o2.getHeight());
            else return o1.getName().compareTo(o2.getName());
        });

        System.out.println(Arrays.toString(arr));

    }

}
