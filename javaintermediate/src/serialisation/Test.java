package serialisation;

import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java. io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {
		public static void main(String[] args) {
			Product prod=new Product(1000,"TV",1000,"Apple");
			try {
				
			
		FileOutputStream fileOut=new FileOutputStream("object.txt");
		//to convert object into stream of bytes
		ObjectOutputStream Out=new ObjectOutputStream(fileOut);
		//write into the file
		Out.writeObject(prod);
		
		FileInputStream fileIn=new FileInputStream("object.txt");
		//convert bytes to Object
		ObjectInputStream oIn=new ObjectInputStream(fileIn);
		Product ProdCopy=(Product)oIn.readObject();
		System.out.println(ProdCopy.prodId);
		System.out.println(ProdCopy.name);
		System.out.println(ProdCopy.brand);
		System.out.println(ProdCopy.price);
		
	}catch (Exception e) {
		//TODO Auto-generated catch block
		e.printStackTrace();

	}

}
		
}
