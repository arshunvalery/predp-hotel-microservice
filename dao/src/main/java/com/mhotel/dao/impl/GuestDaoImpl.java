package com.mhotel.dao.impl;

import com.mhotel.dao.api.GuestDao;
import com.mhotel.dao.api.GuestJpaRepository;
import com.mhotel.dao.model.Guest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@RequiredArgsConstructor
public class GuestDaoImpl implements GuestDao{

    private final GuestJpaRepository guestJpaRepository;

    @Override
    public Guest save(Guest entity) { return guestJpaRepository.save(entity); }

    @Override
    public UUID delete(UUID id) {
        guestJpaRepository.deleteById(id);
        return id;
    }

    @Override
    public Guest update(Guest entity) {
        return guestJpaRepository.save(entity);
    }
}