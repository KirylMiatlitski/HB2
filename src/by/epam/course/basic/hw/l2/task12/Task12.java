package by.epam.course.basic.hw.l2.task12;

/**
 * @author Kiryl_Miatlitski
 *
 * @date 13 February 2017
 * 
 * @task: 
 * Создать программу ввода целых чисел как аргументов командной строки, подсчета
 * их суммы и вывода результата на консоль.
 */

public class Task12 {
	
	public static void sumNumbersFromArgs(String[] args){
		int sum = 0;
		for (int i = 0; i < args.length; i++){
			//System.out.println(args[i]);
			
			if ((args[i].contains(".")) | (args[i].contains(","))){
				System.out.println("Число с командной строки " + args[i] + " не целое число");
			} else {				
				sum += Integer.parseInt(args[i]);
			}			
		}
		
		System.out.println("Сумма целых чисел аргументов командной строки = " + sum);		
	}

}
