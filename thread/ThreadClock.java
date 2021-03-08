package com.thread;

import java.util.Date;

public class ThreadClock implements Runnable {

	ThreadClock() {
		Thread t = new Thread(this);
		t.start();
	}

	public static void main(String[] args) {
		new ThreadClock();
	}

	// Thread 작업 내용 , 1초 간격으로 화면에 시간 출력하기
	@Override
	public void run() {
		while (true) {
			Date d = new Date();
			System.out.println(d);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // 1초간 재우기
		}
	}
}
