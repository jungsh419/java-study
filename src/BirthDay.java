import javax.swing.plaf.basic.BasicViewportUI;

public class BirthDay {
    private  String name = "성훈이";
    private  String date = "4월 19일";
    private  int  age = 25;

    public  String getName() {
        return name;
    }

    public  String getDate() {
        return date;
    }

    public int getAge() {
        return age;
    }
    public void print()
    {
        System.out.println("오늘은 " + getDate());
        System.out.printf(getName()+"의 "+ getAge() + " 번째 생일을 축하해!");
    }
    public static void main(String[] args) {

        BirthDay birthDay = new BirthDay();
        birthDay.print();

    }

}
