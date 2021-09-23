package com.torryharris.driver1;

import java.nio.channels.FileLock;
import java.util.Scanner;

public class IntegerDemo {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String a,b;
        System.out.println("Enter a value:");
        a=s.nextLine();
        System.out.println("enter b value:");
        b=s.nextLine();
        Integer obj=Integer.parseInt(a);//Box
        Float onjf=Float.parseFloat(b);//Box
        System.out.println("Addition: "+onjf+obj);
        System.out.println("Substraction: "+(-onjf+obj));
        System.out.println("Division: "+(onjf/obj));
        System.out.println("Multiplication: "+onjf*obj);
        int ab=obj;
        float ba=onjf;
        System.out.println("Integer of a:"+obj*2);
        System.out.println("Float of b:"+onjf*2);
        System.out.println("int of ab:"+ab);
        System.out.println("float of ba:"+ba);
        int n=3, m=0;
        System.out.println(n/m);

    }
}
