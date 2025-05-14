package objectExercise;

public class Land extends Property {
	private double area;
	Land(String propetyName ,String name, String address ,  String price ,double area){
		super(propetyName , name , address ,price );
		this.area = area;
	}
	
	public void document() {
		super.document();
		System.out.println("広さ：" + this.area +"㎡");
	}
	

	}


