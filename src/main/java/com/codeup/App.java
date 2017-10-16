package com.codeup;

import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) {
        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a number");
//        String msg = input.nextLine();


        System.out.println("Enter a small sentence:");
        String msg = input.nextLine();
        String flipCase = StringUtils.swapCase(msg);
        System.out.println(flipCase);
        System.out.println("Your sentence is now case flipped");
        System.out.println();

        System.out.println("Enter a number");
        msg = input.nextLine();
        boolean isANumber = StringUtils.isNumeric(msg);
        if(isANumber == true){
            System.out.println("You entered the number " + msg);
            System.out.println();
        } else {
            System.out.println(msg + " is not a number!!");
            System.out.println();
        }


//        boolean isBlank = StringUtils.isBlank("       ");
//        System.out.println(isBlank);

        System.out.println("Enter another sentence:");
        msg = input.nextLine();
        String reversed = StringUtils.reverse(msg);
        System.out.println(reversed);
        System.out.println("Your sentence is now reversed!!");



    }
}
