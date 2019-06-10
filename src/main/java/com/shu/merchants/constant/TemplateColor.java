package com.shu.merchants.constant;

/**
 * @author yang
 * @date 2019/6/10 13:12
 */
public enum TemplateColor {
    /**
     * 红色
     */
    RED(1, "红色"),
    /**
     * 绿色
     */
    GREEN(2,"绿色"),
    /**
     * 蓝色
     */
    BLUE(3,"蓝色");

    /**
     * 颜色代码
     */
    private Integer code;
    /**
     * 颜色描述
     */
    private String color;

    TemplateColor(Integer code, String color) {
        this.code = code;
        this.color = color;
    }

    public Integer getCode() {
        return code;
    }

    public String getColor() {
        return color;
    }
}
