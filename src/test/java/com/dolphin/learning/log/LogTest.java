package com.dolphin.learning.log;

import lombok.extern.java.Log;
import org.junit.Test;

@Log
public class LogTest {

    @Test
    public void testInfo(){
        log.info("info....");
        log.warning("debug....");

    }
}
