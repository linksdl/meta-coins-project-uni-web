/**   
 * @Title: WeatherCondition.java 
 * @Package com.sdl.pfp.property.common.entity 
 * @Description: TODO 
 * @author shengdaolin_sh  
 * @date 2019年8月18日 上午10:28:45 
 * @version V1.0   
 */
package com.meta.web.coins.system.entity;

import com.meta.web.coins.common.BaseEntity;
import lombok.*;

import javax.persistence.*;

/**
 * 获取天气状况：阴，晴等天气状况
 * @author shengdaolin_sh
 * @date 2019年8月18日
 */
@Table(name="config_weather")
@Entity
@Data
@EqualsAndHashCode(callSuper=false)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Weather extends BaseEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="weather_id")
	private Integer weatherId;     // 天气ID

	@Column(name="weather_scope")
	private String weatherScope;   // 天气功能范围

	@Column(name="weather_cname")
	private String weatherCname;  // 天气中文名
	
	@Column(name="weather_ename")
	private String weatherEname;  // 天气英文名

	@Column(name="weather_desc")
	private String weatherDesc;   // 天气描述


}
