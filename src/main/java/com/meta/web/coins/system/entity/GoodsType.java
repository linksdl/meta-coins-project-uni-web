package com.meta.web.coins.system.entity;

import com.meta.web.coins.common.BaseEntity;
import lombok.*;

import javax.persistence.*;

/**
 * 商品类型
 * @author shengdaolin_sh
 * @date 2022年9月15日
 */
@Table(name="pfp_goods_type")
@Entity
@Data
@EqualsAndHashCode(callSuper=false)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GoodsType extends BaseEntity {

    private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="good_type_id")
	private Integer goodTypeId;    // 商品类型ID

	@Column(name="good_type_name")
	private String goodTypeName;   // 商品类型名称

	@Column(name="good_type_desc")
	private String goodTypeDesc;   // 商品类型描述

}
