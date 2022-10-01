package com.meta.web.coins.bill.entity;

import com.meta.web.coins.common.BaseEntity;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 支出支出明细表
 * @author shengdaolin_sh
 * @date 2019年8月18日
 */
@Table(name="bill_consume")
@Entity
@Data
@EqualsAndHashCode(callSuper=false)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ConsumeBill extends BaseEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="consume_id")
    private Long consumeId;					// 支出ID

	@Column(name="consume_name")
	private String consumeName;				// 支出名称
	
	@Column(name="consume_type")
	private String consumeType;             // 支出类别 loan-out 还贷 return-out还款 lend借出 consume 消费

	@Column(name="consume_datetime")
	private Date consumeDateTime;          	// 支出时间 2019-10-01 12:00:00

	@Column(name="consume_amount", precision = 11, scale = 2)
	private Double consumeAmount;      		// 支出金额 200.00  <20 20-50-100-200-500-1000-2000-5000-10000-20000-50000

	@Column(name="consume_imgs")
	private String consumeImgs;             // 支出图片凭证

	@Column(name="consume_desc")
	private String consumeDesc;             // 支出描述

	@Column(name="consume_parent_id")       // 支出父ID
	private Long  consumeParentId;

	@Column(name="consume_parent_name")    	// 支出父名称
	private String  consumeParentName;

		/** 子分类 */
	@Transient
    private List<ConsumeBill> children = new ArrayList<ConsumeBill>();

	// ------ 关联输入信息 ------ //
	@Column(name="consume_user_id")
	private Long  consumeUserId;    	  	// 支出用户ID

	@Column(name="consume_user_name")
	private String consumeUserName;      	// 支出用户名称

	// ---------------------------
	@Column(name="consume_book_id")
	private Long consumeBookId;         	// 支出账本Id

	@Column(name="consume_book_name")
	private String consumeBookName;     	// 支出账本名称

	// ---------------------------
	@Column(name="consume_account_id")
	private Long consumeAccountId;          // 支出账户 ID

	@Column(name="consume_account_name")
	private String consumeAccountName;      // 支出账户 现金账户>支付宝

	// ---------------------------
	@Column(name="consume_category_id")
	private Long consumeCategoryId;         // 支出分类 ID

	@Column(name="consume_category_name")
	private String consumeCategoryName;     // 支出分类 日常支出>午餐

	// ---------------------------
	@Column(name="consume_entity_id")
	private Long consumeEntityId;      		// 支出实体

	@Column(name="consume_entity_name")
	private String consumeEntityName;   	// 支出实体（公司，个人，主体，账户，第三方等）

	@Column(name="consume_address")
	private String consumeAddress;          // 支出地址 country>city>area>street

	// ---------------------------
	@Column(name="consume_label_id")
	private Long consumeLabelId;       	    // 支出标签Id

	@Column(name="consume_label_name")
	private String consumeLabelName;       	// 支出标签 日常支出,午餐

	// ---------------------------
	@Column(name="consume_project_id")
	private Long consumeProjectId;       	// 支出项目ID

	@Column(name="consume_project_name")
	private String consumeProjectName;   	// 支出项目名称

	// ---------------------------
	@Column(name="consume_member_id")
	private Long consumeMemberId;          	// 支出人员ID 本人

	@Column(name="consume_member_name")
	private String consumeMemberName;       // 支出人员 本人,耗子

	// ---------------------------
	@Column(name="consume_money_id")
	private Long   consumeMoneyId;          // 支出币种ID

	@Column(name="consume_money_name")
	private String consumeMoneyName;        // 支出币种 RMB

	// ---------------------------
	@Column(name="consume_weather_id")
	private Long consumeWeatherId;      	// 支出天气ID

	@Column(name="consume_weather_name")
	private String consumeWeatherName;     	// 支出天气中文名

	// ------ 附加生成信息 ------ //
	@Column(name="consume_country")
	private String consumeCountry;          // 支出国家

	@Column(name="consume_province")
	private String consumeProvince;         // 支出省州
	
	@Column(name="consume_city")
	private String consumeCity;             // 支出城市

	@Column(name="consume_county")
	private String consumeCounty;          	// 支出市县区

	@Column(name="consume_street")
	private String consumeStreet;           // 支出街道

	@Column(name="consume_date")
	private String consumeDate;             // 支出日期

	@Column(name="consume_year")
	private String consumeYear;             // 支出年份

	@Column(name="consume_quarter")
	private String consumeQuarter;          // 支出季度
	
	@Column(name="consume_month")
	private String consumeMonth;            // 支出月份

	@Column(name="consume_year_week")
	private String consumeYearWeek;         // 支出周数

	@Column(name="consume_week")
	private String consumeWeek;             // 支出星期（星期一，二...）

	@Column(name="consume_day")
	private String consumeDay;              // 支出日子

	@Column(name="consume_period")
	private String consumePeriod;           // 支出区间（早晨，上午，中午，下午，傍晚，晚上）
	
}
