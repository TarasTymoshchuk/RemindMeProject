package com.me.remind.remindmeproject.dto;

import java.util.Date;

public class RemindDTO {
    private String id;
    private String title;
    private Date remindDate;

    public RemindDTO() {
    }

    public RemindDTO(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
