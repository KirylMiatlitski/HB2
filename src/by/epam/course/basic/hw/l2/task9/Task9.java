package by.epam.course.basic.hw.l2.task9;

import by.epam.course.basic.hw.l2.main.Main;

/**
 * @author Kiryl_Miatlitski
 *
 * @date 13 February 2017
 * 
 * @task: 
 * ��������� ����������� ���������� �����, ����� ������ ����� ����� � ������������
 * � ��������� �����������. ���������� ���������� ������, ����� ������� 3-� �
 * ���������� �����, ������ ������� <3
 */

public class Task9 {
	
	public static void doWithNumbers(int n){
		int tmp = 0;
		int count2KNumbers = 0;
		int sum3KNumbers = 0;
		int countMod3Numbers = 0;
		for (int i = 0; i < n ; i++){
			tmp = Main.getIntFromConsole("������� ����� �����: ");
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
		
		System.out.println("���������� ������ �����: " + count2KNumbers);
		System.out.println("����� ����� ������� 3-�: " + sum3KNumbers);
		System.out.println("���������� �����, ������ ������� <3: " + countMod3Numbers);
	}

}
