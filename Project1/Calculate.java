package Project1;

import java.util.Scanner;

public class Calculate {
        static double num1,num2;
        public static void main(String []args){
            while(true){

                Scanner obj=new Scanner(System.in);
                System.out.println("Simple Calculator");
                System.out.println("1.Addition");
                System.out.println("2.subtraction");
                System.out.println("3.Multiplication");
                System.out.println("4.Division");
                System.out.println("5.power");
                System.out.println("6.Exit");
                System.out.println("Enter your choice");
                int choice=obj.nextInt();
                if(choice==6){
                    System.out.println("Good Bye");
                    break;

                }

                System.out.println("enter the 1st value");
                double num1=obj.nextDouble();
                System.out.println("Enter the 2nd Value");
                double num2=obj.nextDouble();


                double result=0;
                switch(choice){
                    case 1:
                        result= Calculator.add(num1,num2);
                        System.out.println("Result"+result);
                        break;
                    case 2:
                        result= Calculator.sub(num1,num2);
                        System.out.println("Result"+result);
                        break;
                    case 3:
                        result= Calculator.mul(num1,num2);
                        System.out.println("Result"+result);
                        break;
                    case 4:
                        result= Calculator.div(num1,num2);
                        System.out.println("Result"+result);
                        break;
                    case 5:
                        result= Calculator.power(num1,num2);
                        System.out.println("Result"+result);
                        break;
                    default:
                        System.out.println("enter a valid choice");
                        break;
                }
            }

        }
    }


