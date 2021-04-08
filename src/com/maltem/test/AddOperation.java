package com.maltem.test;

public class AddOperation extends Operation{

    public AddOperation() {
      this.result=0;
    }

    @Override
    public void calcul(int a, int b) {
         this.result = a+b;
    }
}
