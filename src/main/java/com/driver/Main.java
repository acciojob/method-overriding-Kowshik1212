package com.driver;


public class Main {
    static public class A{
        public String meth(){
            return "Invoking method from class A";
        }
    }

    static public class B extends A{
        public String meth(){
            return "Method is overridden in Extendend class B";
        }
    }
    public static void main(String[] args){
        A obj1=new A();
        A obj2=new B();
        B obj3=new B();

        System.out.println(obj1.meth());
        System.out.println(obj2.meth());
        System.out.println(obj3.meth());
    }

}