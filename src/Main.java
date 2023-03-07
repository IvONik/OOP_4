import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

//С учетом информации полученной ранее знакомимся с параметрическим полиморфизмом и продолжаем погружаться в ООП.
// Спроектировать и реализовать планировщик дел для работы с задачами разных приоритетов.
//
// Например:
// определить уровень приоритетов: низкий, средний, немедленное выполнение
// выделить компоненту для хранения данных
// выделить компоненту для организации импорта\экспорта данных
// Файл должен содержать следующие данные: id, дату добавления записи, время добавления записи, дедлайн задачи, ФИО автора,
// данные хранятся в файле csv/jsom/xml
public class Main {
    public static void main(String[] args) {
        List<Task>taskList = new ArrayList<>();

        Service service = new Service(taskList);
        service.addTask("Сделать домашку", LocalDate.now(), LocalTime.now(),"07.03.2023", "Иванов");
        service.addTask("Позвонить учителю", LocalDate.now(), LocalTime.now(),"08.03.2023", "Иванова");
//        System.out.println(taskList);
        Service.showAll(taskList);

        Service.createTask();
        Service.showAll(taskList);
        Record.write(taskList);
        Record.read();
    }
}