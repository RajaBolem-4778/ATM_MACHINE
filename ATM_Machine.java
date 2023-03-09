package ATMMachine;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class ATM_Machine {

	float Balance = 0;
	int PIN = 2102;

	public void checkPin() {
		System.out.println("Enter your PIN : ");
		Scanner sc = new Scanner(System.in);
		int pin_Number = sc.nextInt();
		if (pin_Number == PIN) {
			menu();

		} else {
			System.out.println("Please enter valid PIN : ");
		}

	}

	public void menu() {
		System.out.println("Enter your Choice : ");
		System.out.println("1. Check A/C Balance : ");
		System.out.println("2. Deposit Money : ");
		System.out.println("3. Withdraw Money : ");
		System.out.println("4. EXIT : ");

		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		if (option == 1) {
			checkBalance();
		} else if (option == 2) {
			deposite();
		} else if (option == 3) {
			withdraw();
		} else if (option == 4) {
			System.out.println("Process finished with exit code 0");;
		} else {
			System.out.println("Please enter a valid choice...");
		}
	}

	private void checkBalance() {
		// TODO Auto-generated method stub
		System.out.println("Balance : " + Balance);
		menu();
	}

	private void deposite() {
		// TODO Auto-generated method stub
		System.out.println("Enter the amount to be deposited : ");
		Scanner sc = new Scanner(System.in);
		int deposit = sc.nextInt();
		Balance = Balance + deposit;
		System.out.println("Amount Deposited Successfully...");
		menu();
	}

	private void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("Enter the amount to be Withdrawn : ");
		Scanner sc = new Scanner(System.in);
		int withdraw = sc.nextInt();
		if (withdraw > Balance) {
			System.out.println("Insufficient Balance");
		} else {
			Balance = Balance - withdraw;
			System.out.println("Amount Withdrawn Successfully...");
			menu();
		}
	}

	public static void main(String[] args) {
		ATM_Machine obj = new ATM_Machine();
		obj.checkPin();
	}
}
//		try {
//			
//		
//		Class.forName("com.mysql.jdbc.Driver");
//		Connection con = DriverManager.getConnection("jdbc.mysql://localhost:3306/ATM","root","Junnu@4778");
//		Statement stmt = con.createStatement();
//		ATM_Machine obj = new ATM_Machine();
//		obj.checkPin();
//	}catch(Exception e) {
//		System.out.println(e);
//		System.out.println("Thank you...!");
//		}
//}
//	
		
