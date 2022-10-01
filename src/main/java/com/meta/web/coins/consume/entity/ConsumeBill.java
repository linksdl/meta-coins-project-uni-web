package com.meta.web.coins.consume.entity;

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
//@Table(name="pfp_capital_consume")
//@Entity
//@Data
//@EqualsAndHashCode(callSuper=false)
//@Builder
//@NoArgsConstructor
//@AllArgsConstructor
public class ConsumeBill extends BaseEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="consume_id")
    private Long consumeId;

	@Column(name="consume_name")
	private String consumeName;
	
	@Column(name="consume_type")
	private String consumeType;             // 支出类别 repay还贷 payback还款 lend借出 consume 消费

	@Column(name="consume_time")
	private Date consumeTime;               // 支出时间 2019-10-01 12:00:00

	@Column(name="consume_amount", precision = 11, scale = 2)
	private Double consumeAmount;      		// 支出金额 200.00  <20 20-50-100-200-500-1000-2000-5000-10000-20000-50000

	@Column(name="consume_business")
	private String consumeBusiness;         // 支出店家 full family

	@Column(name="consume_address")
	private String consumeAddress;          // 支出地址 country>city>area>street

	@Column(name="consume_money_type")
	private String consumeMoneyType;        // 支出币种 RMB

	@Column(name="consume_category")
	private String consumeCategory;         // 支出分类 日常支出>午餐

	@Column(name="consume_member")
	private String consumeMember;           // 支出人员 本人,耗子

	@Column(name="consume_account")
	private String consumeAccount;          // 支出账户 现金账户>支付宝

	@Column(name="consume_label")
	private String consumeLabel;            // 支出标签 日常支出,午餐


	// -------------------------------

	@Column(name="consume_imgs")
	private String consumeImgs;             // 支出图片凭证

	@Column(name="consume_desc")
	private String consumeDesc;             // 支出描述

	@Column(name="parent_id")               // 父ID
	private Long  parentId;

	/** 子分类 */
	@Transient
    private List<ConsumeBill> children = new ArrayList<ConsumeBill>();

	// -------------------------------
	
	@Column(name="consume_country")
	private String consumeCountry;          // 支出国家
	
	@Column(name="consume_city")
	private String consumeCity;             // 支出城市

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
