package Todo_list;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Calendar;

public class Edit {
    public static Scanner sc = new Scanner(System.in);
    public static int maxNumberOftasks = 50;

    static Task[] arrayOftasks = new Task[50];

    public static void addTask(){
        SimpleDateFormat date = new SimpleDateFormat("yyyy/mm/dd");
        System.out.println("Name a new task: ");
        String newTask = sc.nextLine();
        System.out.println("Enter a deadline for a task: ");
       // String date = sc.nextLine();

        Task task = new Task(false, date, newTask);

       // for (int a = 0; a <= maxNumberOftasks; a++){
       // }

    }

    public static void display(){

    }



}
