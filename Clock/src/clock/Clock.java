package clock;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Clock extends Frame{

    
    Calendar calender;
    SimpleDateFormat timeformat,dayformat,dateformat;
    Label timeLabel,dayLabel,dateLabel;
    String time="",day="",date="";
    Clock()
    {
       Image icon = Toolkit.getDefaultToolkit().getImage("src/clock/download.jfif");    
       setIconImage(icon); 
        
       setTitle("Clock");
       setLayout(new FlowLayout());
       setSize(350,200);
       setResizable(false);
       setForeground(Color.GREEN);
       setBackground(Color.black);
       Font font = new Font("Dsdigital",Font.PLAIN,22);
       
       timeformat = new SimpleDateFormat("hh:mm:ss a");
       dayformat = new SimpleDateFormat("E ,");
       dateformat = new SimpleDateFormat("MM-dd-yyyy");
       
       timeLabel = new Label();
       timeLabel.setFont(new Font("Verdana",Font.PLAIN,50));
       
       dayLabel = new Label();
       dayLabel.setFont(font);
       
       dateLabel = new Label();
       dateLabel.setFont(font);
 
       
       add(timeLabel);
       add(dayLabel);
       add(dateLabel);
       
       setVisible(true);
       
       setTime();
    }
    public void setTime(){
        while(true)
        {
            time = timeformat.format(Calendar.getInstance().getTime());
       
            timeLabel.setText(time);
            
            
            day = dayformat.format(Calendar.getInstance().getTime());
       
            dayLabel.setText(day);
            
            date = dateformat.format(Calendar.getInstance().getTime());
       
            dateLabel.setText(date);
            try{
                Thread.sleep(1000);
            }catch(Exception e)
            {
                e.printStackTrace();
            }
            
        }
        
    }
    public static void main(String[] args) {
       new Clock();
    }
    
}
