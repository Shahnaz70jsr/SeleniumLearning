package loopsConcept;
import java.util.Iterator;
import com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer;
public class Foorloop3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String[] obj = new String[6];
	obj[0] = "beetle";obj[1] = "spider";obj[2] = "cockroach";obj[3] = "ladybirdbeetle";
	obj[4] = "caterpiller";obj[5] = "bee";
    //For printing all value.
	for(int i=0;i<obj.length; i=i+1) {System.out.println(obj[i]);}
	System.out.println("*******************");
    //For printing harmful insect (even no.)name
	for(int i=0;i<obj.length; i=i+2) {System.out.println(obj[i]);}
	System.out.println("*******************");
    //For printing Useful insect (odd no.)name
	for (int i =1 ; i < obj.length; i=i+2) {System.out.println(obj[i]);}
    //for loop syntax:for (initialization; condition; increment) {statement(s)}.increase odd number
    for(int j=1; j <= 10; j=j+2) {System.out.println(j);
    System.out.println("*******************");}}}

	
		
	
	


	
	
	
	
	


