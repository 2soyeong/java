package _01_casting;

import java.util.Scanner;

public class T04_test {

	public static void main(String[] args) {
		//1
		
		Scanner scan = new Scanner(System.in);
		System.out.print("문자 1개 입력 : ");
		char ch = scan.next().charAt(0);
		//String ch1 = scan.next();
		
		
		int chUni = ch;
		System.out.println(ch + "의 유니코드 : " + chUni);
				
		
		// 국어, 영어, 수학 점수를 입력받아 총점 출력 평균 출력(소수점 2째자리까지 출력)
		
		System.out.print("국어점수를 입력하세요 : ");
		int kor = scan.nextInt();
		
		System.out.print("영어점수를 입력하세요 : ");
		int eng = scan.nextInt();
		
		System.out.print("수학점수를 입력하세요 : ");
		int math = scan.nextInt();
		
		int sum = kor + eng + math;
		double avg = (double)sum/ 3;
		System.out.println("총점 : " + sum);
		System.out.printf("평균 : %.2f\n", avg);
		
		
		//3
		int iNum1 = 10;
	    int iNum2 = 4;
	    float fNum = 3.0f;
	    double dNum = 2.5;
	    char ch2 = 'K'; 
		
		//4	
		System.out.println(iNum1 + "/" + iNum2 + "의 몫: " + iNum1/iNum2);
		
		//5
		double result = iNum2 * dNum;
		System.out.println(iNum2 + "*" + dNum + "=" + result);
		
		//6
		System.out.println((double)iNum1);
		
		//7
		double result2 = (double)iNum1 / iNum2;
		System.out.println(result2);
		
		//8
		float float1 = iNum1 / fNum;
		System.out.println((int)float1);
		
		int result3 = iNum1 / (int)fNum;
		System.out.println(result3);
		
		//9
		double result4 = (double)iNum1 / fNum;
		System.out.println(result4);
		
		//10
		int result5 = ch;
		System.out.println(result5);
		
		//11
		//char result6 = ch3 + 1;
		char result6 = (char)(ch + 1);
		System.out.println(result6);
		
		
	}

}
