package com.addressBookSystem;

import java.util.Scanner;

public class AddressBookSystem {
	public void addressBook() {

		System.out.println("Welcome to address book program");

		String name, lastName, address, city, state, emailId;
		int zipCode, mobileNumber;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first name");
		name = sc.nextLine();

		System.out.println("Enter your last name");
		lastName = sc.nextLine();

		System.out.println("Enter your address");
		address = sc.nextLine();

		System.out.println("Enter your city");
		city = sc.nextLine();

		System.out.println("Enter your state");
		sc.nextLine();

		System.out.println("Enter your email id");
		emailId = sc.nextLine();
		System.out.println("Enter your zip code");
		zipCode = sc.nextInt();

		System.out.println("Enter your mobile nuber");
		mobileNumber = sc.nextInt();

		System.out.println(name + "" + lastName);
		System.out.println(address + " " + city + " " + zipCode + " ," + mobileNumber + " " + emailId);

	}

	public static void main(String[] args) {
		AddressBookSystem addressObject = new AddressBookSystem();
		addressObject.addressBook();
	}
}
