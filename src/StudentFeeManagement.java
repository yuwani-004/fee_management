/*
StudentID: 10695804
StudentName: Yuwani Bandara
Module: CSP3341 Programming Languages and Paradigms
 */

import java.util.Scanner;

public class StudentFeeManagement {
   static Scanner scanner;
   static String studentId;
   static String studentName;
   static double totalFee;
   static double paidAmount;

   public StudentFeeManagement() {
   }

   public static void main(String[] var0) {
      boolean var1 = true;

      while(var1) {
         System.out.println("\n===== STUDENT FEE MANAGEMENT SYSTEM =====");
         System.out.println("1. Register Student");
         System.out.println("2. View Fee Details");
         System.out.println("3. Pay Fee");
         System.out.println("4. View Due Amount");
         System.out.println("5. Exit");
         System.out.print("Select an option (1-5): ");
         int var2 = scanner.nextInt();
         scanner.nextLine();
         switch (var2) {
            case 1:
               registerStudent();
               break;
            case 2:
               viewFeeDetails();
               break;
            case 3:
               payFee();
               break;
            case 4:
               viewDueAmount();
               break;
            case 5:
               var1 = false;
               System.out.println("Exiting system. Thank you!");
               break;
            default:
               System.out.println("Invalid option. Try again.");
         }
      }

      scanner.close();
   }

   static void registerStudent() {
      System.out.print("Enter Student ID: ");
      studentId = scanner.nextLine();
      System.out.print("Enter Student Name: ");
      studentName = scanner.nextLine();
      System.out.print("Enter Total Fee Amount: ");
      totalFee = scanner.nextDouble();
      paidAmount = 0.0;
      System.out.println("Student registered successfully.");
   }

   static void viewFeeDetails() {
      if (studentId == null) {
         System.out.println("No student registered yet.");
      } else {
         System.out.println("\n--- STUDENT FEE DETAILS ---");
         System.out.println("Student ID   : " + studentId);
         System.out.println("Student Name : " + studentName);
         System.out.println("Total Fee    : " + totalFee);
         System.out.println("Paid Amount  : " + paidAmount);
      }
   }

   static void payFee() {
      if (studentId == null) {
         System.out.println("Please register a student first.");
      } else {
         System.out.print("Enter payment amount: ");
         double var0 = scanner.nextDouble();
         if (var0 <= 0.0) {
            System.out.println("Invalid payment amount.");
         } else if (paidAmount + var0 > totalFee) {
            System.out.println("Payment exceeds total fee.");
         } else {
            paidAmount += var0;
            System.out.println("Payment successful.");
         }

      }
   }

   static void viewDueAmount() {
      if (studentId == null) {
         System.out.println("No student registered yet.");
      } else {
         double var0 = totalFee - paidAmount;
         System.out.println("Outstanding Fee Amount: " + var0);
      }
   }

   static {
      scanner = new Scanner(System.in);
      paidAmount = 0.0;
   }
}
