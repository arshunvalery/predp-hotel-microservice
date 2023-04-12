package com.mhotel.controller;

import com.mhotel.dao.model.Order;
import com.mhotel.service.api.service.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/orders")
public class OrderController {
    private final OrderService orderService;

    @PostMapping("/possible")
    public Boolean isPossiblePurchase(@RequestBody Order order) {
        log.info("Я - МЕТОД ПРОВЕРКИ ОПЛАТЫ В КОНТРОЛЛЕРЕ ЗАКАЗА!!!");
        return orderService.isPossiblePurchase(order);
    }
}
