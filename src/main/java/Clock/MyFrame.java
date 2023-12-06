package Clock;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyFrame extends JFrame {

    Calendar calendar;
    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    JLabel timeLabel;
    JLabel dayLabel;
    String time;
    String day;



    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("My first Clock Program");
        this.setLayout(new FlowLayout());
        this.setSize(350, 200);
        this.setResizable(false);
        timeFormat = new SimpleDateFormat("hh:mm:ss ");
        dayFormat = new SimpleDateFormat("E");

        timeLabel = new JLabel();
        dayLabel = new JLabel();
        dayLabel.setFont(new Font("Verdana", Font.PLAIN,35));
        day = dayFormat.format(Calendar.getInstance().getTime());
        timeLabel.setFont(new Font("Verdana", Font.PLAIN,50));
        timeLabel.setForeground(new Color(0x00FF00));
        timeLabel.setBackground(Color.black);
        timeLabel.setOpaque(true);
        time = timeFormat.format(Calendar.getInstance().getTime());
        timeLabel.setText(time);
        this.add(timeLabel);
        this.setVisible(true);
        this.add(dayLabel);

        setTime();
    }
    public void setTime(){
        while (true){
            time = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);

            day = dayFormat.format(Calendar.getInstance().getTime());
            dayLabel.setText(day);


        try{
            Thread.sleep(1000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }


        }
    }
}
