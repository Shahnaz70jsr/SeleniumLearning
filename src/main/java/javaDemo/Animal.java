package javaDemo;

public class Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		double b = 5.5;
		char c = 'A';
		boolean d  ;
		String e = "naz";
		System.out.println(a+b);
		
			   Animal obj = new Animal();		
				
			   obj.elephant();
			   obj.elephant();
			   obj.elephant();
			   
			   obj.deer();
			   obj.deer();
			   obj.deer();
			   obj.deer();
			   
				obj.lion();
				obj.lion();
				
				
				obj.tiger();
				obj.tiger();
				obj.tiger();
				
				
		
			
		   }
		
		
		
		
		public void elephant() {
			System.out.println("size");
		}	
		private void tiger() {
			System.out.println("weight");
		} 	
		void lion() {
			System.out.println("height");
		}	
		
		protected void deer() {
			System.out.println("Colour");
		}	
	
		public int add (int a,int b) {
			System.out.println(a+b);
			return a+b;}

	

}	
