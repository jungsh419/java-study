package javaMid2.collection.map.test.task;

import javaMid2.collection.map.test.task.Task;

public class BackupTask implements Task {
    @Override
    public void execute() {
        System.out.println("자료 백업...");
    }

}
