package com.meta.web.coins.bill.entity;

import com.meta.web.coins.common.BaseEntity;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 资金(账单)流水（收入，支出，借贷，转账，余额，投资等）
 *
 */
@Table(name="bill_flow")
@Entity
@Data
@EqualsAndHashCode(callSuper=false)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FlowBill extends BaseEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="flow_id")
    private Long   flowId;				// 流水ID

	@Column(name="flow_name")
	private String flowName;			 // 流水名称

	@Column(name="flow_type")
    private String flowType;             // 合并多种：收入+ 贷款+ 借款+ 收债+ 退款+  消费- 还款- 还贷- 借出-  转账，余额 =

    @Column(name="flow_sign")
    private String flowSign;             // + - =

    @Column(name="flow_datetime")
	private Date  flowDateTime;          // 时间 2019-10-01 12:00:00

	@Column(name="flow_amount", precision = 11, scale = 2)
	private Double flowAmount;      	 // 金额 200.00  <20 20-50-100-200-500-1000-2000-5000-10000-20000-50000

	@Column(name="flow_imgs")
	private String flowImgs;             // 图片凭证

	@Column(name="flow_desc")
	private String flowDesc;             // 描述

	@Column(name="flow_parent_id")
	private Long  flowParentId;			// 流水父ID

	@Column(name="flow_parent_name")
	private String  flowParentName;	    // 流水父名称

	/**	 子分类 */
	@Transient
    private List<FlowBill> children = new ArrayList<FlowBill>();

	// ----------多出字段---------------//
    @Column(name="flow_source")
    private String flowSource;           // 资金源头：账户，公司，主体，他人等

    @Column(name="flow_target")
    private String flowTarget;           // 资金去向  账户，公司，主体，他人等

	@Column(name="flow_bill_id")
	private Long  flowBillId;			// 流水账单ID 关联其他账单ID

    @Column(name="flow_remark")
    private String flowRemark;           // 银行账户 2019-10-10 12:00:00 + 工资流水 -10000 元。


	// ------ 关联输入信息 ------ //
	@Column(name="flow_user_id")
	private Long  flowUserId;    	  		// 流水用户ID

	@Column(name="flow_user_name")
	private String flowUserName;      		// 流水用户名称

	// ---------------------------
	@Column(name="flow_book_id")
	private Long flowBookId;         		// 流水账本Id

	@Column(name="flow_book_name")
	private String flowBookName;     		// 流水账本名称

	// ---------------------------
	@Column(name="flow_account_id")
	private Long flowAccountId;           // 流水账户 ID

	@Column(name="flow_account_name")
	private String flowAccountName;       // 流水账户 银行账户>招商银行

	// ---------------------------
	@Column(name="flow_category_id")
	private Long flowCategoryId;          // 流水分类 ID

	@Column(name="flow_category_name")
	private String flowCategoryName;     // 流水分类 职业流水>工资流水

	// ---------------------------
	@Column(name="flow_city_id")
	private Long flowCityId;      	    // 流水城市ID

	@Column(name="flow_city_name")
	private String flowCityName;   	    // 流水城市中文名

	// ---------------------------
	@Column(name="flow_emotion_id")
	private Long flowEmotionId;   		// 流水心情ID

	@Column(name="flow_emotion_name")
	private String flowEmotionName; 	// 流水心情中文名

	// ---------------------------
	@Column(name="flow_enterprise_id")
	private Long flowEnterpriseId;      // 流水公司 full family

	@Column(name="flow_enterprise_name")
	private String flowEnterpriseName;    // 流水公司 full family

	@Column(name="flow_address")
	private String flowAddress;           // 流水地址 country>city>area>street

	// ---------------------------
	@Column(name="flow_label_id")
	private Long flowLabelId;       	    // 流水标签Id

	@Column(name="flow_label_name")
	private String flowLabelName;         // 流水标签 工资流水

	// ---------------------------
	@Column(name="flow_project_id")
	private Long flowProjectId;       	// 流水项目ID

	@Column(name="flow_project_name")
	private String flowProjectName;   	// 流水项目名称

	// ---------------------------
	@Column(name="flow_member_id")
	private Long flowMemberId;           // 流水人员ID 本人

	@Column(name="flow_member_name")
	private String flowMemberName;      // 流水人员 本人

	// ---------------------------
	@Column(name="flow_money_id")
	private Long flowMoneyId;            // 流水币种ID

	@Column(name="flow_money_name")
	private String flowMoneyName;        // 流水币种 RMB

	// ---------------------------
	@Column(name="flow_weather_id")
	private Long flowWeatherId;      		// 流水天气ID

	@Column(name="flow_weather_name")
	private String flowWeatherName;     	// 流水天气中文名


	// ------ 附加生成信息 ------ //
	@Column(name="flow_country")
	private String flowCountry;          // 流水国家

	@Column(name="flow_province")
	private String flowProvince;         // 流水省州

	@Column(name="flow_city")
	private String flowCity;             // 流水城市

	@Column(name="flow_county")
	private String flowCounty;          // 流水市县区

	@Column(name="flow_street")
	private String flowStreet;           // 流水街道

	@Column(name="flow_date")
	private String flowDate;             // 流水日期

	@Column(name="flow_year")
	private String flowYear;             // 流水年份

	@Column(name="flow_quarter")
	private String flowQuarter;          // 流水季度

	@Column(name="flow_month")
	private String flowMonth;            // 流水月份

    @Column(name="flow_year_week")
	private String flowYearWeek;         // 流水周数

	@Column(name="flow_week")
	private String flowWeek;             // 流水星期（星期一，二...）

	@Column(name="flow_day")
	private String flowDay;              // 流水日子

	@Column(name="flow_period")
	private String flowPeriod;           // 流水区间（早晨，上午，中午，下午，傍晚，晚上）

}
