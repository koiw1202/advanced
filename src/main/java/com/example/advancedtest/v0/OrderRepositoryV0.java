package com.example.advancedtest.v0;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

/**
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-07-08        koiw1       최초 생성
 */

@RequiredArgsConstructor
@Repository
public class OrderRepositoryV0 {

    public void save(String itemId) {
        if(itemId.equals("ex")) {
            throw new IllegalStateException() ;
        }
        sleep(1000) ;
    }

    private void sleep(int millis) {
        try {
            Thread.sleep(millis) ;
        } catch (InterruptedException e) {
            e.printStackTrace() ;
        }
    }

}
