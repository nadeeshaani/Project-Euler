package com.UoK;

public final class p001 implements EulerSolution{

    public static void main(String[] args) {
	    System.out.println(new p001().run(1000));
    }

    @Override
    public String run(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++){
            if (i % 3 == 0 || i % 5 == 0)
                sum += i;
        }
        return Integer.toString(sum);
    }
}
