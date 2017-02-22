package by.epam.course.basic.hw.l2.main;

import java.util.Random;
import java.util.Scanner;

import by.epam.course.basic.hw.l2.task10.Task10;
import by.epam.course.basic.hw.l2.task11.Task11;
import by.epam.course.basic.hw.l2.task12.Task12;
import by.epam.course.basic.hw.l2.task13.Task13;
import by.epam.course.basic.hw.l2.task14.Task14;
import by.epam.course.basic.hw.l2.task15.Task15;
import by.epam.course.basic.hw.l2.task16.Task16;
import by.epam.course.basic.hw.l2.task17.Task17;
import by.epam.course.basic.hw.l2.task2.Task2;
import by.epam.course.basic.hw.l2.task3.Task3;
import by.epam.course.basic.hw.l2.task4.Task4;
import by.epam.course.basic.hw.l2.task5.Task5;
import by.epam.course.basic.hw.l2.task6.Task6;
import by.epam.course.basic.hw.l2.task7.Task7;
import by.epam.course.basic.hw.l2.task8.Task8;
import by.epam.course.basic.hw.l2.task9.Task9;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Задание 1
		System.out.println("Task #1:");
		System.out.println("Hello, world");
		
		// Задание 2
		System.out.println("");
		System.out.println("Task #2:");
		Task2.printFamily();
		
		// Задание 3
		System.out.println("");
		System.out.println("Task #3:");
		Task3.printText();
		
		// Задание 4
		double a = 0;
		double b = 0;
		System.out.println("");
		System.out.println("Task #4:");
		a = getDoubleFromConsole("Введите первую сторону прямоугольного треугольника: ");
		b = getDoubleFromConsole("Введите вторую сторону прямоугольного треугольника: ");
		Task4.findSquareAndHypotenuse(a, b);
		
		// Задание 5
		double num1 = 0;
		double num2 = 0;
		double num3 = 0;
		double num4 = 0;
		System.out.println("");
		System.out.println("Task #5:");
		num1 = getDoubleFromConsole("Введите первое слагаемое: ");
		num2 = getDoubleFromConsole("Введите второе слагаемое: ");
		num3 = getDoubleFromConsole("Введите третье слагаемое: ");
		num4 = getDoubleFromConsole("Введите четвёртое слагаемое: ");
		Task5.sumFourNumbers(num1, num2, num3, num4);
		
		// Задание 6
		a = 0;
		b = 0;
		double c = 0;
		System.out.println("");
		System.out.println("Task #6:");
		a = getDoubleFromConsole("Введите число a:");
		b = getDoubleFromConsole("Введите число b:");
		c = getDoubleFromConsole("Введите число c:");
		Task6.findResult(a, b, c);
		
		// Задание 7		
		int a1 = 10;
		int b1 = 12;
		System.out.println("");
		System.out.println("Task #7");
		Task7.checkTwoNumbers(a1, b1);
		
		// Задание 8		
		int a2 = 10;
		int b2 = 12;
		System.out.println("");
		System.out.println("Task #8");
		Task8.checkTwoNumbers2(a2, b2);

		// Задание 9		
		int n = 0;
		System.out.println("");
		System.out.println("Task #9");
		n = Main.getIntFromConsole("Введите количество чисел (небольшое =) ):");
		Task9.doWithNumbers(n);
		
		// Задание 10		
		n = 0;
		System.out.println("");
		System.out.println("Task #10");
		n = Main.getIntFromConsole("Введите количество чисел (небольшое =) ):");
		Task10.doWithNumbers(n);
		
		// Задание 11		
		n = 0;
		System.out.println("");
		System.out.println("Task #11");
		n = Main.getIntFromConsole("Введите количество чисел (небольшое =) ):");
		Task11.doWithNumbers(n);
		
		// Задание 12		
		System.out.println("");
		System.out.println("Task #12");
		Task12.sumNumbersFromArgs(args);
		
		// Задание 13	
		num1 = 1; // a
		num2 = 2; // b
		num3 = 3; // c
		num4 = 4; // d
		System.out.println("");
		System.out.println("Task #13");
		Task13.doExecuteFormulaA(num1, num2, num3);
		Task13.doExecuteFormulaB(num1, num2, num3, num4);
		
		// Задание 14
		num1 = 2; // первое вещественное число
		num2 = -2; // второе вещественное число
		num3 = 0; // третье вещественное число
		System.out.println("");
		System.out.println("Task #14");
		Task14.doWithNumbers(num1);
		Task14.doWithNumbers(num2);
		Task14.doWithNumbers(num3);
		
		// Задание 15
		a = 1;
		b = 2;
		double h = 0.5;
		System.out.println("");
		System.out.println("Task #15");
		Task15.doCalculation(a, b, h);
		
		// Задание 16
		double r = 10; // Радиус
		System.out.println("");
		System.out.println("Task #16");
		Task16.doCalculation(r);
		
		// Задание 17
		double x = 23;
		System.out.println("");
		System.out.println("Task #17");
		Task17.calculateFunction(x);
	}
	
	public static String getStringFromConsole( String text) {
		Scanner sc = new Scanner(System.in);
		String str = "";
		
		
		System.out.print(text);
		str = sc.next();	
		
		return str;
	}
	
	public static int getIntFromConsole( String text) {
		Scanner sc = new Scanner(System.in);
		int input = 0;
		
		//random input
		Random rand = new Random();
		int temp=0;
		temp = rand.nextInt(100);
		System.out.println("Ввели число "+  temp);
		return temp;
		
		// manual input
		/*System.out.print(text);
		while(!sc.hasNextInt()){
			sc.next();
			System.out.print(text);
		}
		input = sc.nextInt();
		
		return input;*/
	}
	
	public static double getDoubleFromConsole( String text) {
		Scanner sc = new Scanner(System.in);
		double input = 0;
		
		// random input
		Random rand = new Random();
		double temp=0;
		temp = rand.nextDouble();
		System.out.println("Ввели число "+  temp);
		return temp;
		
		
		// manual input
		/*System.out.print(text);
		
		while(!sc.hasNextDouble()){
			sc.next();
			System.out.print(text);
		}
		input = sc.nextDouble();
		
		return input;*/
	}
}
