package javaMid2.genegic.test.exam;

public class Shuttle <T extends Biounit>{
    private T unit;


    public void in(T t)
    {

        this.unit = t;
    }


    public void showInfo()
    {
        System.out.println("이름 :"+ unit.getName() + ", hp :" + unit.getHp());
    }
}
