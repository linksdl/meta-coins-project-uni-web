package com.meta.web.coins.system.entity;

import com.meta.web.coins.common.BaseEntity;
import lombok.*;

import javax.persistence.*;

/**
 * 实体类型明细（公司，组织，商店，超市，个人，投资公司）
 * @author shengdaolin_sh
 * @date 2022年9月14日
 */
@Table(name="pfp_config_business_category")
@Entity
@Data
@EqualsAndHashCode(callSuper=false)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BusinessType extends BaseEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="business_type_id")
	private Long businessTypeId;            // 实体类型ID
	
	@Column(name="business_type_name")
	private String  businessTypeName;       // 实体类型名称,公司，组织，商店，超市，个人
	
	@Column(name="business_type_desc")
	private String  businessTypeDesc;       // 实体类型描述

}
