package com.meta.web.coins.system.entity;

import com.meta.web.coins.common.BaseEntity;
import lombok.*;

import javax.persistence.*;

/**
 * 商品信息表
 * @author shengdaolin_sh
 * @date 2022年9月15日
 */
@Table(name="config_goods")
@Entity
@Data
@EqualsAndHashCode(callSuper=false)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Goods extends BaseEntity {

    private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="goods_id")
	private Long goodsId;      // 商品ID

	@Column(name="goods_type_id")
	private Long goodsTypeId;   // 商品类型ID

	@Column(name="goods_type_name")
	private String goodTypeName; // 商品类型名称

	@Column(name="goods_cname")
	private String goodsCname;   // 商品中文名

	@Column(name="goods_ename")
	private String goodsEname;   // 商品英文名

    @Column(name="goods_price")
    private Double goodsPrice;   // 商品价格

	@Column(name="goods_desc")
	private String goodsDesc;    // 商品描述

	// 关联不同用户和用户不同账本
	@Column(name="user_id")
	private Long  userId;    	  // 用户ID

	@Column(name="user_name")
	private String userName;      // 用户名称

	@Column(name="book_id")
	private Long bookId;         // 账本Id

	@Column(name="book_name")
	private String bookName;     // 账本名称


}
