package by.epam.course.basic.hw.l2.task12;

/**
 * @author Kiryl_Miatlitski
 *
 * @date 13 February 2017
 * 
 * @task: 
 * ������� ��������� ����� ����� ����� ��� ���������� ��������� ������, ��������
 * �� ����� � ������ ���������� �� �������.
 */

public class Task12 {
	
	public static void sumNumbersFromArgs(String[] args){
		int sum = 0;
		for (int i = 0; i < args.length; i++){
			//System.out.println(args[i]);
			
			if ((args[i].contains(".")) | (args[i].contains(","))){
				System.out.println("����� � ��������� ������ " + args[i] + " �� ����� �����");
			} else {				
				sum += Integer.parseInt(args[i]);
			}			
		}
		
		System.out.println("����� ����� ����� ���������� ��������� ������ = " + sum);		
	}

}
