package loopsConcept;

public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// If the number of iteration is not fixed and you must have to execute the loop
		// at least once, it is recommended to use a do-while loop.
		// initialization;do{Statement(s);increment;} while(condition);
		String[] color = new String[5];
		// Create object
		color[0] = "Red";
		color[1] = "White";
		color[2] = "Blue";
		color[3] = "Black";
		color[4] = "Green";
		int i = 0;
		do {
			System.out.println(color[i]);
			i = i + 1;
		} while (i < color.length);}}
