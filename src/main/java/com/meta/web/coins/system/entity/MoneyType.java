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
 * 币种类型（英镑，人民币，美元等）
 * @author shengdaolin_sh
 * @date 2019年8月18日
 */

@Table(name="config_money_type")
@Entity
@Data
@EqualsAndHashCode(callSuper=false)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MoneyType extends BaseEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="money_type_id")
	private Long moneyTypeId;
	
	@Column(name="money_type_cname")
	private String moneyTypeCname;


	@Column(name="money_type_ename")
	private String moneyTypeEname;


	@Column(name="money_type_desc")
	private String moneyTypeDesc;

}
