package com.mhotel.dao.impl;

import com.mhotel.dao.api.GuestJpaRepository;
import com.mhotel.dao.api.OrderDao;
import com.mhotel.dao.model.Guest;
import com.mhotel.dao.model.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class OrderDaoImpl implements OrderDao {

    private final GuestJpaRepository guestJpaRepository;

    @Override
    public Boolean isPossiblePurchase(Order order) {

        int facilitiesPrice = 0;

        for(int i = 0; i < order.getFacilities().size(); i++) {
            facilitiesPrice += order.getFacilities().get(i).getPrice();
        }

        if(order.getRoom().getPrice() + facilitiesPrice <= order.getGuest().getCash()) {
            Guest guest = new Guest();
            guest.setId(order.getGuest().getId());
            guest.setName(order.getGuest().getName());
            guest.setSurname(order.getGuest().getSurname());
            guest.setTel(order.getGuest().getTel());
            guest.setAge(order.getGuest().getAge());
            guest.setGender(order.getGuest().getGender());
            guest.setCash(order.getGuest().getCash() - (order.getRoom().getPrice() + facilitiesPrice));
            guestJpaRepository.save(guest);
            return true;
        }else {
            return false;
        }
    }
}
