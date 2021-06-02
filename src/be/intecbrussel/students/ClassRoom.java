package be.intecbrussel.students;

public class ClassRoom {
    private Student[] students = new Student[15];
    private String nameOfClass;


    public ClassRoom(String nameOfClass) {
        this.nameOfClass = nameOfClass;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void addStudent(Student student){
        for(int i = 0; i< students.length;i++){
            if(students[i] == null){
                students[i] = student;
                break;
            }
        }
    }

    public String getNameOfClass() {
        return nameOfClass;
    }

    public void setNameOfClass(String nameOfClass) {
        this.nameOfClass = nameOfClass;
    }



    public double getClassAverageGrade(){
        double average = 0;
        int counter = 0;
        for (int i = 0; i< students.length;i++) {
            if (students[i]!=null){
                average += students[i].getReportCard().getAverageGrade();
                counter++;
            }
        }
        if (counter==0){
            return 0;
        }
        average = average/counter;
        return average;
    }

    public void printListOfStudentNames(){
        for (Student student: students) {
            if (student != null){
                System.out.println(student.getName());
            }
        }


    }
}
