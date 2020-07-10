package grades;

import java.util.*;

public class Student {
    private String name;
    private ArrayList<Integer> grades;
    // private List<Integer> grades = new ArrayList<>(); // Once its working try swapping out for a List

//    public Student() {
//        this.grades = new ArrayList<Integer>();
//    }

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<Integer>();
    }

    public Student(String name, List<Integer> grades) {
        this.name = name;
        this.grades = new ArrayList<Integer>(grades);
//        allStudents.add(this); // example if you wanted a method to add the entire object to a static array list
    }

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public double getGradeAverage() {
        double allGrades = 0;
        for(Integer i : this.getGrades()){
            allGrades += i;
        }
        return allGrades/this.grades.size();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Laura");
        System.out.println(s1.getName());
        System.out.println(s1.getGrades());
        s1.addGrade(80);
        s1.addGrade(95);
        s1.addGrade(90);
        s1.addGrade(85);
        System.out.println(s1.getGradeAverage());
    }
}
