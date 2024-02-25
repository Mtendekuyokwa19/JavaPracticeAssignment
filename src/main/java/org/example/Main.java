package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        System.out.println(convertArraytoString(new int[] {1,2,3,4,5,6,7,8,9,0}));

        /*System.out.println(typeOfMultiple(15));*/

//        System.out.println(discount(600,10.578879876));
//        System.out.println(numberOfTrueValue(new boolean[] {true,false,false}));
        System.out.println(calculateNumber(9,3,'/'));

    }

    //62

    public static String convertArraytoString(int[] phoneArray){

         String phoneNumber="(";
        phoneArray.toString();


        for (int i = 0; i <3; i++) {
        phoneNumber=phoneNumber+phoneArray[i];

        }

        phoneNumber=phoneNumber+")";

        for (int i = 3; i < 10; i++) {
            if (i==6){
                phoneNumber=phoneNumber+"-";
            }
            phoneNumber=phoneNumber+phoneArray[i];

        }

       return  phoneNumber;
    }

    //61

    public static String typeOfMultiple(int number){

        if ((number%3==0)&&(number%5==0)){

            return "FizzBuzz";
        }
        else if (number%5==0) {

            return "Buzz";
        }
        else if (number%3==0) {

            return "Fizz";
        }


       return Integer.toString(number);
    }

    //60

    public static  double discount(float money,double discoutPercentage){

       return money-(money*(discoutPercentage/100));

    }

    //59

    public  static int numberOfTrueValue(boolean[] status){
        int trueEntries=0;
        for(boolean elementInStatus:status){
               if(elementInStatus==true){
                   trueEntries++;
               }

        }
              return trueEntries;
    }

    //58

    public static double calculateNumber(double firstNumber,double secondNumber, char operator){

        switch (operator){
            case '+':
                return firstNumber+secondNumber;

            case '-':
                return firstNumber-secondNumber;

             case '/':
                 return firstNumber/secondNumber;

            case '*':
                return firstNumber*secondNumber;

            case '%':
                return firstNumber%secondNumber;

            default:
                return 00000000;

        }
    }

    //57
}

