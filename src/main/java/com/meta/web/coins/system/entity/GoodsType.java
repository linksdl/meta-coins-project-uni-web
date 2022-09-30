package com.meta.web.coins.system.entity;

import com.meta.web.coins.common.BaseEntity;
import lombok.*;

import javax.persistence.*;

/**
 * 商品类型
 * @author shengdaolin_sh
 * @date 2022年9月15日
 */
@Table(name="config_goods_type")
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
	@Column(name="goods_type_id")
	private Integer goodsTypeId;    // 商品类型ID

	@Column(name="goods_type_name")
	private String goodsTypeName;   // 商品类型名称

	@Column(name="goods_type_desc")
	private String goodsTypeDesc;   // 商品类型描述


}
