package comparable;

public class CriteriaNotaPom extends Criteria<Student>{

    @Override
    public int compare(Student a, Student b) {
        double diff = a.getNotaProm()- b.getNotaProm();
        return diff > 0 ? 1 : diff < 0 ? -1 : 0;
    }
}
