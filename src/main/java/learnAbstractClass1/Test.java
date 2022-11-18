package learnAbstractClass1;

public class Test {
		public static void main(String[] args) {
	//we can't create object of Abstract class; but we can create reference variable of abstract class
	//MobileUser mu = new MobileUser();		
			//Syntax: ClassName(SuperClass) referenceVariable ;
			Insect_super Ins; //reference variable of super class
			
			// void sendMessage
			
			    Ins = new HonyBee_Sub();
		        Ins.sendMessage();
				
				Ins.call();
				
				Ins = new  Beetle_sub();
				Ins.sendMessage();
				
				Ins.call();
			}

		
		}

	