/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testexample;

import java.util.Scanner;

/**
 *
 * @author tanjotsingh
 */
public class TestExample {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter Username");
        String uname = input.nextLine();
        boolean isValidUname = UsernameValidator.checkUsername(uname);
        System.out.println("The username is valid: "+isValidUname);
    }
    

}

class UsernameValidator {
    // Method to check if the username is valid
    public static boolean checkUsername(String username) {
        // Define the minimum and maximum length for the username
        int minLength = 5;
        int maxLength = 20;

        // Check if the username length is within the allowed range
        if (username.length() < minLength || username.length() > maxLength) {
            return false;
        }

        // If all checks passed, the username is valid
        return true;
    }
}
