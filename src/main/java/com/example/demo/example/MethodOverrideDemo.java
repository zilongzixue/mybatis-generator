package com.example.demo.example;
//覆写（Override）是指子类定义了与父类中同名的方法，但是在方法覆写时必须考虑到访问权限，子类覆写的方法不能拥有比父类更加严格的访问权限。
//
//        子类要覆写的方法如果要访问父类的方法，可以使用 super 关键字。
public class MethodOverrideDemo {
    static class Animal {
        public void move() {
            System.out.println("会动");
        }
    }
    static class Dog extends Animal {
        @Override
        public void move() {
            super.move();
            System.out.println("会跑");
        }
    }

    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.move();
    }
}
// Output:
// 会动
// 会跑
