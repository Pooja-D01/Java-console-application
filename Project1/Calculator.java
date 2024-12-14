package Project1;

public class Calculator {

        public static double add(double a,double b){
            return a+b;
        }
        public static double add(double a,int b){
            return a+b;
        }
        public static double sub(double a,double b){
            return a-b;
        }

        public static double mul(double a,double b){
            return a*b;
        }
        public static double mul(double a,int b){
            return a*b;
        }
        public static double div(double a,double b){
            if(b<=0){
                System.out.println("Error: Zero Division Error");
                return 0;
            }
            return a/b;
        }
        public static double power(double a,double b){
            return Math.pow(a,b);
        }

    }


