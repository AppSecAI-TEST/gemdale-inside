package com.inside.common.model;

import java.util.Date;

/**
 * Created by Ethan on 2017/8/9.
 */
public class BasePojo {
    private Date created;
    private Date updated;
    public Date getCreated() {
        return created;
    }
    public void setCreated(Date created) {
        this.created = created;
    }
    public Date getUpdated() {
        return updated;
    }
    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}
