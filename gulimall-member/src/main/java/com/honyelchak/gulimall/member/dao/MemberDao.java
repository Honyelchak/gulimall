package com.honyelchak.gulimall.member.dao;

import com.honyelchak.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author honyelchak
 * @email 554417388@qq.com
 * @date 2021-01-27 15:31:31
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
