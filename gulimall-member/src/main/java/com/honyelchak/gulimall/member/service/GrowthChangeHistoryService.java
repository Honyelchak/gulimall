package com.honyelchak.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.honyelchak.common.utils.PageUtils;
import com.honyelchak.gulimall.member.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author honyelchak
 * @email 554417388@qq.com
 * @date 2021-01-27 15:31:31
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

