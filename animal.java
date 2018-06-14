package interfacecode;

public interface animal {
	final static String Hello="Hello";
	final static int i = 10;	
	
	public default void oldfunction(){
	System.out.println("old function is caliing");	
	};
	public void speak();
	 public void eat();

}
