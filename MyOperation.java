package com.pinche;

public class MyOperation {
    char op;
    public MyOperation(String s){
        op=s.charAt(0);
    }
    public Integer calc(Integer a, Integer b){
        switch (op){
            case '+': return a+b;
            case '-': return a-b;
            case '*': return a*b;
            case '/': return a/b;
            default: return -1;
        }
    }
}
