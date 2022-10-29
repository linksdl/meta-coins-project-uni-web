package com.meta.web.coins.bill.entity;

import com.meta.web.coins.common.BaseEntity;
import lombok.*;

import javax.persistence.*;

/**
 * 支出关联商品信息表
 * @author shengdaolin_sh
 * @date 2022年10月29日
 */
@Table(name="bill_consume_goods")
@Entity
@Data
@EqualsAndHashCode(callSuper=false)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ConsumeGoods extends BaseEntity {

    private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="consume_goods_id")
	private Long consumeGoodsId;     // 消费商品ID

    @Column(name="consume_bill_id")
    private Long goodsBillId;        // 消费账单ID

	@Column(name="goods_id")
	private Long  goodsId;    	     // 商品ID

	@Column(name="goods_cname")
	private String goodsCname;       // 商品中文名

	@Column(name="goods_ename")
	private String goodsEname;      // 商品英文名

    @Column(name="goods_price")
    private Double goodsPrice;      // 商品价格

	@Column(name="goods_total")
    private Integer goodsTotal;     // 数量

	@Column(name="goods_total_price")
    private Double goodsTotalPrice; // 总价

	@Column(name="goods_desc")
	private String goodsDesc;       // 商品描述

}
