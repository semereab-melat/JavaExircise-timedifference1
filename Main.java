import java.util.Scanner;
import java.text.DecimalFormat;
/***************************************************************
 Filename: 
 Created by: Melat Zerai
 Created on: 10/18/2021
 Comment: Design and write a program to read in: a start time and, a finish time (24 hour clock) and
 output the time difference in hours, minutes and seconds.
 ***************************************************************/

public class Main {

   static final int SECONDMINUTEHOUR = 60;
   DecimalFormat df = new DecimalFormat("00");

   //declaring our variables
   int startHour, startMinute, startSecond;
   int endHour, endMinute, endSecond;


   //Read in the start time and finish time
   public void readData()
   {
      //reading start time from end user
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Please enter the start hour: 00-24");
      startHour = keyboard.nextInt();
      System.out.println("Please enter the start minute: 00-60");
      startMinute = keyboard.nextInt();
      System.out.println("Please enter the start seconds: 00-60 ");
      startSecond = keyboard.nextInt();

     //reading ending time from the user
      System.out.println("Please enter finish hour: 00-24");
      endHour = keyboard.nextInt();
      System.out.println("Please enter finish minute: 00-60");
      endMinute = keyboard.nextInt();
      System.out.println("Please enter finish seconds: 00-60 ");
      endSecond = keyboard.nextInt();
      //startTime = hour  + minute + second;
   }
   // Write the time
   public void writeData()
   {
      System.out.println("Start time: " + df.format(startHour) + ":" + df.format(startMinute) + ":" + df.format(startSecond));
      System.out.println("Finish time: " + df.format(endHour) + ":" + df.format(endMinute) + ":" + df.format(endSecond));
   }
   //calculating the difference between start and finish time
   public String calculateDifference()
   {
      int differenceSecond, diffrenceMinute, differenceHour;

      differenceSecond = endSecond - startSecond;
      diffrenceMinute = endMinute - startMinute;
      differenceHour = endHour - startHour;

      if (differenceSecond < 0)
      {
         differenceSecond = differenceSecond + SECONDMINUTEHOUR;
         diffrenceMinute = diffrenceMinute - 1;

      }
         if (diffrenceMinute < 0)
      {
         diffrenceMinute = diffrenceMinute + SECONDMINUTEHOUR;
         differenceHour = differenceHour - 1;
      }
          if (differenceHour < 0)
       {
          differenceHour = startHour - endHour;

       }
      return df.format(differenceHour) + ":" +df.format(diffrenceMinute) + ":" + df.format(differenceSecond);
   }
   public static void main(String args[])
   {
      Main time = new Main();
      time.readData();
      time.writeData();
      System.out.println("Difference is " + time.calculateDifference());
   }
}