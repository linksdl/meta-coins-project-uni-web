package com.meta.web.coins.system.entity;

import com.meta.web.coins.common.BaseEntity;
import lombok.*;

import javax.persistence.*;
import java.util.List;

/**
 * 用户的账本列表
 * @author shengdaolin_sh
 * @date 2019年8月18日
 */
@Table(name="config_book")
@Entity
@Data
@EqualsAndHashCode(callSuper=false)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Book extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="book_id")
	private Long bookId;         // 用户账本Id

	@Column(name="book_name")
	private String  bookName;   // 用户账本名

	@Column(name="book_type_id")
	private Long bookTypeId;   // 用户账本类别ID

	@Column(name="book_type")
	private String bookType;    // 用户账本类别：默认账本, 个人账户

	@Column(name="book_desc")
	private String  bookDesc;   // 用户账本描述

	@Column(name="book_default")
	private Integer bookDefault; // 账本是否为默认账本

	@Column(name="user_id")
	private Long  userId;    	// 用户ID

	@Column(name="user_name")
	private String userName;    // 用户名称

}
