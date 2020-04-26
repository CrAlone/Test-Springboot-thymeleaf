package com.duyi.service;

import com.duyi.dao.GuestDao;
import com.duyi.domain.Guest;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GuestServiceImp implements BaseGuestService{
    @Autowired
    private GuestDao dao;
    public List<Guest> queryGuest() {
        return dao.query();
    }

    @Override
    public void add(Guest guest) {
        dao.add(guest);
    }
    @Override
    public Guest guestFindByName(String name) {
        return dao.guestFindByName(name);
    }

    @Override
    public void update(Guest guest) {
        dao.update(guest);
    }

    @Override
    public void delete(String name) {
        dao.delete(name);
    }
}
