/**   
 * @Title: Account.java 
 * @Package com.sdl.pfp.property.common.entity 
 * @Description: TODO 
 * @author shengdaolin_sh  
 * @date 2019年8月18日 上午11:13:03 
 * @version V1.0   
 */
package com.meta.web.coins.system.entity;

import com.meta.web.coins.common.BaseEntity;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 账户类型：信用账户，现金账户，投资账户等
 * @author shengdaolin_sh
 * @date 2019年8月18日
 */
@Table(name="config_account")
@Entity
@Data
@EqualsAndHashCode(callSuper=false)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Account extends BaseEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="account_id")
	private Long accountId;         // 账户ID

	@Column(name="account_parent_id")
	private Long accountParentId;   // 账户父ID

	@Column(name="account_name")
	private String  accountName;    // 账户名称

	@Column(name="account_type")
	private String  accountType;    // 分类类型（支出，收入）

	@Column(name="account_class")
	private String accountClass;    // 账户分类（正 负）

	@Column(name="account_desc")
	private String  accountDesc;    // 账户描述

	@Column(name="account_scope")
    private String accountScope;    // 作用范围：全部，支出，收入，借入，借出，转账等

	@Column(name="account_level")
	private String  accountLevel;   // 账户层次

	@Column(name="account_sort")
	private String  accountSort;    // 排序

	/** 下级子账户 */
	@Transient
    private List<Account> children = new ArrayList<Account>();

	// 关联不同用户和用户不同账本
	@Column(name="user_id")
	private Long  userId;    	   // 用户ID

	@Column(name="user_name")
	private String userName;       // 用户名称

	@Column(name="book_id")
	private Long bookId;           // 账本Id

	@Column(name="book_name")
	private String bookName;       // 账本名称

}
