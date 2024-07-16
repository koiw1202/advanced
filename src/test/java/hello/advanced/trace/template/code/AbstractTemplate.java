package hello.advanced.trace.template.code;

import lombok.extern.slf4j.Slf4j;

/**
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-07-16        koiw1       최초 생성
 */
@Slf4j
public abstract class AbstractTemplate {

    public void execute() {
        long startTime = System.currentTimeMillis() ;
        call() ;
        log.info("비즈니스 로직1 실행") ;
        long endTime = System.currentTimeMillis() ;
        long resultTime = endTime - startTime ;

        log.info("resultTiem = {} ", resultTime);
    }

    protected abstract void call() ;

}
