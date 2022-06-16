package com.Inheritance;

import java.util.Scanner;

class Interest{
    int getRateofInterest() {return  0;}}
class HDFC extends Interest{
    int getRateofInterest(){return 5;}}
class SBI extends Interest{
    int getRateofInterest(){return 4;}}
class PNB extends Interest{
    int getRateofInterest(){return 6;}}
class TMB extends Interest{
    int getRateofInterest(){ return 3;}}


public class CalculatetheTotalInterest
{
    public static void main(String[] args) {
        int principal = 10000;
        int year=1;
        double interest;
      
        Scanner sc=new Scanner(System.in);
        SBI s=new SBI();
        HDFC h=new HDFC();
        PNB p=new PNB();
        TMB t=new TMB();
        
            System.out.println("WELCOME TO CHECK THE INTEREST RATE");
            System.out.println("Enter 1 to check the InterestRate of HDFC");
            System.out.println("Enter 2 to check the InterestRate of SBI");
            System.out.println("Enter 3 to check the InterestRate of PNB");
            System.out.println("Enter 4 to check the InterestRate of TMB");
            System.out.println("Enter your choice: ");
            interest=sc.nextDouble();
            switch ((int) interest) {
                case 1:
                    double HDFC = (double) (principal * year * h.getRateofInterest()) / 100;
                    System.out.println("The InterestRate for HDFC is:" + HDFC);
                    break;
                case 2:
                    double SBI = (double) (principal * year * s.getRateofInterest()) / 100;
                    System.out.println("The InterestRate for SBI is:" + SBI);
                    break;
                case 3:
                    double PNB = (double) (principal * year * p.getRateofInterest()) / 100;
                    System.out.println("The InterestRate for PNB is:" + PNB);
                    break;
                case 4:
                    double TMB = (double) (principal * year * t.getRateofInterest()) / 100;
                    System.out.println("The InterestRate for TMB is:" + TMB);            
        }

    }
}