package by.epam.course.basic.hw.l2.task8;

import by.epam.course.basic.hw.l2.main.Main;

/**
 * @author Kiryl_Miatlitski
 *
 * @date 13 February 2017
 * 
 * @task: 
 * Программа вводит два числа a и b, если a=b, то вывести на экран слова «скоро Новый
 * Год!», в противном случае ввести третье число с и вывести на экран 3 строки :
 * -значение выражения a+b+c
 * -значение выражения a^2 + b^2
 * -«моя любимая футбольная команда»
 */
public class Task8 {

	public static void checkTwoNumbers2(int a, int b){
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		if (a == b) {
			System.out.println("скоро Новый Год!");
		} else {
			int c = 0;
			int result = 0;
			c = Main.getIntFromConsole("Введите число с: ");
			result = a + b + c;
			System.out.println("Значение выражения a+b+c = " + result );
			result = a * a + b * b;
			System.out.println("a^2 + b^2 = " + result );
			System.out.println("моя любимая футбольная команда");
			
		}
	}
}
