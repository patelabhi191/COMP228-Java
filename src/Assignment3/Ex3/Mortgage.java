package Assignment3.Ex3;

public abstract class Mortgage implements MortgageConstant {
    int mortgageNumber;

    public Mortgage(int mortgageNumber, String name, int amount, double rate, int term) {
        this.mortgageNumber = mortgageNumber;
        this.name = name;
        this.amount = amount;
        this.rate = rate;
        this.term = term;
    }

    public int getMortgageNumber() {
        return mortgageNumber;
    }

    public void setMortgageNumber(int mortgageNumber) {
        this.mortgageNumber = mortgageNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount(int amount){
        return amount;
    }

    //setAmount exception for amount less than 0 and 300,000
    public int setAmount(int amount)throws IllegalArgumentException  {
        if(amount < 0.0 || amount > 300000){
            throw new IllegalArgumentException("The value for mortgage cannot exceed 300,000");}
        this.amount = amount;
        return amount;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    String name;
    int amount;
    double rate;
    int term;

    //Printing method
    public String getMortgageInfo (){
        return String.format("Mortgage#- "+getMortgageNumber()+" Name- " + getName()
                + " Amount- " + setAmount(amount) + "\nRate- " + getRate() + " Term- " + getTerm()
        + " total amount to be paid- " + (setAmount(amount)+(getTerm()*getRate()*getAmount(amount))));
    }

}
