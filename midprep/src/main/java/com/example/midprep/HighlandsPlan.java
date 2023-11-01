package com.example.midprep;

public class HighlandsPlan extends ElectricityPlan{

    public HighlandsPlan(int totalKWh) {
        super(PlanType.HIGHLANDS, totalKWh);
    }

    @Override
    public double calculateCost() {
        return getTotalKWh() * 1.0; // 1 som per kWh for Highlands plan
    }
}
