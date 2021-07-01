package com.icr7.covid19;

import java.util.ArrayList;
import java.util.Scanner;

public class myApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Details obj[] = new Details[3];

		for (int i = 0; i < 3; i++) {
			String name = sc.nextLine();
			int age = sc.nextInt();
			Boolean status = sc.nextBoolean();
			sc.nextLine();
			String location = sc.nextLine();
			obj[i] = new Details(name, age, status, location);
		}
		Boolean search = sc.nextBoolean();
		String names[] = searching(obj, search);

		for (String x : names) {
			System.out.println(x);
		}

	}

	public static String[] searching(Details obj[], Boolean search) {
		ArrayList<String> naam = new ArrayList<>();
		for (int i = 0; i < obj.length; i++) {
			if (obj[i].isStatus()==search) {
				naam.add(obj[i].getName());
			}
		}
		String[] temp = naam.toArray(new String[naam.size()]);
		return temp;
	}

}
