package by.epam.course.basic.hw.l2.task11;

import by.epam.course.basic.hw.l2.main.Main;

/**
 * @author Kiryl_Miatlitski
 *
 * @date 13 February 2017
 * 
 * @task: 
 * ��������� ����������� ���������� �����, ������ ����� ����� � ������������ �
 * ���������� ����������� ,����������, ������� ����� ������ 15 ��� <2, ���� �����
 * ����� �����, ������� ������� �� 5 � �������� 4. ��������� ������� �� �����.
 */

public class Task11 {

	public static void doWithNumbers(int n){
		int tmp = 0;
		int countMoreThan15orLessThan2 = 0;
		int sumNumbersMod5with4 = 0;
		
		for (int i = 0; i < n ; i++){
			tmp = Main.getIntFromConsole("������� ����� �����: ");
			if ((tmp > 15) | (tmp < 2)){
				countMoreThan15orLessThan2++;
			}
			if (tmp % 5 == 4){
				sumNumbersMod5with4 += tmp;
			}			
		}
		
		System.out.println("����� ������ 15 ��� <2: " + countMoreThan15orLessThan2);
		System.out.println("����� �����, ������� ������� �� 5 � �������� 4: " + sumNumbersMod5with4);
	
	}
}
