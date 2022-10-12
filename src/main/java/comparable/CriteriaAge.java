package comparable;

public class CriteriaAge extends Criteria<Student>{

    @Override
    public int compare(Student a, Student b) {

        double diff = a.getAge()- b.getAge();
        return diff > 0 ? 1 : diff < 0 ? -1 : 0;
    }
}
