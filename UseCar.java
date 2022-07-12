package trainingday2OBJECTS;

public class UseCar {
	public static void main (String[] args) {
		Car C1 = new Car();
		C1.batType = 'E';
		C1.brand = "hyndai";
		C1.rating = 4.5f;
		C1.price = 450000;
		C1.isPetrol = true;
		C1.batNo = 8932479l;
		C1.taxAmount = 10000;
		C1.taxPercen = 10;
		C1.netPrice = C1.price + C1.taxAmount;
		C1.netPrice1 = C1.price + (C1.price * C1.taxPercen/100);
		System.out.println("price = "+C1.price + " tax amount = "+C1.taxAmount + ", taxper = "+C1.taxPercen + "petrol = "+C1.isPetrol + ", batNo = "+C1.batNo + ", batType = "+C1.batType + ", brand = "+C1.brand+ "netPrice = "+C1.netPrice+ ", netPrice1 = "+C1.netPrice1+ "ratin = "+C1.rating);
		
	}

}
