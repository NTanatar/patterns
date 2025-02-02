package com.nata.facade;

public class Main {

    public static void main(String[] args) {
        TaxConsultant taxConsultant = new TaxConsultant();
        System.out.printf("for 2023: " + taxConsultant.howMuch(2023, "my context"));
    }
}
