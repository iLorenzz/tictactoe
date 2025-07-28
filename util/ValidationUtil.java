package util;

public final class ValidationUtil {
	private ValidationUtil(){ }
	
	public static void require(boolean condition, String errorMessage){
		if(!condition){
			throw new IllegalArgumentException(errorMessage);
		}
	}
}