package com.maltem.test;

public class MinusOperation extends Operation {

    public MinusOperation() {
        this.result=0;
    }

    @Override
    public void calcul(int a, int b) {
        this.result = a-b;
    }
}
