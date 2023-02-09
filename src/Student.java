class Student {
    private String name;
    private String studentID;
    private List<Grades> grades;

    public Student(String name, String studentID) {
        this.name = name;
        this.studentID = studentID;
        this.grades = new ArrayList<>();
    }

    public void addGrade(Grades grade) {
        this.grades.add(grade);
    }

    public String getName() {
        return name;
    }

    public String getStudentID() {
        return studentID;
    }

    public List<Grades> getGrades() {
        return grades;
    }
}
