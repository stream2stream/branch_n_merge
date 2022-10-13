package com.lbg;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        VATCalculator calc = new VATCalculator();

        System.out.println( calc.calculateVATToPay(10, 10));

    }
}
