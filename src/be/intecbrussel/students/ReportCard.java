package be.intecbrussel.students;

public class ReportCard {


    private int[] grades = new int[10];
    private int numberOfGrades = 0;

    public int[] getGrades() {
        return grades;
    }

    public void addGrade(int grade){

        //grades[numberOfGrades] = grade;
        //numberOfGrades++;

        //*********************

        numberOfGrades+=1;
        for (int i= 0; i<grades.length;i++){
            if(grades[i] == 0){
                grades[i] = grade;
                break;
            }
        }


    }
    public double getAverageGrade(){

        if (numberOfGrades == 0){
            return 0;
        }

        double sum =0;



        for (int i = 0; i < numberOfGrades; i++) {
            sum+= grades[i];
        }

        return sum / numberOfGrades;


    }

}
