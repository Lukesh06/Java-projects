package exception;

public class AgeNotSupportedException extends Exception{
	
	private static final long serialVersionUID = 7007038717726974790L;

	AgeNotSupportedException(String message){
		super(message);
	}
}
