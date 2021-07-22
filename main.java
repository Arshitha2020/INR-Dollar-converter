package hello;

import java.util.*;

class DolToInr{
	double dti(double d) {
		double in;
		in= d * 74.46;
		return in;
	}
}
class InrToDol{
	double in(double i) {
		double dou;
		dou = i / 74.46;
		return dou;
	}
	
}
 class main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("INR - DOLLAR conerter\nChoose : \n 1) Dol to Inr\n 2) Inr to Dol\n");
		int n = sc.nextInt();
		if(n==1) {
			System.out.println("Enter your amount in Dollars");
			int dollar = sc.nextInt();
			DolToInr d1 = new DolToInr();
			System.out.println(d1.dti(dollar));
			
					
		}else {
			System.out.println("Enter your amount in Rupees");
			int rupee = sc.nextInt();
			InrToDol d2 = new InrToDol();
			System.out.println(d2.in(rupee));
			
		}
		
		
	}
}
	


