package com.maltem.test;

public abstract class Operation {

    int result;
    public abstract void calcul(int a,int b);

    public String result(){
        return String.valueOf(result);
    }
}
