package com.example.demo.example;

import com.example.demo.entity.UserInfo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Java 中不允许直接创建泛型数组。但是，可以通过创建一个类型擦除的数组，然后转型的方式来创建泛型数组。
public class GenericArrayDemo<T> {

    static class GenericArray<T> {
        private T[] array;

        public GenericArray(int num) {
            array = (T[]) new Object[num];
        }

        public void put(int index, T item) {
            array[index] = item;
        }

        public T get(int index) { return array[index]; }

        public T[] array() { return array; }
    }



    public static void main(String[] args) {
        GenericArray<Integer> genericArray = new GenericArray<Integer>(4);
        genericArray.put(0, 0);
        genericArray.put(1, 1);
        Object[] array = genericArray.array();
        System.out.println(Arrays.deepToString(array));
        int a=10;
        int c=0;
        c +=a;
        System.out.println(c);

    }
}
// Output:
// [0, 1, null, null]

