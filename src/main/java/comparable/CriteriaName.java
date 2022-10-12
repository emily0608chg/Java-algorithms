package comparable;

public class CriteriaName extends Criteria<Student>{

    @Override
    public int compare(Student a, Student b) {
        return a.getName().compareTo(b.getName());
    }
}
