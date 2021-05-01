package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a number between 1 and 3999:");
        int num = Integer.parseInt(br.readLine());
        ArrayList<String> romanNumeral = new ArrayList<>();

        while (num <= 0 || num > 3999){
            System.out.println("Please enter a number between 1 and 3999:");
            num = Integer.parseInt(br.readLine());
        }

        int length = String.valueOf(num).length();
        if (length == 4) {
//            for (int i = 0; i < length; i++) {
            while (length == 4) {
                if (num / 1000 >= 1) {
                    romanNumeral.add("M");
                    num = num - 1000;
                    length = String.valueOf(num).length();
                }
            }
        }
            if (length == 3) {
                if (num / 900 >= 1) {
                    romanNumeral.add("CM");
                    num = num - 900;
                    length = String.valueOf(num).length();
                }
            }
            if (length == 3) {
                if (num / 500 >= 1) {
                    romanNumeral.add("D");
                    num = num - 500;
                    length = String.valueOf(num).length();
                }
            }
            if (length == 3) {
                if (num / 400 == 1) {
                    romanNumeral.add("CD");
                    num = num - 400;
                    length = String.valueOf(num).length();
                }
            }
            if (length == 3) {
//                for (int i = 0; i <= 3; i++) {
                while (length == 3) {
                    if (num / 100 >= 1) {
                        romanNumeral.add("C");
                        num = num - 100;
                        length = String.valueOf(num).length();
                    }
                }

            }
            if (length == 2) {
                if (num / 90 >= 1) {
                    romanNumeral.add("CM");
                    num = num - 90;
                    length = String.valueOf(num).length();
                }
            }

        if (length == 2) {
            if (num / 50 >= 1) {
                romanNumeral.add("L");
                num = num - 50;
                length = String.valueOf(num).length();

            }
        }
        if (length == 2) {
            if (num / 40 >= 1) {
                romanNumeral.add("XL");
                num = num - 40;
                length = String.valueOf(num).length();
            }
        }
        if (length == 2) {
//            for (int i = 0; i <= 3; i++) {
            while (length ==2) {
                if (num / 10 >= 1) {
                    romanNumeral.add("X");
                    num = num - 10;
                    length = String.valueOf(num).length();
                }
            }

        }
        if (length == 1) {
            if (num / 9 >= 1) {
                romanNumeral.add("IX");
                num = num - 9;
                length = String.valueOf(num).length();
            }
        }
        if (length == 1) {
            if (num / 5 >= 1) {
                romanNumeral.add("V");
                num = num - 5;
                length = String.valueOf(num).length();
            }

        }
        if (length == 1) {
            if (num / 4 >= 1) {
                romanNumeral.add("IV");
                num = num - 4;
                length = String.valueOf(num).length();
            }


            if (length == 1) {
                while (length == 1) {
                    if (num / 1 >= 1) {
                        romanNumeral.add("I");
                        num = num - 1;
                        length = String.valueOf(num).length();
                    } else {
                        break;
                    }
                }
            }
            System.out.println("The roman numeral is:");
            for (String rn : romanNumeral) {
                System.out.print(rn);
            }
        }

    }
}



