package be.intecbrussel.students;

public class Student {
    private int studentId;
    private String name;
    private ReportCard reportCard = new ReportCard();

    private static int numberOfStudents=0;

    public Student(String name) {
        this.name = name;
        this.studentId = numberOfStudents + 1;
        numberOfStudents++;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public ReportCard getReportCard() {
        return reportCard;
    }

}
