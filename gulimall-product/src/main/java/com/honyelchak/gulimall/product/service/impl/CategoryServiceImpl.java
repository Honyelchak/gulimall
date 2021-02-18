package com.honyelchak.gulimall.product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.honyelchak.common.utils.PageUtils;
import com.honyelchak.common.utils.Query;

import com.honyelchak.gulimall.product.dao.CategoryDao;
import com.honyelchak.gulimall.product.entity.CategoryEntity;
import com.honyelchak.gulimall.product.service.CategoryService;

import javax.annotation.Resource;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {



    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        //1.查出所有分类
        List<CategoryEntity> categoryEntities = baseMapper.selectList(null);


        //2.组装成父子结构
        List<CategoryEntity> level1List = categoryEntities.stream().filter((e) ->
                e.getCatLevel() == 1
        ).map((e) ->{
            e.setChildrens(getChildrens(e, categoryEntities));
            return e;
        }).sorted(Comparator.comparingInt(CategoryEntity::getSort)).collect(Collectors.toList());



        return level1List;
    }

    @Override
    public void removeMenuByIds(List<Long> asList) {
        //TODO 1.检查当前删除的菜单，是否被其他地方引用


        baseMapper.deleteBatchIds(asList);
    }

    private List<CategoryEntity> getChildrens(CategoryEntity root, List<CategoryEntity> all){

        List<CategoryEntity> rootList = all.stream().filter((e) ->
                e.getParentCid().equals(root.getCatId())
        ).map((e) ->{
            e.setChildrens(getChildrens(e, all));
            return e;
        }).sorted(Comparator.comparingInt(CategoryEntity::getSort)).collect(Collectors.toList());

        return rootList;
    }

}