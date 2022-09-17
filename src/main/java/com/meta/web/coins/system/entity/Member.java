package com.meta.web.coins.system.entity;


import com.meta.web.coins.common.BaseEntity;
import lombok.*;
import javax.persistence.*;

// 成员对象用于收入，支出，转账，投资，借贷，共用
@Table(name="config_member")
@Entity
@Data
@EqualsAndHashCode(callSuper=false)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Member extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="member_id")
	private Long memberId;        // 成员ID

	@Column(name="member_name")
	private String memberName;    // 成员名称

	@Column(name="member_type_id")
	private String memberTypeId;   // 外键，一对一，成员身份类别ID,

	@Column(name="member_type")
	private String memberType;    // 成员类别, "校友，同学"

	@Column(name="member_desc")
	private String memberDesc;    // 成员描述

	@Column(name="member_scope")
    private String memberScope;   // 作用范围：全部，支出，收入，借入，借出，转账等

	// 关联不同用户和用户不同账本
	@Column(name="user_id")
	private String  userId;    	  // 用户ID

	@Column(name="book_id")
	private Long bookId;         // 账本Id

}
