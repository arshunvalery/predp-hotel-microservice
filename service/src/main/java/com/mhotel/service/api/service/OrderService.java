package com.mhotel.service.api.service;

import com.mhotel.dao.model.Order;

public interface OrderService {

    Boolean isPossiblePurchase(Order order);
}
