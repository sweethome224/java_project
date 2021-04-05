package com.ict02.array;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 번호, 국어,영어,수학점수를 입력받아서
		// 번호, 총점, 평균, 학점, 순위를 구하고 정렬하자
		
		int[][] arr = new int[5][5];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("번호 : ");
			int no = scan.nextInt();
			
			System.out.print("국어 : ");
			int kor = scan.nextInt();
			
			System.out.print("영어 : ");
			int eng = scan.nextInt();
			
			System.out.print("수학 : ");
			int math = scan.nextInt();
			
			int sum = kor + eng + math;
			int avg = sum / 3 ;
			int hak = 0 ;
			if(avg>=90) {
				hak = 'A';
			}else if(avg>=80) {
				hak = 'B';
			}else if(avg >=70) {
				hak = 'C';
			}else {
				hak = 'F';
			}
			int rank = 1 ;
			
			arr[i][0] = no;
			arr[i][1] = sum;
			arr[i][2] = avg;
			arr[i][3] = hak;
			arr[i][4] = rank;
		}
		
		// 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
	}
}









