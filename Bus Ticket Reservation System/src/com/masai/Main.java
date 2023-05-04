package com.masai;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import java.util.Scanner;


public class Main {
	
	public static void adminFunctionality() {
		
	}
	public static void customerSingninFunctionality() {
		
	}
	public static void customerSignupFunctionality() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("bn");
	Scanner sc = new Scanner(System.in);

	System.out.println("Welcome , in Electricity Bill Payment System");

	try {

		int preference = 0;
		do {
			System.out.println("Please enter your preference, " + " '1' --> Admin login , '2' --> Customer login , "
			+ "'3' for Customer signup, '0' for exit");
			preference = sc.nextInt();
			switch (preference) {
			case 1:
				adminFunctionality();
				break;
			case 2:
				customerSingninFunctionality();
				break;
			case 3:
				customerSignupFunctionality();
				break;

			case 0:
				System.out.println("successfully existed from the system");

				break;

			default:
				throw new IllegalArgumentException("Invalid Selection");
			}

		}

		while (preference != 0);

	} catch (Exception e) {

		System.out.println(e.getMessage());
	}

}
	}



