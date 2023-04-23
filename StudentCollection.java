public interface StudentCollection {

    public void addStudent(Student s);

    public void removeStudent(Student s);

    public StudentIterator iterator(StudentCourseEnum course);

}