/**   
 * @Title: MoneyPay.java 
 * @Package com.sdl.pfp.property.common
 * @Description: TODO 
 * @author shengdaolin_sh  
 * @date 2019年8月18日 上午9:25:18 
 * @version V1.0   
 */
package com.meta.web.coins.system.entity;

import com.meta.web.coins.common.BaseEntity;
import lombok.*;

import javax.persistence.*;

/**
 * 币种使用方式
 * @author shengdaolin_sh
 * @date 2019年8月18日 2022年9月17日
 */
@Table(name="config_money")
@Entity
@Data
@EqualsAndHashCode(callSuper=false)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Money extends BaseEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="money_id")
	private Long moneyId;        // 币种ID

	@Column(name="money_type_id")
	private Long moneyTypeId;       // 币种类型ID

	@Column(name="money_type_name")
	private String moneyTypeName;    // 币种类型名称

	@Column(name="money_cname")
	private String moneyCname;   	// 币种中文名
	
	@Column(name="money_ename")
	private String moneyEname;   	// 币种英文名
	
	@Column(name="money_icon")
	private String moneyIcon;    	// 币种Icon
	
	@Column(name="money_desc")
	private String moneyDesc;    	// 币种描述

	@Column(name="money_rate")
	private double moneyRate;    	// 币种汇率 相对人民币：1：8.89

	@Column(name="money_scope")
    private String moneyScope;   	// 作用范围：全部，支出，收入，借入，借出，转账等

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
