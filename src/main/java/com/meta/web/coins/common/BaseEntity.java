package com.meta.web.coins.common;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@Data
@MappedSuperclass
public class BaseEntity {

    @Column(name="create_by")
    private String createBy;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @Column(name="create_time")
    @CreationTimestamp
    private Date createTime;

    @Column(name="update_by")
    private String updateBy;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8" )
    @Column(name="update_time")
    @UpdateTimestamp
    private Date updateTime;

    @Column(name="weight")
    private int weight;

    @Column(name="icon")
    private String icon;

    @Column(name="remark")
    private String remark;

    @Column(name="field_desc")
    private String fieldDesc;

    @Column(name="enable")
    private String enable;


}
