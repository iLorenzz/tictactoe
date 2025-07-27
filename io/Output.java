package io;

public final class Output{
	private Output(){}
	
	public static void write(Object obj){
		if(obj == null)
			System.out.println();
		else
			System.out.println(obj);
	}
	
	public static void writeNewLine(){
		write(null);
	}
}