package Lab1;
import java.util.ArrayList;
import java.util.List;

public class Lab {
	public static void main(String[] args) {
//		int x =1;
//		System.out.println(func_3(func_2(func_1(x),x),x,func_1(x)));
//	}
//	static int func_1(int y) {
//		System.out.println(y);
//		return y+1;
//	}
//	static int func_2( int x, int y){
//		System.out.println(x);
//		return x+y;
//	}
//	static int func_3(int x, int y, int z) {
//		return x+ y+ z;
//	}
		int [] array = {1,2,3,4};
		func_1();
		int x = func_2();
		System.out.println(x);
		func_3(x);
		System.out.println(x);
		x = func_4(x);
		int [] array_2 = func_5();
		print(array);
		print(array_2);
		array_2 = func_6(array);
		print(array);
		print(array_2);
		func_7(array);
		print(array);
		print(array_2);
	}
	static void func_1() {
		int x = 1;
		System.out.println(x);
	}
	static int func_2() {
		int x = 2;
		return x;
	}
	static void func_3(int x) {
		int y =1;
		x = x+y;
		System.out.println(x);
	}
	static int func_4(int x) {
		int y = 3;
		x = x+y;
		System.out.println(x);
		return x;
	}
	static int[] func_5() {
		int[] array = {5,6,7,8};
		return array;
	}
	static int[] func_6(int[] array) {
		array[0] =99;
		return array;
	}
	static void func_7(int[] array) {
		array[3] =99;
	}
	static void print(int[] ar) {
		for(int i=0; i< ar.length; i++)
			System.out.print(ar[i] + "\t");
		System.out.println();}
//	
	/**
     * Returns the student ID as a string.
     *
     * @return The student ID as a string.
     */
	public static String getMyID() {
		String studentnumber = "219684893";
		return studentnumber;
		}
	/**
     * Returns the equivalent letter grade based on the provided percentage.
     *
     * @param grade The percentage grade.
     * @return The equivalent letter grade.
     * @pre The input grade is a double number between zero and 100 inclusive.
     */
	public static String getLetterGrade(double grade) {
		if(grade >=90) {
			return "A+";
		}else if (grade >=80) {
			return "A";
		}else if (grade >=75) {
			return "B+";
		}else if (grade >=70) {
			return "B";
		}else if (grade >=65) {
			return "C+";
		}else if (grade >=60) {
			return "C";
		}else if (grade >=55) {
			return "D+";
		}else if (grade >= 50) {
			return "D";
		}else if (grade >=45) {
			return "E";
		}else {
			return "F";
		}
	}
	/**
     * Adds and changes the scale of grades in the given ArrayList.
     *
     * @param grades The ArrayList of grades (out of 100).
     * @return The total of the grades at the scale of 10 with two decimal points.
     */
	public static double addAndChangeScale(ArrayList<Double> grades) {
		double totalgrade =0;
		for(double grade : grades) {
			totalgrade += grade;
		}
		double scaledtotal = (totalgrade/ grades.size())* 0.1;
		return Math.round(scaledtotal *100.0)/100.0;
	}
}
