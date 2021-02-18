package com.honyelchak.gulimall.order.dao;

import com.honyelchak.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author honyelchak
 * @email 554417388@qq.com
 * @date 2021-01-27 15:15:20
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
