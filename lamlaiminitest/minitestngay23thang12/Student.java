package lamlaiminitest.minitestngay23thang12;

public class Student extends Human {
    private double mathPoint;
    private double phyPoint;
    private double chemPoint;


    public Student(String name, int age) {
        super(name, age);
    }

    public Student(String name, int age, double mathPoint, double phyPoint, double chemPoint) {
        super(name, age);
        this.mathPoint = mathPoint;
        this.phyPoint = phyPoint;
        this.chemPoint = chemPoint;
    }

    public double getMathPoint() {
        return mathPoint;
    }

    public void setMathPoint(double mathPoint) {
        this.mathPoint = mathPoint;
    }

    public double getPhyPoint() {
        return phyPoint;
    }

    public void setPhyPoint(double phyPoint) {
        this.phyPoint = phyPoint;
    }

    public double getChemPoint() {
        return chemPoint;
    }

    public void setChemPoint(double chemPoint) {
        this.chemPoint = chemPoint;
    }

    public double getAveragePoint() {
        return (mathPoint + phyPoint + chemPoint) /3;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                "mathPoint=" + mathPoint +
                ", phyPoint=" + phyPoint +
                ", chemPoint=" + chemPoint +
                '}';
    }
}
