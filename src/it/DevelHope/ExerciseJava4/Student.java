package it.DevelHope.ExerciseJava4;

public class Student {
    private String name;
    private int grade;

    public Student(String name){
        this.name = name;
        System.out.println("A new student has been created");
    }
    public Student(){
        this.name = "";
        this.grade = 0;
        System.out.println("A new student has been created");
    }

    public void getStudentDetails(){
        System.out.println("The name of the student is " + name + " and his grade is " + grade);

    }

    // Metodo per richiamare la variabile privata a pubblica
    public int getGrade(){
        return grade;
    }

    public void setGrade(int grade){
        this.grade = grade;
    }
}
