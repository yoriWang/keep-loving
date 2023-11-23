package com.learning.OOP._exception.exper3;

/**
 * ClassName: BelowZeroException
 * Description:
 *
 * @author: yurenwang
 * @create: 2023/11/10 11:48
 * @version: 1.0
 */
public class BelowZeroException extends Exception {
    static final long serialVersionUID = -338752221229948L;

    public BelowZeroException() {
    }

    public BelowZeroException(String message) {
        super(message);
    }
}
