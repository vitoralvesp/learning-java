// Exercise One ) Write a Java code to read two integers numbers informed by user. Each number needs to be saved on distinct variables and switch variable values after. 


package FirstList;

public class ExOne {
	
	int value_one = 0;
	int value_two = 0;
	
	public ExOne(int x, int y) {
		value_one = x;
		value_two = y;
	}
	
	public String Getter() {
		String values = String.format("value_one -> %d\nvalue_two -> %d", value_one, value_two);
		return values;
	}
	
}
