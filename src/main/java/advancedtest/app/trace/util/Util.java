package advancedtest.app.trace.util;

/**
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-07-13        koiw1       최초 생성
 */
public class Util {

    ThreadLocal threadLocal = new ThreadLocal() ;

    public void addingThreadLocal() {
        threadLocal.set("test") ;
    }

}
