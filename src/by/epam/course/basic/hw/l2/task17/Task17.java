package by.epam.course.basic.hw.l2.task17;

public class Task17 {
	
	public static void calculateFunction(double x){
		if (x <= -3){
			System.out.println("F(x)= 9");
		} else if (x > 3){
			double result = 0;
			result = 1 / (x * x + 1);
			System.out.println("F(x)= " + result);
		} else {		
			System.out.println(Double.NaN);
		}
	}

}
