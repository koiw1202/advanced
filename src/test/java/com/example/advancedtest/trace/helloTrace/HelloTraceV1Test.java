package com.example.advancedtest.trace.helloTrace;

import advancedtest.app.trace.TraceStatus;
import advancedtest.app.trace.helloTrace.HelloTraceV1;
import org.junit.jupiter.api.Test;

/**
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-07-09        koiw1       최초 생성
 */
public class HelloTraceV1Test {

    @Test
    void begin_end() {
        HelloTraceV1 trace = new HelloTraceV1() ;
        TraceStatus status = trace.begin("hello") ;
        trace.end(status) ;
    }

    @Test
    void begin_exception() {
        HelloTraceV1 trace = new HelloTraceV1() ;
        TraceStatus status = trace.begin("hello") ;
        trace.exception(status, new IllegalStateException()) ;
    }

}
