package com.xoste.leon.mapper;

import com.xoste.leon.pojo.Users;

import java.util.List;

/**
 * @author Leon
 */
public interface UsersMapper {
    /**
     * 查询所有的用户
     * @return List<Users></Users>
     */
    List<Users> selectAllUsers();
}
