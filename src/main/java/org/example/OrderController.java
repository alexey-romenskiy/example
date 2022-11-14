package org.example;

import org.springframework.lang.NonNull;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class OrderController {

    @NonNull
    private final MyRepository repository;

    public OrderController(@NonNull MyRepository repository) {
        this.repository = repository;
    }

    @Transactional
    @PostMapping("/order2")
    public OrderResponse order(@RequestBody OrderRequest request) {

        final var order = new Order();
        order.setAmount(request.amount());
        repository.save(order);

//        throw new IllegalArgumentException();
        return new OrderResponse(order.getId());
    }
}
