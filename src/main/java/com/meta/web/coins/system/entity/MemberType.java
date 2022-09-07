package com.meta.web.coins.system.entity;


import com.meta.web.coins.common.BaseEntity;
import lombok.*;

import javax.persistence.*;

@Table(name="system_member_type")
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
