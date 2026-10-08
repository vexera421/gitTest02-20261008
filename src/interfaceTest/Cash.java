package interfaceTest;

public class Cash implements Payment {

	@Override
	public void pay(int money) {
		System.out.println("현금으로" +money+"원 결재합니다");
		
		
		
	}
	

}
