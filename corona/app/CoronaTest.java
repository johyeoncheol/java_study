package lab.ssafy.corona.app;


/*�ڷγ� ���̷��� ������ �ο��ϱ�
 * Ÿ�� �� �޼ҵ忡 ���� ���������� ������ �ִ�.
 * �޼ҵ�� �����ε��� �������̵����� ����������.
 * overloading�� 
 * name�� ���Ƶ� parameter�� �ٸ��� ������ method�� ������ �����ڵ� ������
 * overriding��
 * ��Ӱ��迡�� �θ� Class�� method�� �ڽ� Class���� �����Ǹ� �� �� ����
 * */

/* ������ Type
 * �θ� Type ���� �ڽ� Type �� ��ü�� Reference �� �� �ֽ��ϴ�.
 * ��, �� ���� Type���� ���� ���� Type �� ��ü�� �Ҵ� ���� �� �ֽ��ϴ�.
 * Object <- Phone <- FolderblePhone
 * 1.Object o = new Object(); ����
 * 2.Phone p = new Phone(); ����
 * 3.FolderblePhone fp = new Phone(); �Ұ���
 * 4.Phone p = new FolderblePhone(); ����
 * 5.Object o = new Phone();
 * 6.Object o = new FolderPhone();
 * */
/* method overriding ����
 * Object(toString => 1��) <- Virus <- Corona(toString => 2��) <- ChildCorona
 * Object x = new Corona(); 2�� ȣ��
 * Object x= new Virus(); 1�� ȣ��
 * ChildCorona x = new Object(); ����
 * Virus x = new ChildCorona(); 2�� ȣ��
 * */

/* method overriding ����
 * A �� a D �� a �� �������̵� ����
 * B �� b D �� b �� �������̵� ����
 * C �� a E �� a �� �������̵� ����
 * 
 * A a(int i){}
 * B b(){}
 * C a(){}, b(int i){}
 * D a(int i){}, b(){}
 * E a(){},b(){}
 * 
 * 1. A x = new C() x.a(); -> A ���� ���� a�� �Ķ���Ͱ� �ִ°� �����Ƿ� ����
 * 2. C x = new E() x.b(3); -> C�� ���� ���� b�� �Ķ���͸� �޴� �κ��� C�� �ִ�.
 *  D E�� b�� ���� �����ε��Ȱ� �����Ƿ� c.b�� ȣ���Ѵ�
 * 3. D x = new B() x.b(); - > B�� ��� ���迡�� �� ���� �����Ƿ� ����
 * 4. B x = new D() x.a(a) -> B�� a�� �Ķ���Ͱ� �ִ� �κ��� ȣ���ϴ� �� A�� �ִ�.
 * �׷��� B���� �����ε��� �ϰ� �ֱ� ������ D�� �ִ� a�� ȣ���ϰ� �Ѵ�.
 * */

import java.util.Iterator;
import java.util.PriorityQueue;

import lab.ssafy.corona.virus.Corona;

public class CoronaTest {

	public static void main(String[] args) {
		
		Corona c1 = new Corona("Corona5", 5, 5);
		Corona c2 = new Corona("Corona7", 5, 7);
		Corona c3 = new Corona("Corona3", 5, 3);
		Corona c4 = new Corona("Corona9", 5, 9);
		Corona c5 = new Corona("Corona1", 5, 1);
		
		PriorityQueue<Corona> pq = new PriorityQueue<>();
		pq.add(c1);
		pq.add(c2);
		pq.add(c3);
		pq.add(c4);
		pq.add(c5);
		
		Iterator<Corona> itr = pq.iterator();
		while(itr.hasNext()) System.out.println(itr.next());
	}

}
