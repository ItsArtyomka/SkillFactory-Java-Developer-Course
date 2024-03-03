import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestLog {
    private static final Logger log = LogManager.getLogger(TestLog.class);
    public static void main(String[] args){
        log.info("This is an INFO message!");
        log.error("This is an ERROR message!");
    }
}

