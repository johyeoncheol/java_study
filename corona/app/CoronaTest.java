package lab.ssafy.corona.app;


/*코로나 바이러스 다형성 부여하기
 * 타입 과 메소드에 대한 다형성으로 나누고 있다.
 * 메소드는 오버로딩과 오버라이딩으로 나뉘어진다.
 * overloading은 
 * name이 같아도 parameter가 다르면 별개의 method로 간주함 생성자도 동일함
 * overriding은
 * 상속관계에서 부모 Class의 method를 자식 Class에서 재정의를 할 수 있음
 * */

/* 다형성 Type
 * 부모 Type 으로 자식 Type 의 객체를 Reference 할 수 있습니다.
 * 즉, 한 개의 Type으로 여러 하위 Type 의 객체를 할당 받을 수 있습니다.
 * Object <- Phone <- FolderblePhone
 * 1.Object o = new Object(); 가능
 * 2.Phone p = new Phone(); 가능
 * 3.FolderblePhone fp = new Phone(); 불가능
 * 4.Phone p = new FolderblePhone(); 가능
 * 5.Object o = new Phone();
 * 6.Object o = new FolderPhone();
 * */
/* method overriding 연습
 * Object(toString => 1번) <- Virus <- Corona(toString => 2번) <- ChildCorona
 * Object x = new Corona(); 2번 호출
 * Object x= new Virus(); 1번 호출
 * ChildCorona x = new Object(); 에러
 * Virus x = new ChildCorona(); 2번 호출
 * */

/* method overriding 연습
 * A 의 a D 의 a 는 오버라이딩 관계
 * B 의 b D 의 b 는 오버라이딩 관계
 * C 의 a E 의 a 는 오버라이딩 관계
 * 
 * A a(int i){}
 * B b(){}
 * C a(){}, b(int i){}
 * D a(int i){}, b(){}
 * E a(){},b(){}
 * 
 * 1. A x = new C() x.a(); -> A 위로 볼때 a의 파라미터가 있는게 없으므로 에러
 * 2. C x = new E() x.b(3); -> C의 위로 볼때 b의 파라미터를 받는 부분이 C에 있다.
 *  D E에 b에 대한 오버로딩된게 없으므로 c.b를 호출한다
 * 3. D x = new B() x.b(); - > B가 상속 관계에서 더 위에 있으므로 에러
 * 4. B x = new D() x.a(a) -> B의 a의 파라미터가 있는 부분을 호출하는 게 A에 있다.
 * 그러나 B에서 오버로딩을 하고 있기 때문에 D에 있는 a를 호출하고 한다.
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
