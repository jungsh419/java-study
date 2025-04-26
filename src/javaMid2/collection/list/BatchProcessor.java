package javaMid2.collection.list;

public class BatchProcessor {
    // Array -> Linked가 효율이 좋아서 변경 (구체적인 클래스에 의존한다.)
    private final MyList<Integer> list; // -> 추상적인 인터페이스에 의존

    public BatchProcessor(MyList<Integer> list)
    {this.list = list;}

    public void logic(int size)
    {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0,1);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("size = " + size + ", 계산시간" + -(startTime-endTime) + "ms");
    }

}
