/**   
 * @Title: EmotionCondition.java 
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
 * 心情状况：生气，高兴
 * @author shengdaolin_sh
 * @date 2019年8月18日
 */
@Table(name="config_emotion")
@Entity
@Data
@EqualsAndHashCode(callSuper=false)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Emotion extends BaseEntity {


	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="emotion_id")
	private Integer emotionId;   // 心情ID

	@Column(name="emotion_cname")
	private String emotionCname; // 心情中文名
	
	@Column(name="emotion_ename")
	private String emotionEname; // 心情英文名

	@Column(name="emotion_scope")
	private String emotionScope; // 心情作用类型

	@Column(name="emotion_desc")
	private String emotionDesc;  // 心情描述

}
