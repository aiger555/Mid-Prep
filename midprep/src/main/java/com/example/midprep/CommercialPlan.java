package com.example.midprep;

public class CommercialPlan extends ElectricityPlan{

    public CommercialPlan(int totalKWh){
        super(PlanType.COMMERCIAL, totalKWh);
    }

    @Override
    public double calculateCost() {
        return getTotalKWh() * 2.87;
    }
}
