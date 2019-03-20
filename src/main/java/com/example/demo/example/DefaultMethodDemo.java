package com.example.demo.example;

//DK8 开始，支持在接口 Interface 中定义 default 方法。default 方法只能出现在接口 Interface 中。
//  接口中被 default 修饰的方法被称为默认方法，实现此接口的类如果没 Override 此方法，则直接继承这个方法，不再强制必须实现此方法。
//default 方法语法的出现，是为了既有的成千上万的 Java 类库的类增加新的功能， 且不必对这些类重新进行设计。
// 举例来说，JDK8 中 Collection 类中有一个非常方便的 stream() 方法，就是被修饰为 default，Collection 的一大堆 List、
// Set 子类就直接继承了这个方法 I，不必再为每个子类都注意添加这个方法。

public class DefaultMethodDemo {
    interface MyInterface {
        default void print() {
            System.out.println("Hello World");
        }
    }


    static class MyClass implements MyInterface {}

    public static void main(String[] args) {
        MyInterface obj = new MyClass();
        obj.print();
    }
}
// Output:
// Hello World
