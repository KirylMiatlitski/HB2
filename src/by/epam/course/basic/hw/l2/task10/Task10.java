package by.epam.course.basic.hw.l2.task10;

import by.epam.course.basic.hw.l2.main.Main;

/**
 * @author Kiryl_Miatlitski
 *
 * @date 13 February 2017
 * 
 * @task: 
 * ѕрограмма вводит количество чисел N, а затем N вещественных чисел. ѕрограмма
 * усекает вещественные числа и определ€ет, сколько среди усеченных чисел четных
 * и >15.
 */

public class Task10 {

	public static void doWithNumbers(int n){
		double tmp = 0;
		long tmp2 = 0;
		int countNumbers = 0;
		
		for (int i = 0; i < n ; i++){
			tmp = Main.getDoubleFromConsole("¬ведите вещественное число: ");
			tmp2 = (long) tmp;
			
			if ((tmp2 % 2 == 0) & (tmp2 > 15)){
				countNumbers++;
			}			
		}
		
		System.out.println("количество четных чисел и > 15: " + countNumbers);
	
	}
}
