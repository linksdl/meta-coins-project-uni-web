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
import lombok.*;

import javax.persistence.*;

/**
 * 转账方式
 * @author shengdaolin_sh
 * @date 2019年8月18日
 */
@Table(name="pfp_money_transfer")
@Entity
@Data
@EqualsAndHashCode(callSuper=false)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MoneyTransfer extends BaseEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="money_transfer_id")
	private Integer moneyTransferId;   // 收入方式ID
	
	@Column(name="money_transfer_cname")
	private String moneyTransferCname; // 中文名
	
	@Column(name="money_transfer_ename")
	private String moneyTransferEname; // 英文名
	
	@Column(name="money_transfer_icon")
	private String moneyTransferIcon;   // 收入方式Icon
	
	@Column(name="money_transfer_desc")
	private String moneyTransferDesc;   // 收入方式描述
	

}
