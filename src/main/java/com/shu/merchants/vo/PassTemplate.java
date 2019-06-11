package com.shu.merchants.vo;

import com.shu.merchants.constant.ErrorCode;
import com.shu.merchants.dao.MerchantsDao;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * <h1>投放优惠券对象定义</h1>
 *
 * @author yang
 * @date 2019/6/10 14:50
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PassTemplate {
    /**
     * 所属商户id
     */
    private Integer id;
    /**
     * 优惠券标题
     */
    private String title;

    /**
     * 优惠券详细信息
     */
    private String summary;

    /**
     * 最大个数限制
     */
    private Long limit;

    /**
     * 优惠券是否有token用于商户核销
     * redis中获取
     */
    private Boolean hasToken;

    /**
     * 优惠券背景颜色
     */
    private Integer background;

    /**
     * 优惠券开始时间
     */
    private Date start;
    /**
     * 优惠券结束时间
     */
    private Date end;
    /**
     * 描述
     */
    private String Desc;

    /**
     * 校验优惠券对象有效性
     *
     * @param merchantsDao {@link MerchantsDao}
     * @return {@link ErrorCode}
     */
    public ErrorCode validate(MerchantsDao merchantsDao) {
        if (null == merchantsDao.findById(id)) {
            return ErrorCode.MERCHANTS_NOT_EXIST;
        }
        return ErrorCode.SUCCESS;
    }

}
