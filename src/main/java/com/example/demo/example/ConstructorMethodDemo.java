package com.example.demo.example;


//构造方法
//        任何类都有构造方法，构造方法的作用就是在初始化类实例时，设置实例的状态。
//        每个类都有构造方法。如果没有显式地为类定义任何构造方法，Java 编译器将会为该类提供一个默认构造方法。
//        在创建一个对象的时候，至少要调用一个构造方法。构造方法的名称必须与类同名，一个类可以有多个构造方法。
//注意，构造方法除了使用 public，也可以使用 private 修饰，这种情况下，
//        类无法调用此构造方法去实例化对象，这常常用于设计模式中的单例模式。

public class ConstructorMethodDemo {

    static class Person {
        private String name;

        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Person person = new Person("jack");
        person.setName("Jack");
        System.out.println("person name is " + person.getName());
    }
}

