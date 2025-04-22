package javaMid2.genegic.test.exam;

public class UnitPrinter {
    public static<T extends Biounit> void printV1(Shuttle<T> shuttle)
    {
        shuttle.showInfo();
    }
    public static void printV2(Shuttle<?> shuttle)
    {
        shuttle.showInfo();
    }
}
