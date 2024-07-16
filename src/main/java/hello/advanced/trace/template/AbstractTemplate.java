package hello.advanced.trace.template;

import hello.advanced.LogTrace;
import hello.advanced.trace.TraceStatus;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

/**
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-07-16        koiw1       최초 생성
 */
@Slf4j
public abstract class AbstractTemplate<T> {

    private final LogTrace trace ;

    public AbstractTemplate(LogTrace trace) {
        this.trace = trace ;
    }

    public T execute(String message) {
        TraceStatus status = null ;

        try {
            status = trace.begin("OrderController.request()") ;

            T result = call() ;

            trace.end(status) ;

            return result ;

        } catch(Exception e) {
            trace.exception(status, e) ;
            throw e ;
        }

    }

    protected abstract T call() ;

}
