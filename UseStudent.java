package trainingday2OBJECTS;

public class UseStudent {
    public static void main (String[] args) {
    	Student S1 = new Student();
    	S1.name = "Viji";
    	S1.age = 27;
    	S1.phoneNo = 9562346891l;
    	S1.section = 'A';
    	S1.aC = 16374.4832d;
    	S1.weight = 52.3f;
    	S1.isfemale = true;
    	
    	
    	Student S2 = new Student();
    	S2.name = "abcd";
    	S2.age = 23;
    	S2.phoneNo = 5692505205l;
    	S2.section = 'B';
    	S2.aC = 2424.343d;
    	S2.weight = 43.2f;
    	S2.isfemale = true;
    	
    	System.out.println(S1.name+S1.age+S1.phoneNo+S1.section+S1.aC+S1.weight+S1.isfemale);
    	System.out.println("Name = "+S2.name+" Age = "+S2.age+" , phoneNo = "+S2.phoneNo+" ; section = "+S2.section+" aC = "+S2.aC+" Weight = "+S2.weight+" / Gender is female = "+S2.isfemale);
    	
    }
}
