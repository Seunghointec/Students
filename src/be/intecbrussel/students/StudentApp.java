package be.intecbrussel.students;

public class StudentApp {

    public static void main(String[] args) {

        System.out.println("welcome to the student app!");

        testClassRoom();

        //testStudentAndReportCard();
        //testStudentClass();
        //testReportCard();

    }

    private static void testClassRoom() {
        ClassRoom classRoom = new ClassRoom("Java magicians");
        classRoom.addStudent(new Student("Danny"));
        classRoom.addStudent(new Student("Alper"));
        classRoom.addStudent(new Student("Otillia"));
        for (Student student: classRoom.getStudents()) {
            if (student!=null) {
                student.getReportCard().addGrade((int) (Math.random() * 10));
                student.getReportCard().addGrade((int) (Math.random() * 10));
            }
        }
        System.out.println(classRoom.getClassAverageGrade());


    }

    private static void testStudentAndReportCard() {
        Student student = new Student("danny");
        student.getReportCard().addGrade(10);
        student.getReportCard().addGrade(8);
        System.out.println(student.getReportCard().getAverageGrade());

    }

    private static void testStudentClass() {
        Student[] students= new Student[10];

        for (int i = 0; i <10; i++){
            students[i] = new Student("bart");
        }
        System.out.println(students[9].getStudentId());

    }

    private static void testReportCard() {
        ReportCard reportCard = new ReportCard();

        reportCard.addGrade(10);
        reportCard.addGrade(6);

        for (int grade: reportCard.getGrades()) {
            if (grade != 0) {
                System.out.println(grade);
            }
        }
        System.out.println(reportCard.getAverageGrade());
    }

}
