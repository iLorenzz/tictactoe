package io;

public final class Output{
	private Output(){}
	
	public static void write(Object obj){
		write(obj, true);
	}
	
	public static void write(Object obj, boolean addNewLine){
		if(obj != null){
			if(addNewLine){
				System.out.println(obj);
				return;
			}
			System.out.print(obj);
			return; 
		}
		
		System.out.println();
	}
	
	public static void writeNewLine(){
		write(null);
	}
}