package com.thread;

/* Runnable를 implements한 클래스는 Thread 클래스가 아니다. 
 * */

//2. Runnable interface를 구현해서 thread 만드는 방법
class Lion implements Runnable{
	//thread의 작업 내용이 들어있는 메소드
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("thread is running..." + t.getName());
	}
}


//2. Runnable interface 를 구현해서 thread 만드는 방법
public class LionTest {
	public static void main(String[] args) {
		// Thread 는 아님, thread가 해야할 작업 내용이 들어있는 run()은 갖고 있음
		Lion l1 = new Lion();
		Thread t1 = new Thread(l1);
		t1.start(); // thread의 작업 시작을 알리는 메소드
		
		Lion l2 = new Lion();
		Thread t2 = new Thread(l2);
		t2.start(); // thread의 작업 시작을 알리는 메소드
		
		Lion l3 = new Lion();
		Thread t3 = new Thread(l3);
		t3.start(); // thread의 작업 시작을 알리는 메소드
	}
}
