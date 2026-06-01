package lecture.chapter9;

import java.util.Comparator;

public class StudentSortedByName implements Comparator<Student> {
  @Override
    public int compare(Student o1, Student o2) {

        if(!o1.getFamilyName().equals(o2.getFamilyName())) {
          return o1.getFamilyName().compareTo(o2.getFamilyName());
        }

        return o1.getFirstName().compareTo(o2.getFirstName());
  }
}
