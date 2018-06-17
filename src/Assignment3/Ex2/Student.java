package Assignment3.Ex2;

public abstract class Student {

    boolean fullTime;
    private String name;


    public Student(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFullTime() {
        return fullTime;
    }

    public void setFullTime(boolean fullTime) {
        this.fullTime = fullTime;
    }

    abstract int getFees(int hours);

    }

