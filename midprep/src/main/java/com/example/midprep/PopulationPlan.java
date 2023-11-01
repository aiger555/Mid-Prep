package com.example.midprep;

public class PopulationPlan extends ElectricityPlan{

    public PopulationPlan(int totalKWh){
        super(PlanType.POPULATION, totalKWh);
    }

    @Override
    public double calculateCost() {
        if (getTotalKWh() <= 700) {
            return getTotalKWh() * 1.0;  // 1 som per kWh up to 700 kWh
        } else {
            return 700 * 1.0 + (getTotalKWh() - 700) * 2.16;  // Over 700 kWh, the cost is 2.16 som per kWh
        }
    }

}
