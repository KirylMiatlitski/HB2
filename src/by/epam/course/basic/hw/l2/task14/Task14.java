package by.epam.course.basic.hw.l2.task14;

/**
 * @author Kiryl_Miatlitski
 *
 * @date 13 February 2017
 * 
 * @task: 
 * Даны три действительных числа. Возвести в квадрат те из них, значения которых
 * неотрицательны, и в четвертую степень — отрицательные
 */

public class Task14 {
	
	public static void doWithNumbers(double a){
		if (a >= 0){
			System.out.println(a * a);
		} else {
			System.out.println(a * a * a * a);
		}
		
	}

}
