package com.nata.facade;

import com.nata.facade.subsystem.TaxCalculationRules;
import com.nata.facade.subsystem.TaxCategories;

public class TaxConsultant {
    TaxCalculationRules taxCalculationRules;
    TaxCategories taxCategories;

    int howMuch(int year, String context) {
        // using sybsystem to calculate

        return 816;
    }
}
