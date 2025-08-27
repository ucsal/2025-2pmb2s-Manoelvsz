package br.com.mariojp.solid.srp;

public class TaxCalculator {

    public double calculate(double subtotal) {
       
        String taxRateProperty = System.getProperty("tax.rate");
        double rate = Double.parseDouble(taxRateProperty);

        return subtotal * rate;
    }
}
