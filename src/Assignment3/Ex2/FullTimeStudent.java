package Assignment3.Ex2;

public class FullTimeStudent extends Student{


    public FullTimeStudent(String name) {
        super(name);
    }

    @Override
    int getFees(int hours) {
        return 2000;
    }
}
