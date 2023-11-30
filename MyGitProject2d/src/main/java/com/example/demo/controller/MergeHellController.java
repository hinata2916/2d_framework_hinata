
package com.example.demo.controller;

import java.util.Random;

public class MergeHellController {
	public static void main(String[] args) {
		kadaiA();
		kadaiB();
		kadaiC();
	}

		static void kadaiA() {
	
	for(int i = 0; i <= 10; i++) {
		System.out.println("現在i回目のループです");
	}
		}


		static void kadaiB() {
	        Random random = new Random();
	        
	        int randomNumber = random.nextInt(100) + 1;
	       
			System.out.println(randomNumber + "が出ました!");
		}


	static void kadaiC() {
		int a = 50;
		int b = 75;
		int c = a + b;
		System.out.println(c);
	}
}

