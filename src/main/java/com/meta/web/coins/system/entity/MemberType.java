package com.meta.web.coins.system.entity;


import com.meta.web.coins.common.BaseEntity;
import lombok.*;

import javax.persistence.*;

// 成员身份类型：本人，家人，同学，朋友，亲戚，老师，校友，房东等
@Table(name="config_member_type")
@Entity
@Data
@EqualsAndHashCode(callSuper=false)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberType extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="member_type_id")
	private Long memberTypeId;       // 身份类型ID

	@Column(name="member_type_name")
	private String memberTypeName;   // 身份类型名称

	@Column(name="member_type_desc")
	private String memberTypeDesc;   // 身份类型描述

}
