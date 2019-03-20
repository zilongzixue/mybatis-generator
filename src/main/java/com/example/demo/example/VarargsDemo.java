package com.example.demo.example;

import java.util.List;

//JDK5 开始，Java 支持传递同类型的可变参数给一个方法。在方法声明中，在指定参数类型后加一个省略号 ...。
//        一个方法中只能指定一个可变参数，
//        它必须是方法的最后一个参数。任何普通的参数必须在它之前声明。
public class VarargsDemo {
    public static void method(String... params) {
        VarargsDemo varargsDemo=new VarargsDemo();
        System.out.println( params instanceof String []);
        System.out.println("params.length = " + params.length);
        for (String param : params) {
            System.out.println("params = [" + param + "]");
        }
    }

    public static void main(String[] args) {
        method("red");
        method("red", "yellow");
        method("red", "yellow", "blue");
    }
}
// Output:
// params.length = 1
// params = [red]
// params.length = 2
// params = [red]
// params = [yellow]
// params.length = 3
// params = [red]
// params = [yellow]
// params = [blue]

