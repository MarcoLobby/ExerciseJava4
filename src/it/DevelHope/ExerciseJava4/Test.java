package it.DevelHope.ExerciseJava4;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student("Marco Lo Bello");
        Student student2 = new Student("Jason Di Bartolo");

        Teacher teacher = new Teacher();
        teacher.setTeacherName("Giuseppe Fiengo");
        teacher.assignGrade(student1, 8);
        teacher.assignGrade(student2,6);

        student1.getStudentDetails();
        student2.getStudentDetails();

    }
}
