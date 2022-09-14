package com.meta.web.coins.system.entity;

import com.meta.web.coins.common.BaseEntity;
import lombok.*;

import javax.persistence.*;

/**
 * 实体明细（公司，组织，商店，超市，个人，投资公司）
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
public class BusinessCategory extends BaseEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="category_id")
	private Long categoryId;           // 实体ID
	
	@Column(name="category_name")
	private String  categoryName;       // 实体名称,公司，组织，商店，超市，个人
	
	@Column(name="category_desc")
	private String  businessDesc;        // 实体描述
	

	
	
	

}
