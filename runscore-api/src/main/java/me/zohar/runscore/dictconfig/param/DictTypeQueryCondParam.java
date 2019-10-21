package me.zohar.runscore.dictconfig.param;

import lombok.Data;
import lombok.EqualsAndHashCode;
import me.zohar.runscore.common.param.PageParam;

@Data
@EqualsAndHashCode(callSuper = false)
public class DictTypeQueryCondParam extends PageParam {
	
	/**
	 * 字典类型code
	 */
	private String dictTypeCode;

	/**
	 * 字典类型名称
	 */
	private String dictTypeName;

}
