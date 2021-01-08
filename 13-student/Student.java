public class Student {
    private String name;
    private String OSIS;
    private int[] grades = new int[10];

    public void addGrade (int x) {
        int i = 0;
        if (this.grades[i] != 0) {
            i++;
        }
        this.grades[i] = x;
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
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOSIS() {
        return OSIS;
    }

    public void setOSIS(String OSIS) {
        this.OSIS = OSIS;
    }

    public double calculateAverage(){
        return calculateAverage();
    }
}

