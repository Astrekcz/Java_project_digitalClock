package Todo_list;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        listOfactions();
        Scanner sc = new Scanner(System.in);
        while(true){
            String userChoice = sc.nextLine();
            switch (userChoice){
                case "1":

                    break;
                case "2":
                    Edit.addTask();
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    sc.close();
                    System.exit(1);
                    break;
            }
        }
    }
    public static void listOfactions(){
        System.out.println("Welcome to to-do list application. Please enter a choice.\n" + "1. display all tasks\n" +
                "2. add task  \n" +
                "3. Save tasks\n" +
                "4. Load tasks\n" +
                "5. exit. ");
    }

}
