package com.andyadc.mybatis;

import java.io.Serializable;
import java.util.Date;

public class Demo implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;
    private String name;
    private int status;
    private Integer version;
    private Date createdTime;
    private Date updatedTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "id=" + id +
                ", name=" + name +
                ", status=" + status +
                ", version=" + version +
                ", createdTime=" + createdTime +
                ", updatedTime=" + updatedTime +
                "}";
    }
}