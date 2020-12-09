package com.xoste.leon.service.impl;

import com.xoste.leon.mapper.UsersMapper;
import com.xoste.leon.pojo.Users;
import com.xoste.leon.service.UsersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Leon
 */
@Service
public class UsersServiceImpl implements UsersService {
    @Resource
    private UsersMapper usersMapper;
    /**
     * 显示所有的用户
     *
     * @return Users
     */
    @Override
    public List<Users> showAll() {
        return usersMapper.selectAllUsers();
    }
}
