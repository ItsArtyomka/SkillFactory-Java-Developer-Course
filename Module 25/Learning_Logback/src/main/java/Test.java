import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;

public class Test {
    private static final Logger logger = (Logger) LoggerFactory.getLogger(Test.class);

    public static void main(String[] args) {
        logger.info("Test log from {}", Test.class.getSimpleName());
    }
}
