package by.epam.course.basic.hw.l2.task13;

/**
 * @author Kiryl_Miatlitski
 *
 * @date 13 February 2017
 * 
 * @task: 
 * Вычислить значение выражения по формуле (все переменные принимают
 * действительные значения):
 */

import java.lang.Math.*;

public class Task13 {
	
	public static void doExecuteFormulaA(double a, double b, double c){
		double result = 0;
		result = b + Math.sqrt(b * b + 4 * a * c);
		result = result / 2 * a;
		result = result - a * a * a * c + b;
		System.out.println("Результат по формуле А = " + result);
	}
	
	public static void doExecuteFormulaB(double a, double b, double c, double d){
		double result = 0;
		result = a / c;
		result = result * b / d;
		result = result * c * d - (a * b - c);
		System.out.println("Результат по формуле B = " + result);
		
	}
}
