package com.shu.merchants.vo;

import com.shu.merchants.constant.ErrorCode;
import com.shu.merchants.dao.MerchantsDao;
import com.shu.merchants.entity.Merchants;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang.StringUtils;

/**
 * <h2>创建商户请求对象</h2>
 *
 * @author yang
 * @date 2019/6/10 15:04
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateMerchantsRequest {
    /**
     * 商户名称
     */
    private String name;

    /**
     * 商户logo
     */
    private String logoUrl;

    /**
     * 商户营业执照
     */
    private String businessLicenseUrl;
    /**
     * 商户联系电话
     */
    private String phone;
    /**
     * 商户地址
     */
    private String address;

    /**
     * 验证请求有效性
     *
     * @param merchantsDao {@link MerchantsDao}
     * @return {@link ErrorCode}
     */
    public ErrorCode validate(MerchantsDao merchantsDao) {
        if (merchantsDao.findByName(this.name) != null) {
            return ErrorCode.DUPLICATE_NAME;
        }
        if (StringUtils.isEmpty(this.logoUrl)) {
            return ErrorCode.EMPTY_LOGO;
        }
        if (StringUtils.isEmpty(this.businessLicenseUrl)) {
            return ErrorCode.EMPTY_BUSINESS_LICENSE;
        }
        if (StringUtils.isEmpty(this.address)) {
            return ErrorCode.EMPTY_ADDRESS;
        }
        if (StringUtils.isEmpty(this.phone)) {
            return ErrorCode.ERROR_PHONE;
        }
        return ErrorCode.SUCCESS;
    }

    /**
     * <h2>将请求对象转换为商户对象</h2>
     *
     * @return {@link Merchants}
     */
    public Merchants toMerchants() {
        Merchants merchants = new Merchants();
        merchants.setName(name);
        merchants.setLogoUrl(logoUrl);
        merchants.setAddress(address);
        merchants.setBusinessLicenseUrl(businessLicenseUrl);
        merchants.setPhone(phone);
        return merchants;
    }
}
