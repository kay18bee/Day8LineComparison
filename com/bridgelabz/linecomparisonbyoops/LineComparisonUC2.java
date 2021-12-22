package com.bridgelabz.linecomparisonbyoops;

public class LineComparisonUC2 {
	
	 LineComparisonUC2(double a, double b) {
	        System.out.println("Equals Method Result:");
	         Double l1 = a;
	         Double l2 = b;

	        if (l1.equals(l2)) {
	            System.out.println("Both line 1 and 2 have same length of " + a);
	        }else {
	            System.out.println("Both have different length");
	        }    
    }
}
