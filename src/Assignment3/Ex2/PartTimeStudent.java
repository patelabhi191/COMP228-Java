package Assignment3.Ex2;

public class PartTimeStudent extends Student{

    private int creditHours;

    public PartTimeStudent(String name) {
        super(name);
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) throws IllegalArgumentException{
        if(creditHours<0 || creditHours >43 )//College hours cannot exceed 40, but here we take 43 as student can have a combo subject
            throw new IllegalArgumentException("Invalid number of hours entered");
        this.creditHours=creditHours;
    }

    @Override
    int getFees(int creditHours) {
        return creditHours * 100;
    }
}
