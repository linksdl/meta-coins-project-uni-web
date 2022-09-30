package com.meta.web.coins.system.entity;

import com.meta.web.coins.common.BaseEntity;
import lombok.*;

import javax.persistence.*;

/**
 * 账本：家庭账本，个人账本，投资账本，经营账本等
 * @author shengdaolin_sh
 * @date 2019年8月18日
 */
@Table(name="config_book_type")
@Entity
@Data
@EqualsAndHashCode(callSuper=false)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookType extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="book_type_id")
	private Long bookTypeId;         // 账本类型Id

	@Column(name="book_type_name")
	private String  bookTypeName;    // 账本类型名称

	@Column(name="book_type_desc")
	private String  bookTypeDesc;    // 账本类型描述

}
