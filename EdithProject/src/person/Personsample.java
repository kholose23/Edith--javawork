package person;

public class Personsample {
	String name;
	int age;
	int job;


	 
	
	}

}



















public void getProduct(ArrayList<Product> list)
{

    Scanner scn=new Scanner(System.in);
    System.out.println("Enter name");
    String findName=scn.next();
    for(int i=0;i<list.size();i++)
    {
        
        if(list.get(i).name.equals(findName))
        {
            System.out.println(list.get(i));
        }
    }
}

public void getProduct(ArrayList<Product> list)
{

    Scanner scn=new Scanner(System.in);
    System.out.println("Enter name");
    String findName=scn.next();
    for(int i=0;i<list.size();i++)
    {
        
        if(list.get(i).name.equals(findName))
        {
            System.out.println(list.get(i));
        }
    }
}

/**
 * 
 */
public Personsample() {
	super();
}
