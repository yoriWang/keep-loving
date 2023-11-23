package com.learning.OOP.project.service;

/**
 * ClassName: TeamException
 * Description:
 *
 * @author: yurenwang
 * @create: 2023/11/10 14:16
 * @version: 1.0
 */
public class TeamException extends Exception {
    static final long serialVersionUID = -33875169123229948L;

    public TeamException() {
    }

    public TeamException(String message) {
        super(message);
    }
}
