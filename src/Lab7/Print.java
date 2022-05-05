package by;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Print {
    static Logger logger = LogManager.getLogger();

    public void printError(String message){logger.error(message);}

    public void print(String message){logger.info(message);}

    public void print(boolean message){logger.info(message);}

    public void print(int message){logger.info(message);}

    public void print(long message){logger.info(message);}

    public void print(double message){logger.info(message);}
}
