package com.duyi.service;

import com.duyi.domain.Guest;

import java.util.List;

public interface BaseGuestService {
    /**
     * 查询所有人员及其职称
     * @return 返回所有人员及其职称
     */
  List<Guest> queryGuest();

    /**
     * 添加一行信息
     * @param guest 添加的对象
     */
  void add(Guest guest);

    /**
     * 查询一行记录
     * @param name 对应的名字
     * @return 返回一行记录
     */
  Guest guestFindByName(String name);

  /**
   * 修改信息
   * @param guest 修改对象
   */
  void update(Guest guest);

  /**
   * 删除一条信息
   * @param name 对应的名字
   */
  void delete(String name);
}
