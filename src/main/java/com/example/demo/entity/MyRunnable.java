package com.example.demo.entity;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("我叫" + Thread.currentThread().getName() + "，我超喜欢沉默王二的写作风格");
		
	}
	
   public static void main(String [] args){
	   for (int i = 0; i < 10; i++) {
		   Thread thread =new Thread(new MyRunnable());
		   thread.start();
	}   
	   
   }

}
