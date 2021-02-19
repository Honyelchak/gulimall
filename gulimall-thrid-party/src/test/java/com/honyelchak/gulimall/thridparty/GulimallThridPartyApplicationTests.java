package com.honyelchak.gulimall.thridparty;

import com.aliyun.oss.OSS;
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
public class GulimallThridPartyApplicationTests {

    @Resource
    OSS ossClient;

    @Test
    public void contextLoads() throws FileNotFoundException {

        InputStream inputStream = new FileInputStream("C:\\Users\\Hades\\Pictures\\3455465675.png");

        ossClient.putObject("gulimall-hon", "xxxx.png", inputStream);

        ossClient.shutdown();

        System.out.println("文件上传完成！");
    }

}
