package com.chap01.runtime;

import java.io.IOException;
import java.util.Scanner;

import com.chap02.throwsPrac.Run;

public class RuntimeException {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		RuntimeException re = new RuntimeException();
		// re.test1();
		re.test2();
	}

	public void test1() {
		int no = 100;

		System.out.print("나누는 수 하나 입력: ");
		int inputNum = sc.nextInt();

//		if (inputNum == 0) {
//			System.out.println("0을 입력했습니다.");
//		} else {
//			int res = no / inputNum;
//			System.out.println("나누기 결과: " + res);
//		}

		// try catch 처리
		try {
			int res = no / inputNum;
			System.out.println("나누기 결과: " + res);
		} catch (ArithmeticException e) {
			System.out.println("Exception 발생");
		}

	}

	public void test2() {
		try {
		// ClassCastException
		  /*Object obj = 'a';
			System.out.println(obj);
			String str = (String)obj;
			System.out.println(str);*/
			
		// ArrayIndexOutOfBoundsException
		  /*int arr[] =new int[2];
			arr[0]=1;
			arr[1]=2;
			
			arr[2]=3;
			System.out.println("이거 실행 될까?");*/
			
		// NullPointerException
			String str= null;
			int length = str.length();
			
			
		} catch (ClassCastException e) {
			System.out.println("예외 발생! 형변화 불가");
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("이건 배열의 버뮈를 넘어가서 발생되는 예외야!!");
			System.out.println(e.getMessage());
		} catch (NullPointerException e) {
			System.out.println(" null 인디?");
		} catch (Exception e) { //뒤에 와야함 다형성 때문!
			
			
		} finally {
			System.out.println("여기까지 실행!!");
		}
	
	}
	
	public void test3() {
		Run r = new Run();
		try {
			r.methodB();
		} catch (IOException e) { 
			e.printStackTrace();
		}
	}
	
	
}
