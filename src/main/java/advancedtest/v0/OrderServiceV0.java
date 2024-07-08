package advancedtest.v0;

import org.springframework.stereotype.Service;

/**
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-07-08        koiw1       최초 생성
 */
@Service
public class OrderServiceV0 {

    private final OrderRepositoryV0 orderRepositoryV0 ;

    public OrderServiceV0(OrderRepositoryV0 orderRepositoryV0) {
        this.orderRepositoryV0 = orderRepositoryV0;
    }

    public void orderItem(String itemId) {
        orderRepositoryV0.save(itemId) ;
    }

}
