package com.shu.merchants.service;

import com.alibaba.fastjson.JSON;
import com.shu.merchants.vo.CreateMerchantsRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author yang
 * @date 2019/6/10 15:41
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class MerchantsServiceTest {
    @Autowired
    private ImerchantsService merchantsService;

    @Test
    public void testCreateMerchantsRequest() {
        CreateMerchantsRequest request = new CreateMerchantsRequest();
        request.setName("上海大学");
        request.setLogoUrl("www.shu.edu.cn");
        request.setBusinessLicenseUrl("www.shu.edu.cn");
        request.setPhone("1234567890");
        request.setAddress("上海市");
        System.out.println(JSON.toJSONString(merchantsService.createMerchants(request)));
    }
    @Test
    public void testBuildMerchantsInfoByid(){
        System.out.println(JSON.toJSONString(merchantsService.buildMerchantsInfoById(17)));
    }
}
