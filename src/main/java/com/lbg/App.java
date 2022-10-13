package com.lbg;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Accumulator result = new Accumulator();
        System.out.println( result.sum(1,1) );
        VATCalculator VatCalc = new VATCalculator();
        System.out.println( "Your VAT is " + VatCalc.calculateVATToPay(10, 20) );
    }
}
