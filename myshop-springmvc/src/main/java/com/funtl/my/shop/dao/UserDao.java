package com.funtl.my.shop.dao;

import com.funtl.my.shop.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface UserDao {
  /**
   * 根据邮箱获取用户
   * @param email
   * @return
   */
  public User getByEmail(String email);
}
