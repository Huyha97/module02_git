package btvn_24_12.bt29_12;

public class Student extends Human {
    private double avgPoint;

    public Student(String name, int age, String gender, String address, double avgPoint) {
        super(name, age, gender, address);
        this.avgPoint = avgPoint;
    }

    public Student(double avgPoint) {
        this.avgPoint = avgPoint;
    }

    public double getAvgPoint() {
        return avgPoint;
    }

    public void setAvgPoint(double avgPoint) {
        this.avgPoint = avgPoint;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                "avgPoint=" + avgPoint +
                '}';
    }
    public String displayXepLoai(){
        return ("TEN" + getName() + "TUOI" + getAge() + " GIOI TINH" + getGender() + "ADDRESS" + getAddress() + "DiemTB" + getAvgPoint());
    }
}
