package com.example.demo.example;
//被 abstract 修饰的方法被称为抽象方法，方法不能有实体。抽象方法只能出现抽象类中。
public class AbstractMethodDemo {
    static abstract class AbstractClass {
        abstract void print();
    }

    static class ConcreteClass extends AbstractClass {
        @Override
        void print() {
            System.out.println("call print()");
        }
    }

    public static void main(String[] args) {
        AbstractClass demo = new ConcreteClass();
        demo.print();
    }

}
// Outpu:
// call print()

