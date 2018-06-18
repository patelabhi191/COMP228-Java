package Assignment3.Ex3;

public class BusinessMortgage extends Mortgage {

    public BusinessMortgage(int mortgageNumber, String name, int amount, double rate, int term) {
        super(mortgageNumber, name, amount, rate+0.01, term);
    }
}
