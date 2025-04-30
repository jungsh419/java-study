package javaMid2.collection.map.test.task;

import java.util.ArrayDeque;
import java.util.Queue;

public class TaskScheduler {
    private Queue<Task> tasks = new ArrayDeque<>();

    public void addTask(Task task)
    {
        tasks.offer(task);
    }
    public int getRemainingTasks()
    {
        return tasks.size();
    }

    public void processNextTask()
    {

        if(tasks != null)
        {
            tasks.poll().execute();
        }
    }
}
