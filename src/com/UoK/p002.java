package com.UoK;

public final class p002 implements EulerSolution{
    public static void main(String[] args) {
        System.out.println(new p002().run(4000000));
    }



    @Override
    public String run(int n) {
        int x = 1;
        int y = 2;
        int sumFib = 0;

        while (x <= n){
            if (x % 2 == 0)
                sumFib += x;
            int z = x + y;
            x= y;
            y = z;
        }
        return Integer.toString(sumFib);
    }
}
