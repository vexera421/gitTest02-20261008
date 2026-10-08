package interfaceTest;

public class MainPay {

	public static void main(String[] args) {
	//	Payment pay; 
		
	//	pay = new Card();
	//	pay.pay(50000);
		
		//pay = new Cash();
		
		
		Payment pay;
		
		Card card = new Card();
		Cash cash = new Cash();
		pay = card;
	
		pay.pay(50000);
		
		pay = cash;
		pay.pay(50000);
		
		int price = 170000; //구입하려는 물건의 가격
		
		if(price >= 100000) {
			pay = card;
			
		}else {
			pay = cash;
		}
		pay.pay(price);//업 캐스팅
	}

}
