package com.aditya;

import java.util.*;
import java.io.*;
import java.lang.*;
public class App
{   
    public static void main(String[] args)
    {
        System.out.println("-------Calculator-------");
        Scanner sc=new Scanner(System.in);
        char c='N';char prev='N';boolean err=false;
        System.out.print("Enter 1st operand:");
        double var1=sc.nextDouble();
        do
        {
            
            
            System.out.print("Enter operator(+,-,*,/,^,!(factorial),S(sq.root),%(rem):");
            c=sc.next().charAt(0);
            switch(c)
            {
                case('+'):var1=add(var1);break;
                case('-'):var1=sub(var1);break;
                case('*'):var1=prod(var1);break;
                case('/'):var1=div(var1);break;
                case('^'):var1=pow(var1);break;
                case('!'):display1(var1,"!");var1=fact((int)var1);break;
                case('S'):var1=sqrt(var1);break;
                case('%'):var1=mod(var1);break;
                default:System.out.println("Error unsupported Operator");err=true;
            }
            if(!err)System.out.println(var1);
            System.out.printf("Press Y to continue:");
            c=sc.next().charAt(0);
            if (c=='Y')
            {
                System.out.print("Press Y to continue with previous calculation:");
                prev=sc.next().charAt(0);
                if(prev!='Y')
                {
                    System.out.print("Enter 1st operand:");
                    var1=sc.nextDouble();
                }
            }
        }while(c=='Y');
     System.out.println("Operation Complete");
    }
    static double var2inp()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter next operand:");
        double var2=sc.nextDouble();
        return(var2);
    }
    static void display1(double var1,String op)
    {
        System.out.print(var1+op+" =");
    }
    static void display2(double var1,char op,double var2)
    {
        System.out.printf("%f %c %f =",var1,op,var2);
    }
    static double add(double var1)
    {
        double var2=var2inp();
        display2(var1,'+',var2);
        return(var1+var2);
    }
    static double sub(double var1)
    {
        double var2=var2inp();
        display2(var1,'-',var2);
        return(var1-var2);
    }
    static double div(double var1)
    {
        double var2=var2inp();
        display2(var1,'/',var2);
        return(var1/var2);
    }
    static double prod(double var1)
    {
        double var2=var2inp();
        display2(var1,'*',var2);
        return(var1*var2);
    }
    static double mod(double var1)
    {
        double var2=var2inp();
        display2(var1,'%',var2);
        return(var1%var2);
    }
    static double pow(double var1)
    {
        double var2=var2inp();
        display2(var1,'^',var2);
        return(Math.pow(var1,var2));
    }
    static double sqrt(double var1)
    {
        display1(var1,"^(1/2)");
        return(Math.sqrt(var1));
    }
    static int fact(int var1)
    {
        if(var1<2)return(1);
        else return(var1*fact(var1-1));
    }
}

    
    