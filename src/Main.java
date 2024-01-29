import java.time.LocalTime;
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Current time is:" + klockan());
    }
    public static String klockan(){
        LocalTime currentTime = LocalTime.now();
        String time = currentTime.toString();
        return (time);
    }
}