package Assignment3.Ex1;

public class Life extends Insurance {


    public Life(String insuranceType, double monthlyCost) {
        super(insuranceType,monthlyCost);
    }

    @Override
    public void setInsuranceCost(double monthlyCost) {
        monthlyCost =getMonthlyCost();
    }
    @Override
    public String displayInfo() {
        return String.format("Type " + getInsuranceType() + " and its monthly Cost is " + getMonthlyCost() + "\n");
    }
}
