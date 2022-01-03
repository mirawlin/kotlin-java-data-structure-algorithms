package au.com.mir.java.datastructures.hashtables;

import java.util.HashSet;

public class FirstRecurringValue {
    //Google Question
    //Given an array = [2,5,1,2,3,5,1,2,4]: It should return 2
    //Given an array = [2,1,1,2,3,5,1,2,4]: It should return 1
    //Given an array = [2,3,4,5]: It should return null

    public Integer getFirstRecurring(Integer[] array) {
        HashSet<Integer> hashSet = new HashSet<>();

        for(int i = 0; i < array.length; i++) {
            if(hashSet.contains(array[i]))
                return array[i];
            else
                hashSet.add(array[i]);
        }
        return null;
    }

    public static void main(String[] args) {
        Integer[] array = {2, 5, 5, 2, 3, 5, 1, 2, 4};
        Integer[] array2 = {2, 5, 1, 2, 3, 5, 1, 2, 4};
        Integer[] array3 = {2, 3, 4, 5};

        FirstRecurringValue obj = new FirstRecurringValue();

        System.out.println(obj.getFirstRecurring(array));
        System.out.println(obj.getFirstRecurring(array2));
        System.out.println(obj.getFirstRecurring(array3));
    }
}
