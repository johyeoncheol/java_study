package com.inner;

interface Game{
	void play();
}

/* 추상 클래스 추상 메소드 
 * */
abstract class Movie{
	abstract void play();
}

//매번 이렇게 자식을 만들기 귀찮음!
class MyMovie extends Movie{
	@Override
	void play() {
		// TODO Auto-generated method stub
		
	}
}



public class MP3Player {
	public void start(Movie m) {
		m.play();
	}
	
	public void start (Game g) {
		g.play();
	}
	public static void main(String[] args) {
		MP3Player player = new MP3Player();
		/* 그래서 MyMovie()를 사용 하지 않고
		*  Movie()의 무명 클래스를 만들 어 줄 수 있다.
		*  클래스 선언과 생성을 동시에 수행하는 클래스 -> 1회용으로 사용 가능하다.
		*/
		player.start(new Movie() {	
			//Movie클래스를 상속 받는 자식을 선언한 후 생성까지 함
			//play라는 메소드는 무조건 만들어 줘야 한다.
			@Override
			void play() {
				System.out.println("harry potter");
			}
		});
		player.start(new Movie() {	
			@Override
			void play() {
				System.out.println("supperman!!");
			}
		});
		
		// interface 안에 들어 있는 메소드는 public static 가 생략 되어 있으므로
		// 밑에서 인터페이 재정의 하려면 public가 없으면 default가 되므로 오류!
		// 따라서 public void play로 만들어야 한다.
		player.start(new Game() {	
			@Override
			public void play() {
				// TODO Auto-generated method stub
				System.out.println("harry potter");
			}
		});
	}

}
