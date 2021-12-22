package com.bridgelabz.linecomparisonbyoops;

import java.util.Scanner;

public class LineComparisonUC4 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter co-ordinates for line 1: ");
        System.out.println("Enter the value of x1 and y1:");
        double x1 = scanner.nextInt();
        double y1 = scanner.nextInt();

        System.out.println("Enter the value of x2 and y2");
        double x2 = scanner.nextInt();
        double y2 = scanner.nextInt();

        System.out.println("Enter co-ordinates for line 2: ");
        System.out.println("Enter the value of x3 and y3:");
        double x3 = scanner.nextInt();
        double y3 = scanner.nextInt();

        System.out.println("Enter the value of x4 and y4");
        double x4 = scanner.nextInt();
        double y4 = scanner.nextInt();

        LineComparisonUC1 measurement = new LineComparisonUC1();
        double a = measurement.LineComparisonUC1(x1, y1, x2, y2);
        double b = measurement.LineComparisonUC1(x3, y3, x4, y4);
        new LineComparisonUC2(a,b);
        new LineComparisonUC3(a,b);
    }

}
