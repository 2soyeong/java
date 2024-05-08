package _01_casting;

import java.util.Scanner;

public class T04_test2 {

	public static void main(String[] args) {
		
		//이름, 성별, 나이, 키를 사용자에게 입력 받아 각각의 값을 변수에 담고 출력하세요.
		/* 
		   이름 : 아무개
		   성별 : 남
		   나이 : 20
		   키 : 180.5
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("이름입력 : ");
		String name = scan.next();		
		System.out.println("성별입력(남/여) : ");
		String gender = scan.next();
		System.out.println("나이 입력 : ");
		int age = scan.nextInt();	
		System.out.println("키 입력(cm) : ");
		double key = scan.nextDouble();
		
		
		/*키 180.5cm인 20살 남자 아무개님 반갑습니다^^
		*/
		
		System.out.println("키" + key + "cm인" + age + "살"+ gender + "자" + name + "님 반갑습니다^^");
		System.out.printf("키 %.2fcm인 %살 %s자 %s님 반갑습니다^^", key, age, gender, name);
		
		
		//키보드로 정수 두 개를 입력 받아 두 수의 합, 차, 곱, 나누기한 몫을 출력하세요.
		/*첫 번째 정수 : 23, 두 번째 정수 : 7
		더하기 결과 : 30
			빼기 결과 : 16
			곱하기 결과 : 161
			나누기 몫 결과 : 3
		 */
		
		System.out.print("첫번째 정수 : ");
		int num1 = scan.nextInt();
		System.out.print("두번째 정수 : ");
		int num2 = scan.nextInt();
		
		System.out.println("더하기한 결과 : " + (num1 + num2));
		System.out.println("빼기한 결과 : " + (num1 - num2));
		System.out.println("곱하기한 결과 : " + num1 * num2);
		System.out.println("나눈 몫의 결과 : " + num1 / num2);
		
		
		//키보드로 가로, 세로 값을 값을 실수형으로 입력 받아 사각형의 면적과 둘레를 계산하여 출력하세요.
		/*가로 : 13.5,  세로 : 41.7
		 * 면적 : 562.95, 둘레 : 110.4
		 */
		
		System.out.print("가로 : ");
		double width = scan.nextDouble();
		System.out.print("세로 : ");
		double height = scan.nextDouble();
		
		double area = width * height;
		double cir = (width + height)* 2;
		System.out.println("면적 : " + area);
		System.out.println("둘레 : " + cir);
		
		
		//영어 문자열 값을 키보드로 입력 받아 문자에서 앞에서 세 개를 출력하세요.
		/*문자열을 입력하세요 : apple

   			첫 번째 문자 : a
   			두 번째 문자 : p
   			세 번째 문자 : p
		 */
		
		
		System.out.print("문자열 입력 : ");
		String str = scan.next();
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));
		
		/*char ch1 = str.charAt(0);
		char ch2 = str.charAt(1);
		char ch3 = str.charAt(2);
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		*/
		
		
		
		
		
		
	}

}
