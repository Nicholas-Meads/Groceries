/**<h1>Project Title: </h1>
*<b>Purpose of Project:</b><br>
*<p></p>
*<b>How to start the project instructions:</b><br>
*<p></p>
*<b>User Instructions:<b/><br>
*<p></P>
*<br>
*@author Nick Meads
*@version 1
*@since 2017-12-11
*/

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Groceries {
  /**<b>Class Description: Driver class</b><br>
  *<p></p>
  *@param
  *@return
  *@throws
  */

  public String printMoney (double money) {
    String pM = String.format ("$%.2f", money);
    System.out.println(pM);
    return pM;
  }

  public int stringDecInt (String userNumber1) {
  String userNumber2 = new String();
  userNumber2 = "";
  int item_int = 0;
  double item_double = 0.0;
  try {
      item_double = Double.parseDouble(userNumber1);
      item_double = 0.0;
  }
  catch (NumberFormatException ne3) {
      System.out.println ("User has failed first attempt at entering item number");
      userNumber2 = JOptionPane.showInputDialog ("Please enter how many " +
              "whole items.\nFor example: \' 3 \'");
      try {
        item_double = Double.parseDouble(userNumber2);
        userNumber1 = userNumber2;
        item_double = 0.0;
      }
      catch (NumberFormatException ne4) {
        System.out.println ("User failed a second attempt for " +
                           "an integer value of items.");
        JOptionPane.showMessageDialog (null, "Please restart the program and " +
                   "enter a whole number of items, as a whole number.", "ERROR " +
                   "MESSAGE", JOptionPane.ERROR_MESSAGE);
        System.exit(0);
      }
  }
  try {
    System.out.println ("User entered a double or int for number of items.");
    item_int = Integer.parseInt(userNumber1);
    System.out.println ("User entered an int for number of items.");
  }
  catch (NumberFormatException ne6) {
    System.out.println ("User entered a decimal value for the number of items.");
    userNumber2 = JOptionPane.showInputDialog ("It seems you have entered " +
            " a decimal number.\nPlease enter a number of whole items.\n" +
            "For example: \' 3 \'");
    try {
      item_int = Integer.parseInt(userNumber2);
      item_double = 0.0;
    }
    catch (NumberFormatException ne7) {
      System.out.println ("User failed a second attempt for " +
                         "the whole number of items.");
      JOptionPane.showMessageDialog (null, "Please restart the program and " +
                 "enter a whole number of items, as a whole number.", "ERROR " +
                 "MESSAGE", JOptionPane.ERROR_MESSAGE);
      System.exit(0);
    }
  }
  System.out.println ("Tracking Variables of Procedure for debugging");
  System.out.println (item_int);
  System.out.println (item_double);
  System.out.println (userNumber1);
  System.out.println (userNumber2);
  return item_int;
 }

  /**<b>Method Description: Driver</b><br>
  *<p></p>
  *@param args unused
  *@return
  *@throws
  */

   public static void main(String[] args)
   throws NumberFormatException
   {

   Groceries obj = new Groceries();

     String moneyYouHave_string1 = JOptionPane.showInputDialog("Tell me how much " +
                  "money you have.\n Please enter only dollars and cents, \n" +
                  "For Example: \'\' 14.50 \'\'");
     Double moneyYouHave_double = 0.00;

     try{
       moneyYouHave_double = Double.parseDouble(moneyYouHave_string1);
     }
     catch (NumberFormatException ne1) {
       System.out.println("User failed first attempt " +
                          "inputting money value.");
       String moneyYouHave_string2 = JOptionPane.showInputDialog("Please "+
               "enter a dollars and cents value\n" +
               "For example: \' 14.50 \'");
       try {
         moneyYouHave_double = Double.parseDouble(moneyYouHave_string2);
       }
       catch (NumberFormatException ne2) {
         System.out.println("User failed a second attempt for " +
                            "the total money to spend.");
         JOptionPane.showMessageDialog (null, "Please restart the program" +
                     JOptionPane.ERROR_MESSAGE);
         System.exit(0);
       }
     }

     double totalMoneyIn = moneyYouHave_double;
     if ( moneyYouHave_double == Math.abs(0.0) ) {
       System.out.println("You are very broke." +
                          " Please restart the program");
       JOptionPane.showMessageDialog (null, "You have not entered a total amount of money to spend. " +
                   JOptionPane.ERROR_MESSAGE);
       System.exit(0);
     } else {
       System.out.println("User entered: " + totalMoneyIn);
       JOptionPane.showMessageDialog (null, "I understand you entered " +
            obj.printMoney(totalMoneyIn), "money to spend", JOptionPane.INFORMATION_MESSAGE);
     }

  // Sequence that asks about Apples, Oranges, and Chocolate
  System.out.println("User enters a number of apples. \n");
  String apples_string1 = JOptionPane.showInputDialog ("Let's " +
         "fill the box.\nPlease enter how many whole apples you " +
         "would like.");
  String apples_string2 = "";
  Integer apples_int = 0;
  Double apples_double = 0.0;

  apples_int = obj.stringDecInt(apples_string1);

  System.out.println("User enters a number of oranges. \n");
  String oranges_string1 = JOptionPane.showInputDialog ("Let's " +
         "fill the box.\nPlease enter how many oranges you " +
         "would like.");
  String oranges_string2 = "";
  Integer oranges_int = 0;
  Double oranges_double = 0.0;

  oranges_int = obj.stringDecInt(oranges_string1);

  System.out.println("User enters a number of chocolate bars. \n");
  String chocolate_string1 = JOptionPane.showInputDialog ("Let's " +
         "fill the box.\nPlease enter how many chocolate bars you " +
         "would like.");
  String chocolate_string2 = "";
  Integer chocolate_int = 0;
  Double chocolate_double = 0.0;

  chocolate_int = obj.stringDecInt(chocolate_string1);

  System.out.println("Apples.");
  System.out.println(apples_int);
  System.out.println(apples_double);
  System.out.println(apples_string1);
  System.out.println(apples_string2);

  System.out.println("Oranges.");
  System.out.println(oranges_int);
  System.out.println(oranges_double);
  System.out.println(oranges_string1);
  System.out.println(oranges_string2);

  System.out.println("Chocolate bars.");
  System.out.println(chocolate_int);
  System.out.println(chocolate_double);
  System.out.println(chocolate_string1);
  System.out.println(chocolate_string2);

  System.out.println("You made it to the end, now get out.");
  }
}
