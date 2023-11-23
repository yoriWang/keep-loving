package com.learning.OOP._exception.exper2;

/**
 * ClassName: NoLifeValueException
 * Description:
 *
 * @author: yurenwang
 * @create: 2023/11/10 11:23
 * @version: 1.0
 */
public class NoLifeValueException extends RuntimeException {
    static final long serialVersionUID = -70342222366939L;

    public NoLifeValueException() {
    }

    public NoLifeValueException(String message) {
        super(message);
    }
}
