/**   
 * @Title: ItemLabels.java 
 * @Package com.sdl.pfp.property.common 
 * @Description: TODO 
 * @author shengdaolin_sh  
 * @date 2019年8月18日 上午9:48:56 
 * @version V1.0   
 */
package com.meta.web.coins.system.entity;

import com.meta.web.coins.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

/**
 * 标签, 用于统计特定的：收入，支出等标签管理，例如：点外卖，聚会，打车等
 * @author shengdaolin_sh
 * @date 2019年8月18日
 */
@Table(name="pfp_config_label")
@Entity
@Data
@EqualsAndHashCode(callSuper=false)
public class ItemLabel extends BaseEntity {

	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="label_id")
	private Long labelId;       // 标签Id

	@Column(name="label_type")
	private String labelType;   // 标签类别 收入 支出 投资 全部
	
	@Column(name="label_cname")
	private String  labelCname; // 标签中文名
	
	@Column(name="label_ename")
	private String  labelEname; // 标签英文名
	
	@Column(name="label_desc")
	private String  labelDesc;  // 标签描述
	
	
	

}
