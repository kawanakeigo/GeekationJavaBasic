package objectExercise;

public class Property {
	
		private String propetyName;
		private String name;
		private String address;
		private String price;
		
		
		Property(String propetyName ,String name, String address ,  String price   ){
			this.propetyName = propetyName;
			this.name = name;
			this.address = address;
			this.price = price;
			
			
			
		}
		public void document() {
			System.out.println("物件名：" + this.propetyName);
			System.out.println("物件所有者名：" + this.name);
			System.out.println("物件種別：" + this.address);
			System.out.println("物件価格：" + this.price  + "円");
		
			
		}
		
		


	}


