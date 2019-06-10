package com.shu.merchants.dao;

import com.shu.merchants.entity.Merchants;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * <h1>Merchants Dao 接口</h1>
 *
 * @author yang
 * @date 2019/6/10 14:17
 */
public interface MerchantsDao extends JpaRepository<Merchants, Integer> {
    /**
     * <h2>根据商户id获取商户</h2>
     *
     * @param id 商户id
     * @return {@link Merchants}
     */

    Merchants findByid(Integer id);

    /**
     * <h2>根据商户名称获取商户对象</h2>
     *
     * @param name 商户名称
     * @return {@link Merchants}
     */
    Merchants findByName(String name);
}
