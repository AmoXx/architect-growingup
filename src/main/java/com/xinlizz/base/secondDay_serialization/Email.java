package com.xinlizz.base.secondDay_serialization;

import java.io.Serializable;

/**
 * Email
 *
 * @Author xinlizz
 * @Date 2018/7/1
 */
public class Email implements Serializable {
    private static final long serialVersionUID = -6209802933433281723L;

    private String content;

    public Email(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
