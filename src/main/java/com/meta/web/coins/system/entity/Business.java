package com.meta.web.coins.system.entity;

import com.meta.web.coins.common.BaseEntity;
import lombok.*;

import javax.persistence.*;

/**
 * 实体明细（公司，组织，商店，超市，个人，投资公司）
 * @author shengdaolin_sh
 * @date 2019年8月18日
 */
@Table(name="config_business")
@Entity
@Data
@EqualsAndHashCode(callSuper=false)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Business extends BaseEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="business_id")
	private Long businessId;            // 实体ID
	
	@Column(name="business_name")
	private String  businessName;       // 实体名称

	@Column(name="business_type_id")    // 实体类型：公司ID，组织，商店，超市，个人
	private String businessTypeId;

	@Column(name="business_type")       // 实体类型：公司，组织，商店，超市，个人
	private String  businessType;
	
	@Column(name="business_address")
	private String  businessAddress;     // 实体所在地址，国家，省市区，街道
	
	@Column(name="business_map_location")
	private String  businessMapLocation; // 实体地图所在点，经纬度
	
	@Column(name="business_imgs")
	private String  businessImgs;        // 实体照片
	
	@Column(name="business_desc")
	private String  businessDesc;        // 实体描述
	
	@Column(name="business_scope")
    private String businessScope;   	// 作用范围：全部，支出，收入，借入，借出，转账等

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
