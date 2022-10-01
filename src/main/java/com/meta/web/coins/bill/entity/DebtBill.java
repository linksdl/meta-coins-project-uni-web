package com.meta.web.coins.bill.entity;

import com.meta.web.coins.common.BaseEntity;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 借贷明细表(借入，还债，借出，收债，贷款，还贷等)
 * @author shengdaolin_sh
 * @date 2019年10月28日
 */
@Table(name="bill_debt")
@Entity
@Data
@EqualsAndHashCode(callSuper=false)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DebtBill extends BaseEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="debt_id")
    private Long debtId;				// 借贷ID

	@Column(name="debt_name")
	private String debtName;			// 借贷名称

	@Column(name="debt_type")
	private String debtType;             // 借贷类别：(借入，还债，借出，收债，贷款，还贷等)

	@Column(name="debt_datetime")
	private Date debtDateTime;           // 借贷日期时间 2019-10-01 12:00:00

	@Column(name="debt_amount", precision = 11, scale = 2)
	private Double debtAmount;      	   // 借贷金额 200.00  <20 20-50-100-200-500-1000-2000-5000-10000-20000-50000

	@Column(name="debt_imgs")
	private String debtImgs;            // 借贷图片凭证

	@Column(name="debt_desc")
	private String debtDesc;            // 借贷描述

	@Column(name="debt_parent_id")      // 借贷父ID
	private Long  debtParentId;

	@Column(name="debt_parent_name")    // 借贷父名称
	private String  debtParentName;

	/** 子分类 */
	@Transient
    private List<DebtBill> children = new ArrayList<DebtBill>();

	// ------ 关联输入信息 ------ //
	@Column(name="debt_user_id")
	private Long  debtUserId;    	  		// 借贷用户ID

	@Column(name="debt_user_name")
	private String debtUserName;      		// 借贷用户名称

	// ---------------------------
	@Column(name="debt_book_id")
	private Long debtBookId;         		// 借贷账本Id

	@Column(name="debt_book_name")
	private String debtBookName;     		// 借贷账本名称

	// ---------------------------
	@Column(name="debt_account_id")
	private Long debtAccountId;           // 借贷账户 ID

	@Column(name="debt_account_name")
	private String debtAccountName;       // 借贷账户 银行账户>招商银行

	// ---------------------------
	@Column(name="debt_category_id")
	private Long debtCategoryId;          // 借贷分类 ID

	@Column(name="debt_category_name")
	private String debtCategoryName;     // 借贷分类 职业借贷>工资借贷

	// ---------------------------
	@Column(name="debt_city_id")
	private Long debtCityId;      	    // 借贷城市ID

	@Column(name="debt_city_name")
	private String debtCityName;   	    // 借贷城市中文名

	// ---------------------------
	@Column(name="debt_emotion_id")
	private Long debtEmotionId;   		// 借贷心情ID

	@Column(name="debt_emotion_name")
	private String debtEmotionName; 	 // 借贷心情中文名

	// ---------------------------
	@Column(name="debt_entity_id")
	private Long debtEntityId;      	  // 借贷实体ID

	@Column(name="debt_entity_name")
	private String debtEntityName;    	  // 借贷实体（公司，个人，主体，账户，第三方等）

	@Column(name="debt_address")
	private String debtAddress;           // 借贷地址 country>city>area>street

	// ---------------------------
	@Column(name="debt_label_id")
	private Long debtLabelId;       	    // 借贷标签Id

	@Column(name="debt_label_name")
	private String debtLabelName;         // 借贷标签 工资借贷

	// ---------------------------
	@Column(name="debt_project_id")
	private Long debtProjectId;       	// 借贷项目ID

	@Column(name="debt_project_name")
	private String debtProjectName;   	// 借贷项目名称

	// ---------------------------
	@Column(name="debt_member_id")
	private Long debtMemberId;           // 借贷人员ID 本人

	@Column(name="debt_member_name")
	private String debtMemberName;      // 借贷人员 本人

	// ---------------------------
	@Column(name="debt_money_id")
	private Long debtMoneyId;            // 借贷币种ID

	@Column(name="debt_money_name")
	private String debtMoneyName;        // 借贷币种 RMB

	// ---------------------------
	@Column(name="debt_weather_id")
	private Long debtWeatherId;      		// 借贷天气ID

	@Column(name="debt_weather_name")
	private String debtWeatherName;     	// 借贷天气中文名

	// ------ 附加生成信息 ------ //
	@Column(name="debt_country")
	private String debtCountry;          // 借贷国家

	@Column(name="debt_province")
	private String debtProvince;         // 借贷省州

	@Column(name="debt_city")
	private String debtCity;             // 借贷城市

	@Column(name="debt_county")
	private String debtCounty;          // 借贷市县区

	@Column(name="debt_street")
	private String debtStreet;           // 借贷街道

	@Column(name="debt_date")
	private String debtDate;             // 借贷日期

	@Column(name="debt_year")
	private String debtYear;             // 借贷年份

	@Column(name="debt_quarter")
	private String debtQuarter;          // 借贷季度

	@Column(name="debt_month")
	private String debtMonth;            // 借贷月份

    @Column(name="debt_year_week")
	private String debtYearWeek;         // 借贷周数

	@Column(name="debt_week")
	private String debtWeek;             // 借贷星期（星期一，二...）

	@Column(name="debt_day")
	private String debtDay;              // 借贷日子

	@Column(name="debt_period")
	private String debtPeriod;           // 借贷区间（早晨，上午，中午，下午，傍晚，晚上）

}
