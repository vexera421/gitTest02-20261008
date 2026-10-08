package interfaceTest;

public interface Animal { //interface라는 키워드로 인터페이스 생성
	//int age; 인터페이스 -> 초기화 되지 않은 변수는 선언 불가능
	public static final int age=10; // 인터페이스-> 상수만 선언가능
	
	//인터페이스 -> 추상 메서드만 선언가능
	public void sound();  //인터페이스에서는 abstract 생략 가능
	//인터페이스 내에 선언된 메서드는 기본적으로 추상 메서드
	public void move();
	
	


}
