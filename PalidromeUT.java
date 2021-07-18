package com.q5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PalidromeUT {

    static boolean isPalindrome(String str)
    {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;

            i++;
            j--;
        }

        return true;
    }
    public void check() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String to check palidrom or not::");
        String str = scanner.next();
        if (isPalindrome(str)) {
            System.out.println("True");
            add(str);
        }
        else
            System.out.print("False");
    }

    private void add(String str) {
        Queue<String> queue = new LinkedList<String>();
        if (queue.isEmpty()){
            System.out.println("Empty String");
        }
        queue.add(str);
        System.out.println("Added in que");
    }
}

