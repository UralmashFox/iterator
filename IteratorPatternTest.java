public class IteratorPatternTest {

    public static void main(String[] args) {
        StudentCollection students = populateStudents();
        StudentIterator baseIterator = students.iterator(StudentCourseEnum.ALL);
        while (baseIterator.hasNext()) {
            Student s = baseIterator.next();
            System.out.println(s.toString());
        }
        System.out.println("******");
        // Student Course Iterator
        StudentIterator bachelorIterator = students.iterator(StudentCourseEnum.BACHELOR);
        while (bachelorIterator.hasNext()) {
            Student s = bachelorIterator.next();
            System.out.println(s.toString());
        }
    }

    private static StudentCollection populateStudents() {
        StudentCollection students = new StudentCollectionImpl();
        students.addStudent(new Student(1, StudentCourseEnum.BACHELOR));
        students.addStudent(new Student(2, StudentCourseEnum.BACHELOR));
        students.addStudent(new Student(3, StudentCourseEnum.BACHELOR));
        students.addStudent(new Student(4, StudentCourseEnum.BACHELOR));
        students.addStudent(new Student(1, StudentCourseEnum.MASTER));
        students.addStudent(new Student(2, StudentCourseEnum.MASTER));
        students.addStudent(new Student(1, StudentCourseEnum.PHD));
        students.addStudent(new Student(2, StudentCourseEnum.PHD));
        students.addStudent(new Student(3, StudentCourseEnum.PHD));
        students.addStudent(new Student(4, StudentCourseEnum.PHD));
        students.addStudent(new Student(1, StudentCourseEnum.SU));
        return students;
    }

}