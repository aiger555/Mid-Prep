package com.example.midprep;

public abstract class ElectricityPlan {
    private PlanType planType;
    private int totalKWh;


    public ElectricityPlan(PlanType planType, int totalKWh){
        this.planType = planType;
        this.totalKWh = totalKWh;
    }

    public PlanType getPlanType() {
        return planType;
    }

    public void setPlanType(PlanType planType) {
        this.planType = planType;
    }

    public int getTotalKWh() {
        return totalKWh;
    }

    public void setTotalKWh(int totalKWh) {
        this.totalKWh = totalKWh;
    }

    public abstract double calculateCost();

}
