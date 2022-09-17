package com.meta.web.coins.system.entity;

import com.meta.web.coins.common.BaseEntity;
import lombok.*;

import javax.persistence.*;


/**
 * 城市记录表
 * @author shengdaolin_sh
 * @date 2019年8月18日
 */
@Table(name="config_city")
@Entity
@Data
@EqualsAndHashCode(callSuper=false)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class City extends BaseEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="city_id")
	private Integer cityId;      // 城市ID

	@Column(name="city_country")
	private String cityCountry;  // 城市所在国家

    @Column(name="city_privence")
	private String cityPrivence; // 城市所在省份，州

	@Column(name="city_cname")
	private String cityCname;   // 城市中文名

	@Column(name="city_ename")
	private String cityEname;   // 城市英文名

	@Column(name="city_desc")
	private String cityDesc;    // 城市描述
}
