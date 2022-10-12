package Exception;

public class Shopping {
	//take the responsibility of fixing all the issues by itself
	public void addToCart()
	{
		try {
		String[] Cart=new String[5];
		Cart[5]="Mobile";
		}catch (Exception e) {}
	}
	//declaring the exception //I will pass the ownership to calling environment
	public void makePayment() throws Exception
	{
		int x=10;
		int y=0;
		int z=x/y;
	}	
		
	
	
		
		
		
	

}
