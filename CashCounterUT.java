package com.que_04;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CashCounterUT {
    public static final int initialAmmount=0;
    public void depositOrCredi() {
        Scanner scanner = new Scanner(System.in);

        Queue<Integer> ll = new LinkedList<Integer>();
        System.out.println("Already ammount in account::" +ll.peek());

        System.out.println("Press 1. to Credit ammount");
        System.out.println("Press 2. to Withdraw ammount");
        int Check = scanner.nextInt();

        switch (Check){
            case 1:
                System.out.print("Enter ammount to credit::");
                int credit = scanner.nextInt();
                credit(credit);
                break;
            case 2:
                System.out.print("Enter ammount to debit::");
                int withdraw = scanner.nextInt();
                withdraw(withdraw);
                break;
        }
    }

    private void withdraw(int withdraw) {
        int newCount1 = initialAmmount-withdraw;
        check(newCount1);
    }

    private boolean check(int newCount1) {
        if (newCount1<0){
            System.out.println(false);
            return false;
        }
        else {
            System.out.println(true);
            return true;
        }
    }

    private void credit(int credit) {
        int newCount = initialAmmount + credit;
        System.out.println("Total account balance::" +newCount);
    }
}
