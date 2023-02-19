package Atividades;

import java.util.Scanner;

public class soMadeHcomN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     double h = 0;
	        Scanner sc = new Scanner(System.in);
	        double n = sc.nextDouble();

	        for (int i = 1; i <= n; i++) {
	            h += 1.0 / i;
	        }

	        System.out.printf("%.0f\n", h);
	    }

}


