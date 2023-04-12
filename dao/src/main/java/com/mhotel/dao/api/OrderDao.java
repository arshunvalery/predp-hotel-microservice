package com.mhotel.dao.api;

import com.mhotel.dao.model.Order;

public interface OrderDao {
    Boolean isPossiblePurchase(Order order);
}
