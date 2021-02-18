package com.honyelchak.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.honyelchak.gulimall.product.entity.BrandEntity;
import com.honyelchak.gulimall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    public void contextLoads() {

        BrandEntity brandEntity = new BrandEntity();
// 1.Test 保存
//        brandEntity.setDescript("xxxxxxxxxxxxxx");
//        brandEntity.setName("hua wei");
//        brandService.save(brandEntity);
//        brandEntity.setBrandId(1L);
//        brandEntity.setName("gucci");
//        brandService.updateById(brandEntity);

        BrandEntity brand = brandService.getOne(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));

        System.out.println(brand);


    }

}
