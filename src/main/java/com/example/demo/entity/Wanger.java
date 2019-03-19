package com.example.demo.entity;

public class Wanger {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Thread t = new Thread(new Runnable() {
				
				@Override
				public void run() {
					System.out.println("我叫" + Thread.currentThread().getName() + "，我超喜欢沉默王二的写作风格");
				}
			});
			t.start();
		}
	}
}
