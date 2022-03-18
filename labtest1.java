package com.company;

public class labtest1 {
    public static int weight;

        public static int check(int weight) {
            if (weight >= 1 && weight <= 100) {
                if ((weight % 2) == 0) {
                    System.out.println("YES");
                    return 1;
                } else {
                    System.out.println("NO");
                    return 0;
                }
            } else {
                System.out.println("The number is not within the range");
                return -1;
            }
        }
    }

