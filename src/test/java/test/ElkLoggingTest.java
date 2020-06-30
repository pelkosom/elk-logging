package test;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class ElkLoggingTest {

    @Test
    public void test() {
        log.info("This is INFO log from test");
        log.debug("This is DEBUG log from test");
        log.warn("This is WARN log from test");
        log.error("This is ERROR log from test");
    }
}
