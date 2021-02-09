package lab.ssafy.corona.virus;

/*default prtected
 * private�� ���� Class�� ��� �޾Ƶ� ���� ���� �� �� �����ϴ�.
 * modifier�� ������ default�� ��쿡�� ���������Դϴ�.
 * ���� Class���� ���� �����ϰ��� �� ��� protected�� �����ϰų� ���� Class�� public method�� ���ؼ� ������ �����մϴ�.
 * */
/* default
 * ���� ��Ű�� �ȿ��� ��� ���������� ������ ����� �� �ִ�.
 * */

/* �ڽ� Ŭ������ �⺻ �����ڴ� �θ� Ŭ������ �����ڸ� ������ ȣ������ ������
 * �θ� Ŭ������ �⺻ �����ڸ� �ڵ����� ȣ���մϴ�.
 * �θ� Ŭ������ �⺻�����ڰ� �����Ƿ� ������ �߻��մϴ�.
 * */

/*
 * [�����Ϸ��� �ڵ����� �ϴ� ��]1. import java.lang.*;�⺻�߰�
 *  2. extends�� ��õ��� �ʾ��� �� extends Objectc�߰�
 *  3.�����ڸ� �Ѱ��� ���� ������ ��, �⺻ ������ �߰�
 *  4. �ڽ� class�� �⺻ �����ڴ� �θ� class �����ڸ� ������ ȣ������ ������ �ڵ����� �θ� class�� �����ڸ� ȣ��
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
