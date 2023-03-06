package com.paultraynor.lil.sbet.landon.roomwebapp.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paultraynor.lil.sbet.landon.roomwebapp.models.Room;

public interface RoomRepository extends JpaRepository<Room, Long> {

}
