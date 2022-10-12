package practice.book;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class DatePractice {

    int day;
    int month;
    int year;

    public DatePractice(String s)
    {

        int pos1 = s.indexOf('/');

        int pos2 = s.lastIndexOf('/');

        String sDay = s.substring(0,pos1);
        day = Integer.parseInt(sDay);

        String sMonth = s.substring(pos1+1,pos2);
        month = Integer.parseInt(sMonth);

        String sYear = s.substring(pos2+1);
        year = Integer.parseInt(sYear);

    }

    public DatePractice(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    //return final Date
    private int dateToDays(){

        return year*360 +month*30 + day;
    }

    //assign de date in days to attributes

    private void dayToDate(int i){

         year = (int) i/360;

         int rest = i % 360;

         month = (int) rest /30;

         day = rest %30;

        if (day == 0) {

            day = 30;
            month --;
        }

        if (month == 0) {
            month = 12;
            year --;
        }
    }

    public void addDays (int d){
        int sum = dateToDays() + d;

        dayToDate(sum);
    }
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof DatePractice)) return false;

        DatePractice that = (DatePractice) o;

        return new EqualsBuilder().append(day, that.day).append(month, that.month).append(year, that.year).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(day).append(month).append(year).toHashCode();
    }

    @Override
    public String toString() {
        return "DatePractice{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
