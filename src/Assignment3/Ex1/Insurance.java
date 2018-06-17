package Assignment3.Ex1;

public abstract class Insurance {

    public Insurance(String insuranceType, double monthlyCost) {
        this.insuranceType=insuranceType;
        this.monthlyCost = monthlyCost;
    }

    String insuranceType;
    double monthlyCost;


    public String getInsuranceType() {
        return insuranceType;
    }

   public double getMonthlyCost() {
        return monthlyCost;
    }
    public abstract void setInsuranceCost(double monthlyCost);

    public abstract String displayInfo();
}
