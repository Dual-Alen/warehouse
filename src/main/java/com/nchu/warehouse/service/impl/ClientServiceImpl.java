package com.nchu.warehouse.service.impl;

import com.nchu.warehouse.entity.Client;
import com.nchu.warehouse.mapper.ClientMapper;
import com.nchu.warehouse.service.ClientService;
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
public class ClientServiceImpl extends ServiceImpl<ClientMapper, Client> implements ClientService {

}
