package com.paultraynor.lil.sbet.landon.roomwebapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.paultraynor.lil.sbet.landon.roomwebapp.data.StaffRepository;
import com.paultraynor.lil.sbet.landon.roomwebapp.models.Staff;

@Service
public class StaffService {

    private final StaffRepository staffRepository;

    public StaffService(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    public List<Staff> getAllStaff() {
        return staffRepository.findAll();
    }
}
