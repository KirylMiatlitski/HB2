package by.epam.course.basic.hw.l2.task15;

/**
 * @author Kiryl_Miatlitski
 *
 * @date 13 February 2017
 * 
 * @task: 
 * —оставить программу дл€ вычислени€ значений функции F(x) на отрезке [а, b] с
 * шагом h. –езультат представить в виде таблицы, первый столбец которой Ц значени€
 * аргумента, второй - соответствующие значени€ функции:
 */



public class Task15 {

	public static void doCalculation(double a,  double b, double h){
		System.out.println("Ўаг     «начение функции");
		for (double i = a; i <= b; i += h){
			doFunction(i);
		}
	}
	
	static void doFunction(double x){
		double result = 0;
		result = 2 * Math.tan(x / 2) + 1;
		System.out.println(x + "    " + result);
	}
}
