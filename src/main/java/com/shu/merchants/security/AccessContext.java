package com.shu.merchants.security;

/**
 * <h1>用ThreadLocal去单独储存Token</h1>
 *
 * @author yang
 * @date 2019/6/10 13:53
 */
public class AccessContext {
    private static final ThreadLocal<String> token = new ThreadLocal<>();

    public static String getToken() {
        return token.get();
    }

    public static void setToken(String tokenString) {
        token.set(tokenString);
    }

    public static void clearAccessKey() {
        token.remove();
    }
}
