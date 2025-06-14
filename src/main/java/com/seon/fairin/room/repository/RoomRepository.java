package com.seon.fairin.room.repository;

import com.seon.fairin.room.entity.Room;
import com.seon.fairin.room.dto.RoomStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 
 * @author seonjihwan
 * @version 1.0
 * @since 2025-05-18
 */
public interface RoomRepository extends JpaRepository<Room, String> {
    List<Room> findByStatus(RoomStatus status);
}
