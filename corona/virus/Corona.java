package lab.ssafy.corona.virus;

/*default prtected
 * private은 하위 Class가 상속 받아도 직접 접근 할 수 없습니다.
 * modifier를 생략한 default의 경우에도 마찬가지입니다.
 * 하위 Class에서 직접 접근하고자 할 경우 protected로 선언하거나 상위 Class의 public method를 통해서 접근이 가능합니다.
 * */
/* default
 * 같은 패키지 안에서 상속 구조에서는 변수를 사용할 수 있다.
 * */

/* 자식 클래스의 기본 생성자는 부모 클래스의 생성자를 변도로 호출하지 않으면
 * 부모 클래스의 기본 생성자를 자동으로 호출합니다.
 * 부모 클래스의 기본생성자가 없으므로 오류가 발생합니다.
 * */

/*
 * [컴파일러가 자동으로 하는 일]1. import java.lang.*;기본추가
 *  2. extends가 명시되지 않았을 떄 extends Objectc추가
 *  3.생성자를 한개도 정의 안했을 때, 기본 생성자 추가
 *  4. 자식 class의 기본 생성자는 부모 class 생성자를 별도로 호출하지 않으면 자동으로 부모 class의 생성자를 호출
 *  */
public class Corona extends Virus implements Comparable<Corona> {

	public int spreadSpeed;

	public int getSpreadSpeed() {
		return spreadSpeed;
	}

	public void setSpreadSpeed(int spreadSpeed) {
		this.spreadSpeed = spreadSpeed;
	}

	public void showInfo() {
		String info = super.getName() + " " + super.getLevel() + " " + this.spreadSpeed;
		System.out.println(info);
	}

	public Corona() {
	}

	public Corona(String name, int level, int spreadSpeed) {
		super(name, level);
		this.spreadSpeed = spreadSpeed;
	}

	@Override
	public String toString() {
		return super.getName() + " " + super.getLevel() + " " + this.spreadSpeed;
	}

	@Override
	public int compareTo(Corona c) {
		return this.spreadSpeed - c.spreadSpeed;
	}
}
