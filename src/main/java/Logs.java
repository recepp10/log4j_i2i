import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Logs {


    static Logger logger=Logger.getLogger(Logs.class);

    public Logs() {
        DOMConfigurator.configure("log4j.xml");
    }


    public void info(String message){
        logger.info(message);


    }

    public void debug(String message){
       logger.debug(message);

    }

    public void error(String message){
        logger.error(message);
    }
}
