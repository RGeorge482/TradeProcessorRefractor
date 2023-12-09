/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package y3tradeprocessorrefractor;

import java.util.Scanner;

/**
 *
 * @author 35386
 */
public class DataIOMenu {
       public DataIOTypes makeMenu(String message) {
        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        while (true) {
//            for (int optionNum = 0; optionNum < DataIOTypes.values().length)
                int optionNum = 1;
                for (DataIOTypes type : DataIOTypes.values()) {
                    System.out.println(String.format("%d: %s", optionNum, type));
                    optionNum++;
                }
                System.out.println("Enter 'exit' to exit");       
                String userInput = sc.nextLine();
                if (userInput.toLowerCase().equals("exit")) System.exit(0);
                try {
                    int userOptionNum = Integer.parseInt(userInput);
                    System.out.println("The option is: " + userOptionNum);
                    System.out.println("This is: " + DataIOTypes.values()[userOptionNum-1]);
                    return DataIOTypes.values()[userOptionNum-1];
                } catch (Exception e) {
                    System.out.println("Sorry, that is an invalid choice. Please enter the number of the option you want.");
                }
        }
    }
}
