import java.util.Arrays;

public class Student {
    private String name;
    private String OSIS;
    private int[] grades;

    public double calculateAverage(){
        int i = 0;
        double sum = 0;
        while (i < 10 && this.grades[i] != 0) {
            sum += this.grades[i];
            i++;
        }
        return sum / i;
    }




    public void addGrade (int grade) {
        int i = 0;
        while (this.grades[i] != 0) {
            i++;
        }
        this.grades[i] = grade;
    }

    public void fillGrades() {
        for (int i = 0; i < this.grades.length; i++) {
            this.grades[i] = (int) (Math.random() * 46 + 55);
        }
    }


    public Student(String name,String OSIS) {
        this.name = name;
        this.OSIS = OSIS;
        grades = new int[10];
    }

    public Student() {
        name = null;
        OSIS = null;
        grades =new int [10];
    }

    public String toString() {
        return this.name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOSIS() {
        return this.OSIS;
    }

    public void setOSIS(String OSIS) {
        this.OSIS = OSIS;
    }

    public String getGrades() {
        return Arrays.toString(grades);
    }
}

