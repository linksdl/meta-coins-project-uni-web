/**   
 * @Title: IncomeItemSort.java 
 * @Package com.sdl.pfp.property.common.entity 
 * @Description: TODO 
 * @author shengdaolin_sh  
 * @date 2019年8月18日 上午10:50:15 
 * @version V1.0   
 */
package com.meta.web.coins.system.entity;

import com.meta.web.coins.common.BaseEntity;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 分类: 投资
 * @author shengdaolin_sh
 * @date 2019年8月18日
 */
@Table(name="pfp_config_category_invest")
@Entity
@Data
@EqualsAndHashCode(callSuper=false)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CategoryInvest extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="category_id")
	private Long    categoryId;     // 分类ID
	
	@Column(name="category_name")
	private String  categoryName;   // 分类名称

	@Column(name="category_type")
	private String  categoryType;   // 分类类型（支出，收入，投资）
	
	@Column(name="parent_id")
	private Long parentId;          // 父类ID
	
	@Column(name="category_desc")
	private String  categoryDesc;   // 分类描述
	
	@Column(name="category_level")
	private String  categoryLevel;  // 分类层次
	
	@Column(name="category_sort")
	private String  categorySort;   // 排序

	/** 子分类 */
	@Transient
    private List<CategoryInvest> children = new ArrayList<CategoryInvest>();
}
