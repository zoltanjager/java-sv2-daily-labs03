package day01;

public class School {
    public static void main(String[] args) {
        Students students = new Students();

        students.addHeight(193);
        students.addHeight(176);
        students.addHeight(166);

        System.out.println(students.isHeightsIncreasing());
    }
}
