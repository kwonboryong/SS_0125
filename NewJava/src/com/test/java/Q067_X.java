package com.test.java;

import java.util.Arrays;
import java.util.Scanner;

public class Q067_X {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("삽입 위치: ");
		int index = scan.nextInt();
		System.out.print("값: ");
		int value = scan.nextInt();
		
		
		int[] nums = {5, 6, 1, 3, 2, 8, 7, 4, 10, 9};
		System.out.println("원본: " + Arrays.toString(nums));

		
		for (int i = nums.length-2; i >= index; i--) { // 배열 삽입 for문
			nums[i+1] = nums[i];
			
		}
		
		nums[index] = value; // 삽입값 대입
		
		System.out.println("결과: " + Arrays.toString(nums));
		
		//------------------------------
		
		
		//printArray(nums);
		
		
	}

	
	private static void printArray(int[] a) {
		int[] list = { 5, 6, 1, 3, 2, 0, 0, 0, 0, 0 };

		int[] temp = new int[list.length];

		
		for (int i = 0; i < list.length; i++) {

			temp[i] += list[i];

		}

		System.out.println(Arrays.toString(list));

	}

}
