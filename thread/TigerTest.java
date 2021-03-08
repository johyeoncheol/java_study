package com.thread;

// 1. Thread class 상속 받아서 thread 만드는 방법
class Tiger extends Thread {
	// run() : thread가 해야 할 작업 내용을 가지고 있는 메소드
	// callback 메소드 : 직접 호출되지 않고 간접적으로 호출됨
	public void run() {
		System.out.println("thread is running..." + getName());
	}
}

public class TigerTest {
	//현재 쓰레드는 4개가 있다.
	// 메인쓰레드 1개 + 서브쓰레드 3개
	public static void main(String[] args) {
		Tiger t1 = new Tiger(); // Thread를 생성한 거임
		t1.run(); // 메인 스레드에서 일을 함
		t1.start(); // thread의 작업 시작을 알리는 작업

		Tiger t2 = new Tiger(); // Thread를 생성한 거임
		t2.start(); // thread의 작업 시작을 알리는 작업

		Tiger t3 = new Tiger(); // Thread를 생성한 거임
		t3.start(); // thread의 작업 시작을 알리는 작업
	}
}
