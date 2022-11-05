package Singleton;

public class BankAccount {
	private static BankAccount y;
	
	public static BankAccount getObjectOfBankAccount() {
		if (y == null) {
			y = new BankAccount();
		}
		return y;
		
	public void accountNumber()
		
		System.out.println("105687485972");
	}
	public void owner()
	{
		System.out.println("M Williams");
	}
	public void branch()
	{
		System.out.println("NorthWalsham");
	}
	public void balance()
	{
		System.out.println("100");
	}

	private long accountNumber;
	private String owner;
    private String branch;
    private double balance;
    private double interestRate;
    
    public Builder(105687485972) {
        this.accountNumber = accountNumber;
    } 
        public Builder withOwner(String M. Williams){
            this.owner = owner;
            return this;
        }  
            public Builder at Branch(String NorthWasham) {
                this.branch = branch;
                return this;
            }     
                public Builder openingBalance(double £100){
                    this.balance = balance;
                    return this;
                }      
                    public Builder interestRate(double 0.135%)
                    this.interestRate = interestRate;
                    return this;
                    
                    
                
    


}
	


 
	 
