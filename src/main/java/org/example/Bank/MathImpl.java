package org.example.Bank;

public class MathImpl implements Mathematics{

    @Override
    public int addTwo(int a, int b) {
        return a + b;
    }

    @Override
    public int force(int mass, int acceleration) {
        return mass * acceleration;
    }

    @Override
    public double factorial(int num) {
        if(num < 2) return num;
        else return num * factorial(num - 1);
    }


}
