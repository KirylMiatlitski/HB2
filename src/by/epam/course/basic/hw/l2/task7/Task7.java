package by.epam.course.basic.hw.l2.task7;

/**
 * @author Kiryl_Miatlitski
 *
 * @date 12 February 2017
 * 
 * @task: 
 * ��������� ������ ��� ����� a � b, ���� � > b, �� ��������� ������ ������ ����� � �
 * ������� ����� b+c. ���� �=b, �� ��������� �������� ����� �������. ���� �<b, ��
 * ��������� ������ ������ ����� �, ������� ����� a+b+c, ������� �� ����� �����
 * a+b+c � ����� ������ ���!�.
 */

import java.util.Random;
public class Task7 {
	
	public static void checkTwoNumbers(int a, int b){
		int c = 0;
		int result = 0;
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);
		if (a > b){
			c = getNumberC();
			result = b + c;
			System.out.println("b + c = " + result);
		} else if (a == b){
			System.out.println("�����");
		} else {
			c = getNumberC();
			result = a + b + c;
			System.out.println("a + b + c = " + result);
			System.out.println("����� ���!");
			
		}
	}
	
	public static int getNumberC(){
		Random rm = new Random();
		int _c=rm.nextInt();
		System.out.println("��������� ����� � = " + _c);
		return _c;
	}

}
