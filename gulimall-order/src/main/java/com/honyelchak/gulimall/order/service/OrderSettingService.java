package com.honyelchak.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.honyelchak.common.utils.PageUtils;
import com.honyelchak.gulimall.order.entity.OrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author honyelchak
 * @email 554417388@qq.com
 * @date 2021-01-27 15:15:20
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

