package Myenum2;

public enum AssignmentStatus {
	PENDING("Awaiting"),
	COMPLETED(" Well Done"),
	REJECTED("Try Again"),
	DILIVERED("Yes"),
	FEEDBACKCOLLECTED("Thank You");
	
	String des;
	
	private AssignmentStatus(String a) {
		des=a;
	}	
	public String getAssignment()
	{
		return des;
	}
	

}
