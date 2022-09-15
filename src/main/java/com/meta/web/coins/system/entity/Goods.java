package com.meta.web.coins.system.entity;

import com.meta.web.coins.common.BaseEntity;
import lombok.*;

import javax.persistence.*;

/**
 * 商品
 * @author shengdaolin_sh
 * @date 2022年9月15日
 */
@Table(name="pfp_goods")
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
	@Column(name="good_id")
	private Integer goodId;    // 商品ID

	@Column(name="good_type_id")
	private String goodTypeId;   // 商品类型ID

	@Column(name="good_type_name")
	private String goodTypeName; // 商品类型名称

	@Column(name="good_cname")
	private String goodCname;   // 商品中文名

	@Column(name="good_ename")
	private String goodEname;   // 商品英文名

    @Column(name="good_price")
    private Double goodPrice;   // 商品价格

	@Column(name="good_desc")
	private String goodDesc;    // 商品描述

}
