package by.epam.course.basic.hw.l2.task8;

import by.epam.course.basic.hw.l2.main.Main;

/**
 * @author Kiryl_Miatlitski
 *
 * @date 13 February 2017
 * 
 * @task: 
 * ��������� ������ ��� ����� a � b, ���� a=b, �� ������� �� ����� ����� ������ �����
 * ���!�, � ��������� ������ ������ ������ ����� � � ������� �� ����� 3 ������ :
 * -�������� ��������� a+b+c
 * -�������� ��������� a^2 + b^2
 * -���� ������� ���������� �������
 */
public class Task8 {

	public static void checkTwoNumbers2(int a, int b){
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		if (a == b) {
			System.out.println("����� ����� ���!");
		} else {
			int c = 0;
			int result = 0;
			c = Main.getIntFromConsole("������� ����� �: ");
			result = a + b + c;
			System.out.println("�������� ��������� a+b+c = " + result );
			result = a * a + b * b;
			System.out.println("a^2 + b^2 = " + result );
			System.out.println("��� ������� ���������� �������");
			
		}
	}
}
