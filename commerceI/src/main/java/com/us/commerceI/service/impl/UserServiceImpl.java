package com.us.commerceI.service.impl;

import com.us.commerceI.entity.User;
import com.us.commerceI.mapper.UserMapper;
import com.us.commerceI.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author us
 * @since 2021-03-01
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
