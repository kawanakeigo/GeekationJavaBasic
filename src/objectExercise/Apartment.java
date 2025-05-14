package objectExercise;

public class Apartment extends Property {
	private double area;
	
	Apartment(String propetyName ,String name, String address ,  String price ,double area){
		super(propetyName , name , address ,price );
		this.area = area;
	}
	
	public void document() {
		super.document();
		System.out.println("間取り：" + this.area +"LDK");
	}

}
