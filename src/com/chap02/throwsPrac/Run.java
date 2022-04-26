package com.chap02.throwsPrac;

import java.io.IOException;

public class Run {

	public static void main(String[] args) {
		try {
			methodA();
		} catch (IOException e) {
			System.out.println("main()에서 처리");
		}
	}

	public static void methodA() throws IOException{
		methodB();
	}

	public static void methodB() throws IOException{
		methodC();
	}

	public static void methodC() throws IOException {
//		try {
//		throw new IOException();
//		}catch(IOException e) {
//			System.out.println("예외발생");
//		}
		throw new IOException();
	}
}
