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
	private Integer goodsId;      // 商品ID

	@Column(name="goods_type_id")
	private String goodsTypeId;   // 商品类型ID

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

}