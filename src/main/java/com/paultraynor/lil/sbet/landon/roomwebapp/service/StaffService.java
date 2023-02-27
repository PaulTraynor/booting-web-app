package com.paultraynor.lil.sbet.landon.roomwebapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.paultraynor.lil.sbet.landon.roomwebapp.models.Position;
import com.paultraynor.lil.sbet.landon.roomwebapp.models.Staff;

@Service
public class StaffService {

    private static final List<Staff> staff = new ArrayList<>();
    static {
        staff.add(new Staff(UUID.randomUUID().toString(), "Flavius", "Ferox", Position.SECURITY));
        staff.add(new Staff(UUID.randomUUID().toString(), "Robert", "Jordan", Position.MANAGER));
        staff.add(new Staff(UUID.randomUUID().toString(), "Paul", "Atreides", Position.FRONT_DESK));
        staff.add(new Staff(UUID.randomUUID().toString(), "Gordon", "Ramsay", Position.CHEF));
    }

    public List<Staff> getAllStaff() {
        return staff;
    }
}
