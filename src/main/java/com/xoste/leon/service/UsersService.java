package com.xoste.leon.service;

import com.xoste.leon.pojo.Users;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Leon
 */
@Service
public interface UsersService {
    /**显示所有的用户
     * @return Users
     */
    List<Users> showAll();
}
