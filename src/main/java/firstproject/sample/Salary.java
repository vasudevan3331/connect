package firstproject.sample;

import java.util.Scanner;

public class Salary {
	public static void main(String[] args) {
		Scanner income=new Scanner(System.in);
		double salary=0;
		System.out.println("enter the annual income");
		salary=income.nextDouble();
		System.out.println("you dont want to the pay tax  "+(salary<2.5));
		System.out.println("you should want to the pay tax  "+(salary>=2.5));
		income.close();
	}

}
