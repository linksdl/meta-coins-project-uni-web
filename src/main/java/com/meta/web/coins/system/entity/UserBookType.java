package com.meta.web.coins.system.entity;

import com.meta.web.coins.common.BaseEntity;
import lombok.*;

import javax.persistence.*;

/**
 * 账本：家庭账本，个人账本，投资账本，经营账本等
 * @author shengdaolin_sh
 * @date 2019年8月18日
 */
@Table(name="pfp_config_book")
@Entity
@Data
@EqualsAndHashCode(callSuper=false)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserBookType extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="book_id")
	private Long bookId;       // 账本Id

	@Column(name="book_name")
	private String  bookName;  // 账本名

	@Column(name="book_desc")
	private String  bookDesc;  // 账本描述

}
