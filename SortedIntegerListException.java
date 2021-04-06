public class SortedIntegerListException extends RuntimeException{

	protected int number;
	protected String message;
	
	public SortedIntegerListException(String error, int num){
		number = num;
		message = error;
	}

	public String getMessage(){
		return(message);
	}

}