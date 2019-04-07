package com.oustudents;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList f;
        f = factors(15);
        System.out.println(f);
    }

    public static ArrayList factors(int n){
        ArrayList intArray = new ArrayList();
        boolean negative = false;
        if (n == 0)
        {
            return intArray;
        }

        if (n<0)
        {
            n = Math.abs(n);
            negative = true;
        }
        while ( n%2 == 0 ){
            if (negative)
            {
                intArray.add(2 * -1);
            }
            else
            {
                intArray.add(2);
            }
            n /= 2;
        }
        for (int i = 3; i <= Math.sqrt(n); i+= 2){        // While i divides n, print i and divide n
            while (n%i == 0){
                if (negative)
                {
                    intArray.add(i * -1);
                }
                else
                {
                    intArray.add(i);
                }
                n /= i;
            }
        }

        if (n > 2)
        {
            if (negative)
            {
                intArray.add(n * -1);
            }
            else
            {
                intArray.add(n);
            }
        }

        return intArray;
    }

}
