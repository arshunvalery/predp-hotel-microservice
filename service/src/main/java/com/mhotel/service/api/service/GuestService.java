package com.mhotel.service.api.service;

import com.mhotel.dao.model.Guest;

import java.util.UUID;

public interface GuestService {

    Guest create(Guest entity);

    UUID delete(UUID id);

    Guest update(Guest entity);
}
