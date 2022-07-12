package trainingday2OBJECTS;

public class UsePen {
	public static void main(String[] args) {
		Pen p1 = new Pen();
		p1.brand = "renolds";
		p1.price = 10;
		p1.isBluecolour = true;
		p1.tipWidth = 1.5f;
		
		Pen p2 = new Pen();
		p2.brand = "Saino";
		p2.price = 6;
		p2.isBluecolour = false;
		p2.tipWidth = 1.2f;
		
		Pen p3 = new Pen();
		p3.brand = "Softink";
		p3.price = 20;
		p3.isBluecolour = true;
		p3.tipWidth = 1.5f;
		
		Pen p4 = new Pen();
		p4.AverageValue = ((p1.price+p2.price+p3.price)/3);
		
		System.out.println("The Average Value = "+p4.AverageValue);
	
		
	}

}
