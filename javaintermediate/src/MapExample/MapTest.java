package MapExample;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	Map<Integer, Product> myMap1=new HashMap();        
    Product prod1=new Product("Bluetooth",50,10,"Boat");        
    Product prod2=new Product("TV",1000,5,"Apple");        
    Product prod3=new Product("Camera",500,8,"Sony");        
    Product prod4=new Product("Tripod",70,15,"Digitech");
    Product prod5=new Product("Camera",500,8,"Sony");        
    Product prod6=new Product("Tripod",70,15,"Digitech");
    myMap1.put(1, prod1);
    myMap1.put(2, prod2);
    myMap1.put(3, prod3);
    myMap1.put(4, prod4);
    myMap1.put(5, prod5);
    myMap1.put(6, prod6);
    
    for(Map.Entry m:myMap1.entrySet())
    {
        System.out.println(m.getKey()+"----"+m.getValue());
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
