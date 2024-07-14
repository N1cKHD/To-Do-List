public class App {
    public static void main(String[] args) throws Exception {
        //To do list
        Task task1 = new Task("Do Homework", "Finish Linux OS Homework", false);

        ToDoList toDoList1 = new ToDoList(task1);

        //System.out.println(toDoList1.getTasks(task1));

        toDoList1.getTasks(task1);
    }
}
