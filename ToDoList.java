public class ToDoList{
    
    int taskCount;
    Task tasks[] = new Task[taskCount];

    public ToDoList(int capacity){
        
        
    }

    public void addTask(Task task){
        if(taskCount<tasks.length){
            tasks[taskCount] = task;
            taskCount++;
        }

    }

    public void removeTask(){

    }

    public void getTasks(Task task){
        System.out.println("Title: " + task.title + "\nDescription: " + task.description + "\nCompletion Status: " + task.isComplete);
    }

    public void getToDoList(){
        for(Task task : tasks){
            System.out.println(task.title + "\n" + task.description + "\n" + task.isComplete + taskCount);
        }
        
        
    }

}
