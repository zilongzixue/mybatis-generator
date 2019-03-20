package com.example.demo.example;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class DoWhileDemo {
    public static void main(String args[]) {
//        int x = 10;
//
//        do {
//            System.out.print("value of x : " + x);
//            x++;
//            System.out.print("\n");
//        } while (x < 20);
//        File f = new File("E:\\123..xls");
//        try {
//            boolean flag = f.createNewFile();
//            System.out.println(flag);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        File f = new File("E:\\abc\\bcd");
//        boolean flag = f.mkdir();
        File f = new File("E:");
        String str[] = f.list();

        System.out.println("文件夹列表:"+ Arrays.toString(str));
    }
}
// output:
// value of x:10
// value of x:11
// value of x:12
// value of x:13
// value of x:14
// value of x:15
// value of x:16
// value of x:17
// value of x:18
// value of x:19
