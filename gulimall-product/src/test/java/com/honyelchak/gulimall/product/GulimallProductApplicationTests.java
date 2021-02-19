package com.honyelchak.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.honyelchak.gulimall.product.entity.BrandEntity;
import com.honyelchak.gulimall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    public void uploadOss() throws FileNotFoundException {
//        // Endpoint以杭州为例，其它Region请按实际情况填写。
//        String endpoint = "oss-cn-shanghai.aliyuncs.com";
//// 阿里云主账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM账号进行API访问或日常运维，请登录RAM控制台创建RAM账号。
//        String accessKeyId = "LTAI4GHW4yaAHykhtMDemsrS";
//        String accessKeySecret = "wU2U5X2Flm11DMA5hjojdKRN0Zzi8c";

// 创建OSSClient实例。
        //OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

//        InputStream fileInputStream = new FileInputStream("C:\\Users\\Hades\\Pictures\\Screenshots\\屏幕截图(1).png");
//
//        ossClient.putObject("gulimall-hon", "xxx.png",fileInputStream);
//
//// 关闭OSSClient。
//        ossClient.shutdown();
    }

//    @Test
//    public void contextLoads() {
//
//        BrandEntity brandEntity = new BrandEntity();
//// 1.Test 保存
////        brandEntity.setDescript("xxxxxxxxxxxxxx");
////        brandEntity.setName("hua wei");
////        brandService.save(brandEntity);
////        brandEntity.setBrandId(1L);
////        brandEntity.setName("gucci");
////        brandService.updateById(brandEntity);
//
//        BrandEntity brand = brandService.getOne(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
//
//        System.out.println(brand);
//
//    }

}
