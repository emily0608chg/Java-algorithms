package comparable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Student implements Comparable<Student> {

    private String name;
    private int age;
    private double notaProm;

    // constructor
    public Student(String name, int age, double np) {
        this.name = name;
        this.age = age;
        this.notaProm = np;
    }

    // method inheritance of Comparable interface
    public int compareTo(Student anotherStudent) {
        return this.age - anotherStudent.age;
    }

    public String toString() {
        return name + ", " + age + ", " + notaProm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getNotaProm() {
        return notaProm;
    }

    public void setNotaProm(double notaProm) {
        this.notaProm = notaProm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof Student)) return false;

        Student student = (Student) o;

        return new EqualsBuilder().append(age, student.age).append(notaProm, student.notaProm).append(name, student.name).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name).append(age).append(notaProm).toHashCode();
    }
}