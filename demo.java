package trainingday2OBJECTS;

public class demo {
	public static void main (String[] args) {
		int price = 2000;
		int discountAmount = 250;
		int netprice = price - discountAmount;
		int discountPercentage = 50;
		int netprice1 = price - (price*discountPercentage/100);
		System.out.println(netprice);
		System.out.println(netprice1);
	
	}

}
