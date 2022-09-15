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
 * 支出方式
 * @author shengdaolin_sh
 * @date 2019年8月18日
 */
@Table(name="pfp_money_pay")
@Entity
@Data
@EqualsAndHashCode(callSuper=false)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MoneyPay extends BaseEntity {

	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="money_pay_id")
	private Integer moneyPayId;    // 支出方式ID
	
	@Column(name="money_pay_cname")
	private String moneyPayCname;  // 中文名
	
	@Column(name="money_pay_ename")
	private String moneyPayEname;  // 英文名
	
	@Column(name="money_pay_icon")
	private String moneyPayIcon;   // 支出方式Icon
	
	@Column(name="money_pay_desc")
	private String moneyPayDesc;   // 支出方式描述
	
	
	
	

}
