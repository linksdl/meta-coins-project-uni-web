package com.meta.web.coins.bill.entity;

import com.meta.web.coins.common.BaseEntity;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 收入明细表(收入账单，工资，加班，利息，红包，意外等收入账户)
 * @author shengdaolin_sh
 * @date 2019年10月28日
 */
@Table(name="bill_income")
@Entity
@Data
@EqualsAndHashCode(callSuper=false)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class IncomeBill extends BaseEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="income_id")
    private Long incomeId;				    // 收入ID

	@Column(name="income_name")
	private String incomeName;			   // 收入名称

	@Column(name="income_type")
	private String incomeType;             // 收入类别：退款，收入，贷款，借款 return income loan-in borrow

	@Column(name="income_datetime")
	private Date incomeDateTime;           // 收入日期时间 2019-10-01 12:00:00

	@Column(name="income_amount", precision = 11, scale = 2)
	private Double incomeAmount;      	   // 收入金额 200.00  <20 20-50-100-200-500-1000-2000-5000-10000-20000-50000

	@Column(name="income_imgs")
	private String incomeImgs;            // 收入图片凭证

	@Column(name="income_desc")
	private String incomeDesc;            // 收入描述

	@Column(name="income_parent_id")      // 收入父ID
	private Long  incomeParentId;

	@Column(name="income_parent_name")    // 收入父名称
	private String  incomeParentName;

	/** 子分类 */
	@Transient
    private List<IncomeBill> children = new ArrayList<IncomeBill>();

	// ------ 关联输入信息 ------ //
	@Column(name="income_user_id")
	private Long  incomeUserId;    	  		// 收入用户ID

	@Column(name="income_user_name")
	private String incomeUserName;      	// 收入用户名称

	// ---------------------------
	@Column(name="income_book_id")
	private Long incomeBookId;         		// 收入账本Id

	@Column(name="income_book_name")
	private String incomeBookName;     		// 收入账本名称

	// ---------------------------
	@Column(name="income_account_id")
	private Long incomeAccountId;           // 收入账户 ID

	@Column(name="income_account_name")
	private String incomeAccountName;       // 收入账户 银行账户>招商银行

	// ---------------------------
	@Column(name="income_category_id")
	private Long incomeCategoryId;          // 收入分类 ID

	@Column(name="income_category_name")
	private String incomeCategoryName;     // 收入分类 职业收入>工资收入

	// ---------------------------
	@Column(name="income_city_id")
	private Long incomeCityId;      	    // 收入城市ID

	@Column(name="income_city_name")
	private String incomeCityName;   	    // 收入城市中文名

	// ---------------------------
	@Column(name="income_emotion_id")
	private Long incomeEmotionId;   		// 收入心情ID

	@Column(name="income_emotion_name")
	private String incomeEmotionName; 		// 收入心情中文名

	// ---------------------------
	@Column(name="income_entity_id")
	private Long incomeEntityId;      	// 收入实体ID

	@Column(name="income_entity_name")
	private String incomeEntityName;    // 收入实体（公司，个人，主体，账户，第三方等）

	@Column(name="income_address")
	private String incomeAddress;           // 收入地址 country>city>area>street

	// ---------------------------
	@Column(name="income_label_id")
	private Long incomeLabelId;       	    // 收入标签Id

	@Column(name="income_label_name")
	private String incomeLabelName;         // 收入标签 工资收入

	// ---------------------------
	@Column(name="income_project_id")
	private Long incomeProjectId;       	// 收入项目ID

	@Column(name="income_project_name")
	private String incomeProjectName;   	// 收入项目名称

	// ---------------------------
	@Column(name="income_member_id")
	private Long incomeMemberId;           // 收入人员ID 本人

	@Column(name="income_member_name")
	private String incomeMemberName;      // 收入人员 本人

	// ---------------------------
	@Column(name="income_money_id")
	private Long incomeMoneyId;            // 收入币种ID

	@Column(name="income_money_name")
	private String incomeMoneyName;        // 收入币种 RMB

	// ---------------------------
	@Column(name="income_weather_id")
	private Long incomeWeatherId;      		// 收入天气ID

	@Column(name="income_weather_name")
	private String incomeWeatherName;     	// 收入天气中文名

	// ------ 附加生成信息 ------ //
	@Column(name="income_country")
	private String incomeCountry;          // 收入国家

	@Column(name="income_province")
	private String incomeProvince;         // 收入省州

	@Column(name="income_city")
	private String incomeCity;             // 收入城市

	@Column(name="income_county")
	private String incomeCounty;          // 收入市县区

	@Column(name="income_street")
	private String incomeStreet;           // 收入街道

	@Column(name="income_date")
	private String incomeDate;             // 收入日期

	@Column(name="income_year")
	private String incomeYear;             // 收入年份

	@Column(name="income_quarter")
	private String incomeQuarter;          // 收入季度

	@Column(name="income_month")
	private String incomeMonth;            // 收入月份

    @Column(name="income_year_week")
	private String incomeYearWeek;         // 收入周数

	@Column(name="income_week")
	private String incomeWeek;             // 收入星期（星期一，二...）

	@Column(name="income_day")
	private String incomeDay;              // 收入日子

	@Column(name="income_period")
	private String incomePeriod;           // 收入区间（早晨，上午，中午，下午，傍晚，晚上）

}
