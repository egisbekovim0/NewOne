import java.util.List;
public class GradeCalculator implements PercentageCalculator, GPAcalculator {

    @Override
    public double calculatePercentage(Student student) {

        double totalGrades = 0;
        List<Course> courses = student.getCourses();
        int totalCourses = courses.size();

        for (Course course : courses) {
            totalGrades += course.getGrade();
        }

        return totalGrades / totalCourses;
    }

    @Override
    public double calculateGPA(Student student) {
        int b = 6;
        double totalGrades = 0;
        List<Course> courses = student.getCourses();
        int totalCourses = courses.size();

        for (Course course : courses) {
            totalGrades += course.getGrade() / 25;
        }

        return totalGrades / totalCourses;
    }
}



