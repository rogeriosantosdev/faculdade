package application;

public class Program {
	public static void main(String[] args) {
		int x = 20;
		
		Object obj = x;
		Integer obj2 = x;
		
		System.out.println(obj);
	
		int y = (int) obj;
		int y2 = obj2 * 2;
		
		System.out.println(y);
		System.out.println(y2);
	}
}
