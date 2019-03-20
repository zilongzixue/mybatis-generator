package com.example.demo.entity;

public class FinalMethodDemo {
    static class Father {
//        protected final void print() {
//            System.out.println("call Father print()");
//        };
        protected  void print() {
            System.out.println("call Father print()");
        };
    }
//    public > protected > 包访问权限（没有任何关键字）> private
//    public - 表示任何类都可以访问；
//    包访问权限 - 包访问权限，没有任何关键字。它表示当前包中的所有其他类都可以访问，但是其它包的类无法访问。
//    protected - 表示子类可以访问，此外，同一个包内的其他类也可以访问，即使这些类不是子类。
//    private - 表示其它任何类都无法访问。

//    上面示例中，父类 Father 中定义了一个 final 方法 print()，则其子类不能 Override 这个 final 方法，否则会编译报错
    static class Son extends Father {
        @Override
        protected void print() {
            System.out.println("call print()");
        }
    }

    public static void main(String[] args) {
        Father demo = new Son();
        demo.print();
    }
}
// 编译时会报错
