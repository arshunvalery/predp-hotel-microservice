package com.mhotel.service.impl;

import com.mhotel.dao.api.GuestDao;
import com.mhotel.dao.model.Guest;
import com.mhotel.service.api.service.GuestService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class GuestServiceImpl implements GuestService {

    private final GuestDao guestDao;

    @Transactional
    @Override
    public Guest create(Guest entity) {
        log.info("Я - МЕТОД СОЗДАНИЯ В СЕРВИСЕ ГОСТЯ!!!");
        return guestDao.save(entity);
    }

    @Transactional
    @Override
    public UUID delete(UUID id) {
        log.info("Я - МЕТОД УДАЛЕНИЯ ОДНОГО В СЕРВИСЕ ГОСТЯ!!!");
        return guestDao.delete(id);
    }

    @Transactional
    @Override
    public Guest update(Guest entity) {
        log.info("Я - МЕТОД ИЗМЕНЕНИЯ ОДНОГО В СЕРВИСЕ ГОСТЯ!!!");
        return guestDao.update(entity);
    }
}
