/**   
 * @Title: MoneyGain.java 
 * @Package com.sdl.pfp.property.common
 * @Description: TODO 
 * @author shengdaolin_sh  
 * @date 2019年8月18日 上午9:25:18 
 * @version V1.0   
 */
package com.meta.web.coins.system.entity;

import com.meta.web.coins.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 收入方式
 * @author shengdaolin_sh
 * @date 2019年8月18日
 */
// @Table(name="pfp_money_gain")
// @Entity
@Data
@EqualsAndHashCode(callSuper=false)
public class MoneyGain extends BaseEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="money_gain_id")
	private Integer moneyGainId;   // 收入方式ID
	
	@Column(name="money_gain_cname")
	private String moneyGainCname; // 中文名
	
	@Column(name="money_gain_ename")
	private String moneyGainEname; // 英文名
	
	@Column(name="money_gain_icon")
	private String moneyGainIcon;   // 收入方式Icon
	
	@Column(name="money_gain_desc")
	private String moneyGainDesc;   // 收入方式描述
	
	
	
	

}
