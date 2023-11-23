package com.learning.OOP._exception._throw;

/**
 * ClassName: BelowZeroException
 * Description:
 *      自定义异常类型
 *
 * @author: yurenwang
 * @create: 2023/11/8 11:10
 * @version: 1.0
 */
public class BelowZeroException extends Exception {
    static final long serialVersionUID = -33875169931948L;

    public BelowZeroException() {
    }

    public BelowZeroException(String message) {
        super(message);
    }
}
