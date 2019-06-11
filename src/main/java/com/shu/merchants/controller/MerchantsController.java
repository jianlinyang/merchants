package com.shu.merchants.controller;

import com.alibaba.fastjson.JSON;
import com.shu.merchants.service.IMerchantsService;
import com.shu.merchants.vo.CreateMerchantsRequest;
import com.shu.merchants.vo.PassTemplate;
import com.shu.merchants.vo.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <h1>商户服务Controller</h1>
 *
 * @author yang
 * @date 2019/6/11 12:11
 */
@Slf4j
@RestController
@RequestMapping("/merchants")
public class MerchantsController {
    /**
     * 商户服务接口
     */
    private IMerchantsService merchantsService;

    @Autowired
    public MerchantsController(IMerchantsService merchantsService) {
        this.merchantsService = merchantsService;
    }

    @PostMapping("/create")
    public Response creatMerchants(@RequestBody CreateMerchantsRequest request) {
        log.info("CreateMerchants:{}", JSON.toJSONString(request));
        return merchantsService.createMerchants(request);
    }

    @GetMapping("/{id}")
    public Response buildMerchantsInfo(@PathVariable Integer id) {
        log.info("BuildMerchantsInfo:{}", id);
        return merchantsService.buildMerchantsInfoById(id);
    }

    @PostMapping("/drop")
    public Response dropPassTemplate(@RequestBody PassTemplate passTemplate) {
        log.info("DropPassTemplate:{}", passTemplate);
        return merchantsService.dropPassTemplate(passTemplate);
    }
}
