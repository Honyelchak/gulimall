package com.honyelchak.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.honyelchak.common.utils.PageUtils;
import com.honyelchak.gulimall.coupon.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author honyelchak
 * @email 554417388@qq.com
 * @date 2021-01-27 15:11:37
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

