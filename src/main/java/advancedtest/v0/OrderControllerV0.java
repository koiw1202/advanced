package advancedtest.v0;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-07-08        koiw1       최초 생성
 */

@RestController
public class OrderControllerV0 {

    private final OrderServiceV0 orderServiceV0 ;

    public OrderControllerV0(OrderServiceV0 orderServiceV0) {
        this.orderServiceV0 = orderServiceV0;
    }

    @GetMapping("/v0/request")
    public String request(String itemId) {
        orderServiceV0.orderItem(itemId) ;
        return "ok" ;
    }


}
