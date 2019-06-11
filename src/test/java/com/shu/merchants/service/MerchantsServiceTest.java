package com.shu.merchants.service;

import com.alibaba.fastjson.JSON;
import com.shu.merchants.vo.CreateMerchantsRequest;
import com.shu.merchants.vo.PassTemplate;
import org.apache.commons.lang.time.DateUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * @author yang
 * @date 2019/6/10 15:41
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class MerchantsServiceTest {
    @Autowired
    private IMerchantsService merchantsService;

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
    public void testBuildMerchantsInfoByid() {
        System.out.println(JSON.toJSONString(merchantsService.buildMerchantsInfoById(17)));
    }

    @Test
    public void testDropPassTemplate() {
        PassTemplate passTemplate = new PassTemplate();
        passTemplate.setId(17);
        passTemplate.setTitle("上海大学");
        passTemplate.setSummary("上海大学简介");
        passTemplate.setDesc("上海大学描述");
        passTemplate.setLimit(1234L);
        passTemplate.setHasToken(false);
        passTemplate.setBackground(2);
        passTemplate.setStart(new Date());
        passTemplate.setEnd(DateUtils.addDays(new Date(), 10));
        System.out.println(JSON.toJSONString(merchantsService.dropPassTemplate(passTemplate)));
    }
}
