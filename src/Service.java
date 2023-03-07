import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.Scanner;

public class Service implements Serializable {
//    private Task task;
    private static List<Task> taskList;
    private static int id;

    public Service(List<Task> taskList) {
        this.taskList = taskList;
        int id=0;
    }

    public static void addTask(String task, LocalDate date, LocalTime time, String dedline, String author){
        Task task1 = new Task(id++, task, date,time,dedline, author );
        taskList.add(task1);
    }
    public static void showAll(List<Task> taskList){
        for (Task task : taskList) {
            System.out.println(task);
        }
    }
    public static void createTask(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Напишите заголовок: ");
        String task = scanner.nextLine();

        System.out.println("Срок исполнения: ");
        String dedline = scanner.nextLine();

        System.out.println("Автор: ");
        String author = scanner.nextLine();

        addTask(task, LocalDate.now(), LocalTime.now(),dedline, author);

    }
}
