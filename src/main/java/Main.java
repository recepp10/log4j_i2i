import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) throws InterruptedException {



        Logs logger=new Logs();




        for(int i=0;i<30;i++){
            LocalDateTime now=LocalDateTime.now();

            logger.debug("DEBUG: "+now.getHour()+":"+now.getMinute()+":"+now.getSecond());
            logger.debug("INFO: "+now.getHour()+":"+now.getMinute()+":00");
            logger.debug("ERROR: "+now.getHour()+":00:00");
            Thread.sleep(1000);
        }


    }
}
