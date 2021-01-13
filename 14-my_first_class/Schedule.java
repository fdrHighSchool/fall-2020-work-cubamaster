public class Schedule {
    private String[] subjects;
    private String[] bell;

    public Schedule() {
        subjects = new String[7];
        bell = new String[7];
    }

    /**
     * changes a specific subject in the schedule
     * @param subject - name of the subject
     * @param period - period of the subject
     */
    public void changeSubject(String subject, int period) {
        if (period > 7) {
            System.out.println("ERROR: maximum 7 lessons");
        }
        this.subjects[period-1] = subject;
    } // close changeSubject

    /**
     * changes a specific bell in the bell
     * @param bell - time when period starts and end
     * @param period - period of the lesson
     */
    public void changeBell(String bell, int period) {
        if (period > 7) {
            System.out.println("ERROR: maximum 7 lessons");
        }
        this.bell[period-1] = bell;
    } // close changeBell

    /**
     * shows all subjects schedule
     */
    public void getSubjectsSchedule() {
        for (int i = 0 ; i < this.subjects.length; i++) {
            System.out.println("Period " + (i+1) + " " + this.subjects[i]);
        }
    }// close getSubjectsSchedule

    /**
     * shows all bells schedule
     */
    public void getBellSchedules () {
        for (int i = 0 ; i < this.subjects.length; i++) {
            System.out.println("Period " + (i+1) + " " + this.bell[i]);
        }
    }// close getBellSchedules

    /**
     * add a subject into schedule
     * @param subject - name of the subject
     */
    public void addSubject(String subject) {
        for (int i = 0; i < this.subjects.length; i++) {
            if (this.subjects[i] == null) {
                this.subjects[i] = subject;
                return;
            }
        }
        System.out.println("ERROR: You have already filled out the schedule");
    } // close addSubject

    /**
     * add a bell into schedule
     * @param subject
     */
    public void addBell(String subject) {
        for (int i = 0; i < this.bell.length; i++) {
            if (this.bell[i] == null) {
                this.bell[i] = subject;
                return;
            }
        }
        System.out.println("ERROR: You have already filled out the schedule");
    } // close addBell

    /**
     * subjects getter
     * @return - array of subjects
     */
    public String[] getSubjects() {
        return this.subjects;
    }// close getSubjects

    /**
     * bells getter
     * @return - array of grades
     */
    public String[] getBell() {
        return this.bell;
    } // close getBell

} // close Schedule class
