package com.roger.ims.entity;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Title: SysRight
 * @Description: 权限表 sys_right
 * @author roger
 * @date 2019年7月17日
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SysRight {

	/** 权限ID */
	private Long rightId;

	/** 权限名称 */
	private String rightName;

	/** 权限父节点 */
	private Long parentRight;

	/** 权限登记 */
	private Integer rightLevel;

	/** 菜单索引 */
	private String menuIndex;

	/** 按钮 */
	private String icon;

	/** 权限描述 */
	private String description;

	/** creationTime */
	private Date creationTime;

	/** creationUserId */
	private Long creationUserId;

	/** lastUpdateTime */
	private Date lastUpdateTime;

	/** lastUpdateUserId */
	private Long lastUpdateUserId;
	
}