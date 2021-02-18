package com.honyelchak.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.honyelchak.common.utils.PageUtils;
import com.honyelchak.gulimall.ware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author honyelchak
 * @email 554417388@qq.com
 * @date 2021-01-27 15:39:13
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

