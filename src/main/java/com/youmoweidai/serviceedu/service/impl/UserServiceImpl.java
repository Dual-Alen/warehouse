package com.youmoweidai.serviceedu.service.impl;

import com.youmoweidai.serviceedu.entity.User;
import com.youmoweidai.serviceedu.mapper.UserMapper;
import com.youmoweidai.serviceedu.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author youmoweidai
 * @since 2021-01-06
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
