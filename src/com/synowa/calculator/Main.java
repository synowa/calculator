package com.synowa.calculator;

public class Main {

    public static void main(String[] args) {
        double val1 = 100.0d;
        double val2 = 50.0d;
        double result;
        char opCode = 'd';

        if (opCode == 'a')
            result = val1 + val2;
        else if (opCode == 's')
            result = val1 - val2;
        else if (opCode == 'd')
            result = val2 != 0.0d ? val1 / val2 : 0.0d; //            to be sure ur not dividing by zero
//            or
//            if (opCode == 'd')
//            if val2 != 0.0d
//            result = val1 / val2;
//            else
//                result = 0.0d
//
//            to be sure ur not dividing by zero
//            or
//            else if (val2 != 0.0d && opCode == 'd')
//            result = val1 / val2;
         else if (opCode == 'm')
            result = val1 * val2; //(it means result = if val2 non equals zero than go ahead and divide val1/val2 otherwise (":") return zero)
        else {
            //System.out.println("Error - invalid opCode");
            //result = 0.0d;
            //if I leave it like here it's gonna print out 0.0m because without the brackets else only do the first line after itself, so with char opCode = 'd' instead of 2.0 we'll get 0.0
            System.out.println("Error - invalid opCode");
            result = 0.0d;
        }
        System.out.println(result);


    }
}

