package com.honyelchak.gulimall.product.dao;

import com.honyelchak.gulimall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author honyelchak
 * @email 554417388@qq.com
 * @date 2021-01-26 22:47:15
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
