package by.epam.course.basic.hw.l2.task6;

/**
 * @author Kiryl_Miatlitski
 *
 * @date 12 February 2017
 * 
 * @task: 
 * ѕрограмма запрашивает у пользовател€ a,b,c ,вычислить значение выражени€ a^2-(b-c)^2+ln(b^2+1).
 */

import static java.lang.Math.log;

public class Task6 {
	
	public static void findResult(double a, double b, double c){
		System.out.println("a^2-(b-c)^2+ln(b^2+1) = " + ((a * a) - (b - c) * (b - c) + log(b * b + 1)));
		
	}
}
