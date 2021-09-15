package aop;

public class Student {
    private String nameSurname;
    private double averageGrade;

    public Student(String nameSurname, double averageGrade) {
        this.nameSurname = nameSurname;
        this.averageGrade = averageGrade;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameSurname='" + nameSurname + '\'' +
                ", averageGrade=" + averageGrade +
                '}';
    }
}
