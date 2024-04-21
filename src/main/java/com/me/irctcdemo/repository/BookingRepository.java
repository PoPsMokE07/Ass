package com.me.irctcdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.me.irctcdemo.model.Booking;
@Repository
public interface BookingRepository extends JpaRepository<Booking,Long> {
Booking getById(long id);
}
