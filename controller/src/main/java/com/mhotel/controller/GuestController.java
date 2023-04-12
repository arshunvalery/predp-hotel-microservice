package com.mhotel.controller;

import com.mhotel.dao.model.Guest;
import com.mhotel.service.api.service.GuestService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/guests")
public class GuestController {

    private final GuestService guestService;

    @PostMapping("/microcreate")
    public Guest create(@RequestBody Guest guest) {
        log.info("Я - МЕТОД СОЗДАНИЯ В КОНТРОЛЛЕРЕ ГОСТЯ!!!");
        return guestService.create(guest);
    }

    @DeleteMapping("/microdelete/{id}")
    public UUID deleteById(@PathVariable UUID id) {
        log.info("Я - МЕТОД УДАЛЕНИЯ ОДНОГО В КОНТРОЛЛЕРЕ ГОСТЯ!!!");
        return guestService.delete(id);
    }

    @PostMapping("/microupdate")
    public Guest update(@RequestBody Guest guest) {
        log.info("Я - МЕТОД ИЗМЕНЕНИЯ ОДНОГО В КОНТРОЛЛЕРЕ ГОСТЯ!!!");
        return guestService.update(guest);
    }
}
