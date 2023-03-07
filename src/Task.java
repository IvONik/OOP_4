import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Task implements Serializable {
    private int id;
    private String task;
    private LocalDate date;
    private LocalTime time;
    private String dedline;
    private String author;

    public Task(int id, String task, LocalDate date, LocalTime time, String dedline, String author) {
        this.id = id;
        this.task = task;
        this.date = date;
        this.time = time;
        this.dedline = dedline;
        this.author = author;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public LocalDate getDate() {
        return date;
    }

    public  void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getDedline() {
        return dedline;
    }

    public void setDedline(String dedline) {
        this.dedline = dedline;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return
                "id = " + id +
                ", task = " + task +
                ", date = " + date +
                ", time = " + time +
                ", dedline = " + dedline +
                ", author = " + author;
    }
}
