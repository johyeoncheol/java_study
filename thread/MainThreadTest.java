package com.thread;

class Car{
	
}
public class MainThreadTest implements Runnable{
	MainThreadTest(){ //Thread 생성해서 시작 시키기
		//서브 스레드
		Thread t = new Thread(this);
		t.start(); // run()로 감
		try {
			// t가 일을 마칠때까지 기다림
			// 쓰레드 간의 순서를 잡아줄 때 사용한다.
			t.join(); 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void go() {
		System.out.println("gogo");
	}
	
	// 메인 스레드
	// 대부분 우선순위 메인스레드 > 서브스레드
	public static void main(String[] args) {
		//생성자 호출됨
		MainThreadTest m = new MainThreadTest();
		m.go(); // 메인스레드에 의해서 실행이 됨
	}

	@Override
	public void run() {//thread한테 시킬 작업 내용
		System.out.println("run method...");
	}
}
