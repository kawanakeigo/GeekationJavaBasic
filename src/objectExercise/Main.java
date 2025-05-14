package objectExercise;

public class Main {

	public static void main(String[] args) {
		Apartment Apartment = new Apartment("いい感じアパートメント", "山田 マンション太郎","マンション","50000000",3);
		Apartment.document();
	
		Land Land = new Land("いい感じの土地", "山田 土地太郎", "土地", "8000000",105.2);
		Land.document();

	}
}
