public class Student {
    private String name;
    private String OSIS;
    private int[] grades;

    public Student(String name,String OSIS) {
        this.name = name;
        this.OSIS = OSIS;
        grades = new int[10];
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

