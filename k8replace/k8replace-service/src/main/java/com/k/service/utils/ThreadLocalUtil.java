package com.k.service.utils;

import com.alibaba.ttl.TransmittableThreadLocal;
import com.k.service.api.dto.DemoDTO;

/**
 * @author: xujiacong@ejiayou.com
 * @time: 2022-08-03  16:43
 * @description:
 */
public class ThreadLocalUtil {

    private static final TransmittableThreadLocal<DemoDTO> DEMO = new TransmittableThreadLocal<>();

    public static DemoDTO getCurrentUser() {
        if (DEMO.get() != null) {
            return DEMO.get();
        } else {
            throw new RuntimeException();
        }
    }

    public static void setCurrentUser(DemoDTO member) {
        DEMO.set(member);
    }

    public static DemoDTO getCurrentUser(Boolean checkLogin) {
        if (DEMO.get() != null) {
            return DEMO.get();
        }
        if (checkLogin) {

        }
        return null;
    }

    public static void remove() {
        DEMO.remove();
    }
}
