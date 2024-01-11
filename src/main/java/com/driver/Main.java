package com.driver;

class A{
    String meth(){
        return "Invoking method from class A";
    }
}

class B extends A{
    String meth(){
        return "Method is overridden in Extended class B";
    }
}
public class Main {

    public static void main(String[] args){
        A obj1=new A();
        A obj2=new B();
        B obj3=new B();

        System.out.println(obj1.meth());
        System.out.println(obj2.meth());
        System.out.println(obj3.meth());
    }

}