package by.epam.course.basic.hw.l2.task9;

import by.epam.course.basic.hw.l2.main.Main;

/**
 * @author Kiryl_Miatlitski
 *
 * @date 13 February 2017
 * 
 * @task: 
 * ѕрограмма запрашивает количество чисел, затем вводит целые числа в соответствии
 * с указанным количеством. ќпредел€ет количество четных, сумму кратных 3-м и
 * количество чисел, модуль которых <3
 */

public class Task9 {
	
	public static void doWithNumbers(int n){
		int tmp = 0;
		int count2KNumbers = 0;
		int sum3KNumbers = 0;
		int countMod3Numbers = 0;
		for (int i = 0; i < n ; i++){
			tmp = Main.getIntFromConsole("¬ведите целое число: ");
			if (tmp % 2 == 0){
				count2KNumbers++;
			}
			if (tmp % 3 == 0){
				sum3KNumbers += tmp;
			}
			if (Math.abs(tmp) < 3){
				countMod3Numbers++;
			}
		}
		
		System.out.println("количество четных чисел: " + count2KNumbers);
		System.out.println("сумму чисел кратных 3-м: " + sum3KNumbers);
		System.out.println("количество чисел, модуль которых <3: " + countMod3Numbers);
	}

}
