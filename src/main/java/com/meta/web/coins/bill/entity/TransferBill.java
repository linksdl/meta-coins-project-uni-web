package com.meta.web.coins.bill.entity;

import com.meta.web.coins.common.BaseEntity;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Table(name="bill_transfer")
@Entity
@Data
@EqualsAndHashCode(callSuper=false)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TransferBill extends BaseEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="transfer_id")
    private Long transferId;			  	 // 转账ID

	@Column(name="transfer_name")
    private String  transferName;			 // 转账名称

	@Column(name="transfer_type")
	private String transferType;			 // 转入，转出，提现，充值

	@Column(name="transfer_datetime")
	private Date transferDateTime;           // 转账时间 2019-10-01 12:00:00

	@Column(name="transfer_amount", precision = 11, scale = 2)
	private Double transferAmount;      	 // 转账金额 200.00  <20 20-50-100-200-500-1000-2000-5000-10000-20000-50000

	@Column(name="transfer_imgs")
	private String transferImgs;             // 转账图片凭证

	@Column(name="transfer_desc")
	private String transferDesc;             // 转账描述

	@Column(name="transfer_parent_id")
	private Long  transferParentId;			  // 转账父ID

	@Column(name="transfer_parent_name")
	private String  transferParentName;		  // 转账父名

	/** 子分类 */
	@Transient
    private List<TransferBill> children = new ArrayList<TransferBill>();

	// ------ 关联输入信息 ------ //
	@Column(name="transfer_user_id")
	private Long  transferUserId;    	  		// 转账用户ID

	@Column(name="transfer_user_name")
	private String transferUserName;      		// 转账用户名称

	// ---------------------------
	@Column(name="transfer_book_id")
	private Long transferBookId;         	  // 转账账本Id

	@Column(name="transfer_book_name")
	private String transferBookName;     	 // 转账账本名称

	// ---------------------------
	@Column(name="transfer_account_id")
	private Long transferAccountId;           // （出账户）转账账户 ID

	@Column(name="transfer_account_name")
	private String transferAccountName;       // （出账户）转账账户 银行账户>招商银行

	// ---------------------------
	@Column(name="transfer_category_id")
	private Long transferCategoryId;          // 转账分类 ID

	@Column(name="transfer_category_name")
	private String transferCategoryName;      // 转账分类 职业转账>工资转账

	// ---------------------------
	@Column(name="transfer_city_id")
	private Long transferCityId;      	    // 转账城市ID

	@Column(name="transfer_city_name")
	private String transferCityName;   	    // 转账城市中文名

	// ---------------------------
	@Column(name="transfer_emotion_id")
	private Long transferEmotionId;   		// 转账心情ID

	@Column(name="transfer_emotion_name")
	private String transferEmotionName; 	// 转账心情中文名

	// ---------------------------
	@Column(name="transfer_entity_id")
	private Long transferEntityId;      	 // （入账户）转账实体ID

	@Column(name="transfer_entity_name")
	private String transferEntityName;       // （入账户）转账实体（公司，个人，主体，账户，第三方等）

	@Column(name="transfer_address")
	private String transferAddress;           // 转账地址 country>city>area>street

	// ---------------------------
	@Column(name="transfer_label_id")
	private Long transferLabelId;       	  // 转账标签Id

	@Column(name="transfer_label_name")
	private String transferLabelName;         // 转账标签 工资转账

	// ---------------------------
	@Column(name="transfer_project_id")
	private Long transferProjectId;       	// 转账项目ID

	@Column(name="transfer_project_name")
	private String transferProjectName;   	// 转账项目名称

	// ---------------------------
	@Column(name="transfer_member_id")
	private Long transferMemberId;           // 转账人员ID 本人

	@Column(name="transfer_member_name")
	private String transferMemberName;      // 转账人员 本人

	// ---------------------------
	@Column(name="transfer_money_id")
	private Long transferMoneyId;            // 转账币种ID

	@Column(name="transfer_money_name")
	private String transferMoneyName;        // 转账币种 RMB

	// ---------------------------
	@Column(name="transfer_weather_id")
	private Long transferWeatherId;      		// 转账天气ID

	@Column(name="transfer_weather_name")
	private String transferWeatherName;     	// 转账天气中文名


	// ------ 附加生成信息 ------ //
	@Column(name="transfer_country")
	private String transferCountry;          // 转账国家

	@Column(name="transfer_province")
	private String transferProvince;         // 转账省州

	@Column(name="transfer_city")
	private String transferCity;             // 转账城市

	@Column(name="transfer_county")
	private String transferCounty;          // 转账市县区

	@Column(name="transfer_street")
	private String transferStreet;           // 转账街道

	@Column(name="transfer_date")
	private String transferDate;             // 转账日期

	@Column(name="transfer_year")
	private String transferYear;             // 转账年份

	@Column(name="transfer_quarter")
	private String transferQuarter;          // 转账季度

	@Column(name="transfer_month")
	private String transferMonth;            // 转账月份

    @Column(name="transfer_year_week")
	private String transferYearWeek;         // 转账周数

	@Column(name="transfer_week")
	private String transferWeek;             // 转账星期（星期一，二...）

	@Column(name="transfer_day")
	private String transferDay;              // 转账日子

	@Column(name="transfer_period")
	private String transferPeriod;           // 转账区间（早晨，上午，中午，下午，傍晚，晚上）

}
