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
 * 分类（收入，支出等有多级分类）
 * @author shengdaolin_sh
 * @date 2019年8月18日
 */
@Table(name="config_category")
@Entity
@Data
@EqualsAndHashCode(callSuper=false)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Category extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="category_id")
	private Long  categoryId;       // 分类ID

	@Column(name="category_parent_id")
	private Long categoryParentId;  // 分类父ID

	@Column(name="category_parent_name")
	private String categoryParentName;  // 分类父名称

	@Column(name="category_name")
	private String  categoryName;   // 分类名称

	@Column(name="category_type")
	private String  categoryType;   // 分类类型（支出，收入，投资）

	@Column(name="category_class")
	private String categoryClass;    // 分类分类（正 负）
	
	@Column(name="category_desc")
	private String  categoryDesc;   // 分类描述

	@Column(name="category_scope")
    private String categoryScope;   // 作用范围：全部，支出，收入，借入，借出，转账等

	@Column(name="category_level")
	private String  categoryLevel;  // 分类层次
	
	@Column(name="category_sort")
	private String  categorySort;   // 排序

	/** 子分类 */
	@Transient
    private List<Category> children = new ArrayList<Category>();

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
