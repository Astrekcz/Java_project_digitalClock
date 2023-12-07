package Todo_list;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Task {
    private String task;
    private SimpleDateFormat deadLine;
    private boolean status;

    Task(boolean status, SimpleDateFormat deadLine, String task){
        this.deadLine = deadLine;
        this.status = status;
        this.task = task;
    }
    public String getTask(){
        return task;
    }
    public SimpleDateFormat getDeadLine(){
        return deadLine;
    }
    public boolean getStatus(){
        return status;
    }
    public void setTask(String task){
        this.task = task;
    }
    public void setStatus(boolean status){
        this.status = status;

    }
    public void setDeadLine(SimpleDateFormat deadLine) {
        this.deadLine = deadLine;
    }
}
