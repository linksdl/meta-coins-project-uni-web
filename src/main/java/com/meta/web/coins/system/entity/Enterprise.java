package com.meta.web.coins.system.entity;

import com.meta.web.coins.common.BaseEntity;
import lombok.*;

import javax.persistence.*;

/**
 * 实体明细（公司，组织，商店，超市，个人，投资公司）
 * @author shengdaolin_sh
 * @date 2019年8月18日
 */
@Table(name="config_enterprise")
@Entity
@Data
@EqualsAndHashCode(callSuper=false)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Enterprise extends BaseEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="enterprise_id")
	private Long enterpriseId;            // 实体ID
	
	@Column(name="enterprise_name")
	private String  enterpriseName;       // 实体名称

	@Column(name="enterprise_type_id")    // 实体类型：公司ID，组织，商店，超市，个人
	private Long enterpriseTypeId;

	@Column(name="enterprise_type_name")       // 实体类型：公司，组织，商店，超市，个人
	private String  enterpriseTypeName;
	
	@Column(name="enterprise_address")
	private String  enterpriseAddress;     // 实体所在地址，国家，省市区，街道
	
	@Column(name="enterprise_map_location")
	private String  enterpriseMapLocation; // 实体地图所在点，经纬度
	
	@Column(name="enterprise_imgs")
	private String  enterpriseImgs;        // 实体照片
	
	@Column(name="enterprise_desc")
	private String  enterpriseDesc;        // 实体描述
	
	@Column(name="enterprise_scope")
    private String enterpriseScope;   	// 作用范围：全部，支出，收入，借入，借出，转账等

	// 关联不同用户和用户不同账本
	@Column(name="user_id")
	private Long  userId;    	  // 用户ID

	@Column(name="user_name")
	private String userName;      // 用户名称

	@Column(name="book_id")
	private Long bookId;         // 账本Id

	@Column(name="book_name")
	private String bookName;       // 账本名称
	

}
