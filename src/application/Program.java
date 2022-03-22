package application;


import entities.BankAccount;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int id;
        String name;
        char option;
        double balance;
        BankAccount p1;

        System.out.print("Enter account number: ");
        id  = input.nextInt();
        input.nextLine();
        System.out.print("Enter account holder: ");
        name  = input.nextLine();

        System.out.print("Is there an initial deposit (y/n)?");
        option = input.next().charAt(0);

        if(option == 'y'){
            System.out.print("Enter the initial deposit value: ");
            balance = input.nextDouble();
            p1 = new BankAccount(id, name, balance);
        }
        else{
            p1 = new BankAccount(id, name);
        }

        System.out.println("Account data:");
        System.out.println(p1);
        System.out.println();
        System.out.println();
        System.out.print("Enter a deposit value: ");
        balance = input.nextDouble();
        p1.deposit(balance);

        System.out.println("Updated account data:");
        System.out.println(p1);
        System.out.println();
        System.out.println();

        System.out.print("Enter a withdraw value: ");
        balance = input.nextDouble();
        p1.withdraw(balance);
        System.out.println("Updated account data:");
        System.out.println(p1);
        System.out.println();
        System.out.println();
        System.out.print("Would you like to change your account name (y/n)?: ");
        option = input.next().charAt(0);
        if(option == 'y'){
            System.out.print("Please, write your new name: ");
            input.nextLine();
            name = input.nextLine();
            p1.setName(name);
            System.out.println(p1);
        }




    }

}
