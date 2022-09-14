package com.meta.web.coins.system.entity;


import com.meta.web.coins.common.BaseEntity;
import lombok.*;

import javax.persistence.*;

// 成员身份类型：本人，家人，同学，朋友，亲戚，老师，校友，房东等
@Table(name="pfp_config_member_type")
@Entity
@Data
@EqualsAndHashCode(callSuper=false)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberType extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="type_id")
	private Long typeId;       // 身份类型ID

	@Column(name="type_name")
	private String typeName;   // 身份类型名称

	@Column(name="type_desc")
	private String typeDesc;   // 描述

}
