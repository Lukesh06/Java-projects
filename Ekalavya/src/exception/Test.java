package exception;

public class Test {
	public static void main(String args[]) throws AgeNotSupportedException {
		validateAgeForVote(19);
		throw new NullPointerException();
		
	}
	
	 public static void validateAgeForVote(int age) throws AgeNotSupportedException {
		 if(age<18) {
			 throw new AgeNotSupportedException("Age is invlid for vote");
		 }else {
			 System.out.println("Age is valid");
		 }
	 }
}
