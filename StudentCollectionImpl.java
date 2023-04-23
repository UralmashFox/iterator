import java.util.ArrayList;
import java.util.List;

public class StudentCollectionImpl implements StudentCollection {

    private List<Student> studentsList;

    public StudentCollectionImpl() {//TODO}

        public void addStudent(Student s) {//TODO}

            public void removeStudent(Student s) {//TODO}

                @Override
                public StudentIterator iterator(StudentCourseEnum course) {
                    return new StudentIteratorImpl(course, this.studentsList);
                }

                private class StudentIteratorImpl implements StudentIterator {

                    private StudentCourseEnum course;
                    private List<Student> students;
                    private int position;

                    public StudentIteratorImpl(//...) {//TODO}

                                               @Override
                                               public boolean hasNext() {//TODO}

                        @Override
                        public Student next() {//TODO}
                        }
                    }