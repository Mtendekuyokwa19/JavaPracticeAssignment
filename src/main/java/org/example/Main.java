package org.example;

import java.util.Objects;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        System.out.println(convertArraytoString(new int[] {1,2,3,4,5,6,7,8,9,0}));

        /*System.out.println(typeOfMultiple(15));*/

//        System.out.println(discount(600,10.578879876));
//        System.out.println(numberOfTrueValue(new boolean[] {true,false,false}));
//        System.out.println(calculateNumber(9,3,'/'));
//        System.out.println(countDs("The Dogs dont feels"));

//        System.out.println(match("Hello","heLLo"));

//        System.out.println(isPrural("Moneys"));
//        int number= (int) 9.94;
//        System.out.println(number);

//        System.out.println(totalCups(213));

//        System.out.println(howManywalls(100,4,5));

        System.out.println(isPrime(23));
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

    public static int countDs(String sentence){
        int countTheDsInSetences=0;
     String jack=sentence.toUpperCase();
        for (char letterInSetence :jack.toCharArray()){

            if (letterInSetence=='D'){
                countTheDsInSetences++;

            }


        }

        return countTheDsInSetences;

    }

    //56
    public static boolean match(String firstWord,String secondWord){

        firstWord=firstWord.toLowerCase();
        secondWord=secondWord.toLowerCase();

        if (secondWord.equals(firstWord)){

            return true;
        }

        return false;

    }

    //55

    public static boolean isPrural(String word){
        word=word.toUpperCase();
        String[] arryOfChar=word.split("");
        int sizeOfArray=word.length();
        if (arryOfChar[sizeOfArray-1].equals("S")){
            return true;
        }
        return false;

    }

    //54

    public  static int totalCups(int cupsBought){

        int totalExtracups=cupsBought/6;
        cupsBought=totalExtracups+cupsBought;

        return  cupsBought;
    }

    //50

    public static int howManywalls(int icanManagetoPaint, double width,double  height){

        double areaOfwall=width*height;
        return (int)(icanManagetoPaint/areaOfwall);
    }


    //37
    public static boolean isPrime(int n){

        if (n <= 1)
            return false;

        if (n == 2 || n == 3)
            return true;

        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i <= Math.sqrt(n); i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;

        return true;
    }

}

