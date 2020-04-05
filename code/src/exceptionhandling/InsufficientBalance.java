package exceptionhandling;

public class InsufficientBalance extends RuntimeException {
private String message;
InsufficientBalance(String message){
	this.message=message;
}
public String getMessage() {
	return message;
}

}
