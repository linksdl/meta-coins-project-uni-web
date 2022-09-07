package com.meta.web.coins.system.entity;


import com.meta.web.coins.common.BaseEntity;
import lombok.*;
import javax.persistence.*;

@Table(name="system_member")
@Entity
@Data
@EqualsAndHashCode(callSuper=false)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Member extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="member_id")
	private Long memberId;    // 成员ID

	@Column(name="member_name")
	private String memberName;   // 成员名称

	@Column(name="member_type_id")
	private Long memberTypeId;   // 成员身份类别ID

	@Column(name="member_type")
	private String memberType;   // 成员类别

}
