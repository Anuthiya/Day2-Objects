package trainingday2OBJECTS;

public class Usesaree {
	public static void main (String[] args) {
		saree s1 = new saree();
		s1.material = "synthetic";
		s1.colour = "yellow";
		s1.price = 1000;
		s1.rating = 4.5f;
		s1.itisheavy = true;
		s1.barcode = 13234l;
		s1.discountAmount = 500;
		s1.discountPercentage = 50;
		s1.netPrice = s1.price - s1.discountAmount;
		s1.netprice1 = s1.price - (s1.price * s1.discountPercentage/100);
		System.out.println("material = "+s1.material+ ",colour = "+s1.colour+ "Netprice = "+s1.netPrice+ ",netprice1 = "+s1.netprice1);
	}

}
