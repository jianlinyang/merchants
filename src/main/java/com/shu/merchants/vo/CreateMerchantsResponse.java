package com.shu.merchants.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**<h2>创建商户响应对象</h2>
 * @author yang
 * @date 2019/6/10 15:15
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateMerchantsResponse {
    /**
     * 商户id,创建失败则为-1
     */
    private Integer id;
}
