package com.honyelchak.gulimall.product.dao;

import com.honyelchak.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author honyelchak
 * @email 554417388@qq.com
 * @date 2021-01-26 22:47:15
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
