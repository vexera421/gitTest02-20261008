package interfaceTest;

public class SmartPhone implements Phone, Camera{

	@Override
	public void takePicture() {
		System.out.println("사진 찍기");
		
	}

	@Override
	public void call() {
		System.out.println("전화 걸기");
	}
	
	

}
