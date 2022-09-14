package com.meta.web.coins.system.entity;

import com.meta.web.coins.common.BaseEntity;
import lombok.*;

import javax.persistence.*;

/**
 * 收入，支出项目（特定的统计方式，例如：结婚，生完，考证，雅思，留学）
 * @author shengdaolin_sh
 * @date 2019年8月18日
 */
@Table(name="pfp_config_project")
@Entity
@Data
@EqualsAndHashCode(callSuper=false)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ItemProject extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="project_id")
	private Long projectId;       // 项目ID

	@Column(name="project_name")
	private String projectName;   // 项目名称

	@Column(name="project_type")
	private String projectType;   // 项目类别，收入，支出，投资等

	@Column(name="project_desc")
	private String projectDesc;   // 项目描述
}
