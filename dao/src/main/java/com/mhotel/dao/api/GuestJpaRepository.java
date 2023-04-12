package com.mhotel.dao.api;

import com.mhotel.dao.model.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface GuestJpaRepository extends JpaRepository<Guest, UUID> {
}
