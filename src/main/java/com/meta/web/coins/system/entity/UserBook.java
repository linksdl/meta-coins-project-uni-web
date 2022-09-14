package com.meta.web.coins.system.entity;

import com.meta.web.coins.common.BaseEntity;
import lombok.*;

import javax.persistence.*;

/**
 * 账本：家庭账本，个人账本，投资账本，经营账本等
 * @author shengdaolin_sh
 * @date 2019年8月18日
 */
@Table(name="pfp_config_user_book")
@Entity
@Data
@EqualsAndHashCode(callSuper=false)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserBook extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="user_book_id")
	private Long userBookId;       // 用户账本Id

	@Column(name="user_book_type_id")
	private String userBookTypeId;   // 用户账本类别ID

	@Column(name="user_book_type")
	private String userBookType;   // 用户账本类别：默认账本, 个人账户

	@Column(name="user_book_name")
	private String  userBookName;  // 用户账本名

	@Column(name="user_book_desc")
	private String  userBookDesc;  // 用户账本描述

	@Column(name="user_id")
	private String  userId;    	   // 用户ID

}
