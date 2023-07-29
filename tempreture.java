import java.util.*;
public class tempreture {
              static Scanner sc = new  Scanner(System.in);
              
            //   method to convert celcius to fahrenheit 
            static double C_F(double C){
                double F = (C * 9/5) + 32;
                return F;
            }

            //Method to convert fahrenheit to celcius
            static double F_C(double F){
                double C = (F - 32) * 5/9;
                return C;
            }
            //Method to read the value of tempreture given by the user  
            static double input(String word){
                System.out.println("Enter "+word+" value :");
                double val = sc.nextDouble();
                return val;
            }

            // method to print converted value of tempreture 
            static void output(double val, String word){
                System.out.printf("%s value: %.2f",word ,val);
            }


            public static void main(String[] args) {
                System.out.printf( " 1. celcius to fahrenheit \n 2.  fahrenheit to celcius");

                do{
                     System.out.println("Choose as per your need ");
                     System.out.println("Enter your chooice");
                     int ch = sc.nextInt();
                     double num = 0;
                     switch(ch)
                     {
                        case 1: num = input("Celcius");
                                 output(C_F(num), "Fahrenheit");
                                 break;
                        case 2: num = input("Fahrenheit");
                                 output(F_C(num), "Celcius");
                                 break;
                        default:
                        System.out.println("Invalid choice ");

                     }
                }while(false);
            }
}

