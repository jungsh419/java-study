package javaMid1.lang.immutable;

public class ImmutableMyData {
    private final int year;
    private final int month;
    private final int day;

    public ImmutableMyData(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public ImmutableMyData setYear(int year) {

        return new ImmutableMyData(year,this.month,this.day);
    }
    public ImmutableMyData setMonth(int month) {

        return new ImmutableMyData(this.year,month,this.day);
    }
    public ImmutableMyData setDay(int day) {
        return new ImmutableMyData(this.year,this.month,day);
    }
    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}
