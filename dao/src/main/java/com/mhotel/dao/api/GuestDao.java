package com.mhotel.dao.api;

import com.mhotel.dao.model.Guest;

import java.util.UUID;

public interface GuestDao {

    Guest save(Guest entity);

    UUID delete(UUID id);

    Guest update(Guest entity);
}

