package com.example.demo.entity;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Wanger2{
	public static void main(String[] args) {
//		ExecutorService executorService = Executors.newCachedThreadPool();
		ExecutorService executorService = new ThreadPoolExecutor(10, 10,
		        60L, TimeUnit.SECONDS,
		        new ArrayBlockingQueue(10));

		for (int i = 0; i < 15; i++) {
			Runnable r = new Runnable() {

				@Override
				public void run() {
					System.out.println("我叫" + Thread.currentThread().getName() + "，我超喜欢沉默王二的写作风格");
				}
			};
			executorService.execute(r);
		}
		executorService.shutdown();
	}
}
