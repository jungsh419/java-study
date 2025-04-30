package javaMid2.collection.map.test.task;

import javaMid2.collection.map.test.task.Task;

public class CleanTask implements Task {
    @Override
    public void execute() {
        System.out.println("사용하지 않는 자원 정리...");
    }
}
