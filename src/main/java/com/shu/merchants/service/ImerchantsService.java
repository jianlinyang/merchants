package com.shu.merchants.service;

import com.shu.merchants.vo.CreateMerchantsRequest;
import com.shu.merchants.vo.PassTemplate;
import com.shu.merchants.vo.Response;

/**
 * <h2>商户服务接口定义</h2>
 *
 * @author yang
 * @date 2019/6/10 15:21
 */
public interface ImerchantsService {
    /**
     * <h2>创建商户服务</h2>
     *
     * @param request {@link CreateMerchantsRequest}创建商户请求
     * @return {@link Response}
     */
    Response createMerchants(CreateMerchantsRequest request);

    /**
     * <h2>根据id构造商户信息</h2>
     *
     * @param id 商户id
     * @return {@link Response}
     */
    Response buildMerchantsInfoById(Integer id);

    /**
     * <h2>投放优惠券</h2>
     * @param passTemplate {@link PassTemplate} 优惠券对象
     * @return {@link Response}
     */
    Response dropPassTemplate(PassTemplate passTemplate);
}
