package javaMid1.lang.immutable;

public class MyDataMain {
    public static void main(String[] args) {
        ImmutableMyData date1 = new ImmutableMyData(2024,1,1);
        ImmutableMyData data2 = date1;
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + data2);
        System.out.println("2025 -> date1");
        date1 = date1.setYear(2025);
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + data2);
    }
}
