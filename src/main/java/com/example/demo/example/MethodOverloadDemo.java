package com.example.demo.example;
//方法的重载是指方法名称相同，但参数的类型或参数的个数不同。通过传递参数的个数及类型的不同可以完成不同功能的方法调用。
//
//        注意：
//
//        重载一定是方法的参数不完全相同。如果方法的参数完全相同，仅仅是返回值不同，Java 是无法编译通过的
public class MethodOverloadDemo {
    public static void add(int x, int y) {
        System.out.println("x + y = " + (x + y));
    }

    public static void add(double x, double y) {
        System.out.println("x + y = " + (x + y));
    }

    public static void main(String[] args) {
        add(10, 20);
        add(1.0, 2.0);
    }
}
// Output:
// x + y = 30
// x + y = 3.0
