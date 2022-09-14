/**   
 * @Title: MoneyType.java 
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
 * 币种
 * @author shengdaolin_sh
 * @date 2019年8月18日
 */

@Entity
@Table(name="pfp_config_money_type")
@Data
@EqualsAndHashCode(callSuper=false)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MoneyType extends BaseEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="money_id")
	private Long moneyId;
	
	@Column(name="money_cname")
	private String moneyCname;
	
	@Column(name="money_ename")
	private String moneyEname;

	@Column(name="money_rate")
	private double moneyRate;
	
	@Column(name="money_desc")
	private String moneyDesc;

}
