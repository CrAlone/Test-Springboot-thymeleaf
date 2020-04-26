package com.duyi.dao;

import com.duyi.domain.Guest;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class GuestDao {
    private static List<Guest> guestList = new ArrayList<>();
    static {
        guestList.add(new Guest("陈大大","店长"));
        guestList.add(new Guest("周大大","前台"));
        guestList.add(new Guest("鸟大大","厨师"));
        guestList.add(new Guest("鹏大大","经理"));
        guestList.add(new Guest("尾巴","服务员"));
    }
    /**
     * 查询所肉人员
     * @return 返回所有人员
     */
    public List<Guest> query(){
        return guestList;
    }

    /**
     * 添加一行信息
     * @param guest 一个对象
     */
    public void add(Guest guest){
        guestList.add(guest);
    }

    /**
     * 查询一行记录
     * @param name 对应的名字
     * @return 返回对应的对象
     */
    public Guest guestFindByName(String name){
        for (int i=0;i<guestList.size();i++){
            Guest guest = guestList.get(i);
            if (guest.getName().equals(name)){
                return guest;
            }
        }
        return new Guest("","");
    }
    /**
     * 修改一条信息
     * @param guest 修改的对象
     */
    public void update(Guest guest){
      Guest guest1 = guestFindByName(guest.getName());
      guest1.setTitle(guest.getTitle());
    }
    public void delete(String name){
        Guest guest = guestFindByName(name);
        guestList.remove(guest);
    }
}
