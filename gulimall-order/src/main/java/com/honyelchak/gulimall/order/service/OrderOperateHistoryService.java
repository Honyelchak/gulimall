package com.honyelchak.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.honyelchak.common.utils.PageUtils;
import com.honyelchak.gulimall.order.entity.OrderOperateHistoryEntity;

import java.util.Map;

/**
 * 订单操作历史记录
 *
 * @author honyelchak
 * @email 554417388@qq.com
 * @date 2021-01-27 15:15:20
 */
public interface OrderOperateHistoryService extends IService<OrderOperateHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

