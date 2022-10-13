package com.lbg;
//import
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        VATCalculator VatCalc = new VATCalculator();

        System.out.println( "Your VAT is " + VatCalc.calculateVATToPay(10, 20) );
    }
}
