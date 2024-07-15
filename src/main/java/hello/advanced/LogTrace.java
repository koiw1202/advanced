package hello.advanced;

import hello.advanced.trace.TraceStatus;

/**
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-07-15        koiw1       최초 생성
 */
public interface LogTrace {

    public TraceStatus begin(String message) ;

    public void end(TraceStatus status) ;

    public void exception(TraceStatus status, Exception e) ;
}
