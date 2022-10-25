package grades;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Student  {

    private String name;
    private ArrayList<Integer> grades;

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    // Getter
//    public String getName(){
//        return name;
//    }

    // Getter
    public ArrayList<Integer> getGrades() {
        return grades;
    }

    // Setter
    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    // Methods
    // returns the student's name
    public String getName(){
        return name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade){
        this.grades.addAll(new ArrayList<>(List.of(grade)));
    }

    // returns the average of the students grades
    // Credit to Mason
    public double getGradeAverage(){
        // Total of student grades
        // number of grades
        // Divide total by the number of grades
        int total = 0;
        for (int i = 0; i < grades.size(); i++){
            total  += grades.get(i);
        }
        return (double) total / grades.size();
    }

    public String toString(){
        return name;
    }




// Constructor

    public Student(){};

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }



} // end of student
