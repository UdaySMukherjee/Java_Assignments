// Abstract class
abstract class Student {

    int[] subjects;

    public Student( int[] subjects) {

        this.subjects = subjects;
    }

    public abstract double calculatePercentage();
}

// Concrete class for a student with 3 subjects
class StudentWith3Subjects extends Student {
    public StudentWith3Subjects( int[] subjects) {
        super( subjects);

    }

    @Override
    public double calculatePercentage() {
        int total = 0;
        for (int mark : subjects) {
            total += mark;
        }
        return (double) total / 3;
    }
}

// Concrete class for a student with 4 subjects
class StudentWith4Subjects extends Student {
    public StudentWith4Subjects( int[] subjects) {
        super(subjects);

    }

    @Override
    public double calculatePercentage() {
        int total = 0;
        for (int mark : subjects) {
            total += mark;
        }
        return (double) total / 4;
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        // Example usage
        int[] student1Marks = {80, 90, 75};
        StudentWith3Subjects student1 = new StudentWith3Subjects(student1Marks);
        System.out.println(" percentage: " + student1.calculatePercentage());

        int[] student2Marks = {85, 92, 78, 88};
        StudentWith4Subjects student2 = new StudentWith4Subjects(student2Marks);
        System.out.println(" percentage: " + student2.calculatePercentage());
    }
}
