package by.epam.course.basic.hw.l2.task16;

/**
 * @author Kiryl_Miatlitski
 *
 * @date 13 February 2017
 * 
 * @task: 
 * Вычислить длину окружности и площадь круга одного и того же заданного радиуса R
 */
public class Task16 {
	
	public static void doCalculation(double r){
		System.out.println("Длинна окружности с радиусом R = " + (2*Math.PI*r));
		System.out.println("Площаль круга с радиусом R = " + (Math.PI*r*r));
	}

}
