package com.nchu.warehouse.service.impl;

import com.nchu.warehouse.entity.User;
import com.nchu.warehouse.mapper.UserMapper;
import com.nchu.warehouse.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author youmoweidai
 * @since 2021-01-08
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
