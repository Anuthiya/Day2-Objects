package trainingday2OBJECTS;

public class UseMobile {
       public static void main (String[] args) {
    	   Mobile M1 = new Mobile();
    	   M1.model = "samsung";
    	   M1.colour = "orange";
    	 M1.rating = 4.8f;
    		M1.price = 20000;
    		M1.discountPercen = 10;
    		M1.netPrice = M1.price - (M1.price - M1.discountPercen/100);
    		M1.batType = 'A';
    		M1.isTouch = true;
       }
}
