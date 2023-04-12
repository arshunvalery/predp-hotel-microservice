package com.mhotel.service.impl;

import com.mhotel.dao.api.OrderDao;
import com.mhotel.dao.model.Order;
import com.mhotel.service.api.service.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderDao orderDao;

    @Transactional
    @Override
    public Boolean isPossiblePurchase(Order entity) {
        log.info("Я - МЕТОД ПРОВЕРКИ ОПЛАТЫ В СЕРВИСЕ ЗАКАЗА!!!");
        return orderDao.isPossiblePurchase(entity);
    }
}
