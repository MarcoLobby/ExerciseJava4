package it.DevelHope.ExerciseJava4;

public class Teacher {
    private String teacherName;


    public Teacher(){
        System.out.println("A new teacher has been created");
    }

    public void assignGrade(Student alum, int finalGrade){
        alum.setGrade(finalGrade);
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String name){
        this.teacherName = name;
    }

}
