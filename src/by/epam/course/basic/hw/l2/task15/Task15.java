package by.epam.course.basic.hw.l2.task15;

/**
 * @author Kiryl_Miatlitski
 *
 * @date 13 February 2017
 * 
 * @task: 
 * ��������� ��������� ��� ���������� �������� ������� F(x) �� ������� [�, b] �
 * ����� h. ��������� ����������� � ���� �������, ������ ������� ������� � ��������
 * ���������, ������ - ��������������� �������� �������:
 */



public class Task15 {

	public static void doCalculation(double a,  double b, double h){
		System.out.println("���     �������� �������");
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
