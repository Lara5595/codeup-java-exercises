package grades;

public class StudentTest {
    public static void main(String[] args) {

     Student naz = new Student("naz");
     naz.addGrade(20);
     naz.addGrade(50);
     naz.addGrade(100);
        System.out.println("Naz grades are " + naz.getGrades());

     Student Mason = new Student("Mason");
     Mason.addGrade(95);
     Mason.addGrade(90);
     Mason.addGrade(99);
        System.out.println("Mason's grades are " + Mason.getGrades());


        System.out.println("This is Mason's grade " + Mason.getGradeAverage());
        System.out.println("This is Naz's grade " + naz.getGradeAverage());


    } // end of main
}  // end of test
