package com.shu.merchants.service.impl;

import com.shu.merchants.constant.ErrorCode;
import com.shu.merchants.dao.MerchantsDao;
import com.shu.merchants.entity.Merchants;
import com.shu.merchants.service.ImerchantsService;
import com.shu.merchants.vo.CreateMerchantsRequest;
import com.shu.merchants.vo.CreateMerchantsResponse;
import com.shu.merchants.vo.PassTemplate;
import com.shu.merchants.vo.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <h1>商户服务接口实现</h1>
 *
 * @author yang
 * @date 2019/6/10 15:29
 */
@Slf4j
@Service
public class MerchantsServiceImpl implements ImerchantsService {
    private final MerchantsDao merchantsDao;

    @Autowired
    public MerchantsServiceImpl(MerchantsDao merchantsDao) {
        this.merchantsDao = merchantsDao;
    }

    @Override
    @Transactional
    public Response createMerchants(CreateMerchantsRequest request) {
        Response response = new Response();
        CreateMerchantsResponse createMerchantsResponse = new CreateMerchantsResponse();
        ErrorCode errorCode = request.validate(merchantsDao);
        if (errorCode != ErrorCode.SUCCESS) {
            createMerchantsResponse.setId(-1);
            response.setErrorCode(errorCode.getCode());
            response.setErrorMsg(errorCode.getDesc());
        } else {
            createMerchantsResponse.setId(merchantsDao.save(request.toMerchants()).getId());
        }
        response.setData(createMerchantsResponse);
        return response;
    }

    @Override
    public Response buildMerchantsInfoById(Integer id) {
        Response response = new Response();
        Merchants merchants = merchantsDao.findById(id);
        if (null == merchants) {
            response.setErrorCode(ErrorCode.MERCHANTS_NOT_EXIST.getCode());
            response.setErrorMsg(ErrorCode.MERCHANTS_NOT_EXIST.getDesc());
        }
        response.setData(merchants);
        return response;
    }

    @Override
    public Response dropPassTemplate(PassTemplate passTemplate) {
        return null;
    }
}
