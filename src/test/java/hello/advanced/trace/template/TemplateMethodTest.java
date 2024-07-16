package hello.advanced.trace.template;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-07-16        koiw1       최초 생성
 */

@Slf4j
public class TemplateMethodTest {

    @Test
    void templateMethodV0() {
        logic1() ;

    }

    private void logic1() {
        long startTime = System.currentTimeMillis() ;

        log.info("비즈니스 로직1 실행") ;
        long endTime = System.currentTimeMillis() ;
        long resultTime = endTime - startTime ;

        log.info("resultTiem = {} ", resultTime);


    }

}

