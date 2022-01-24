package com.project.manager.exception;

/**
 * 鳄鱼
 *
 * @author ZHAOHUI
 */
public class BusinessExceptionChecker{

    private void check(boolean condition, int code, String msg) {
        if (!condition) {
            throw new BusinessException(code, msg);
        }
    }


}
