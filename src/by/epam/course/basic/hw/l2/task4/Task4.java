package by.epam.course.basic.hw.l2.task4;

/**
 * @author Kiryl_Miatlitski
 *
 * @date 12 February 2017
 * 
 * @task: 
 * �������� ��������� ���������� ���������� � ������� ��������������
 * ������������ �� ���� �������.
 */

import static java.lang.Math.sqrt;

public class Task4 {

	public static void findSquareAndHypotenuse( double a, double b ){
		double c=0;
		double square=0;
		
		c = sqrt(a * a + b * b);
		square = 0.5 * a * b;
		
		System.out.println("���������� = " + c);
		System.out.println("������� ������������ = " + square);
	}
}
