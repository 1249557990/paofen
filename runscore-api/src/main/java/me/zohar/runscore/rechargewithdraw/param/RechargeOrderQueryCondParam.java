package me.zohar.runscore.rechargewithdraw.param;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
import lombok.EqualsAndHashCode;
import me.zohar.runscore.common.param.PageParam;

@Data
@EqualsAndHashCode(callSuper = false)
public class RechargeOrderQueryCondParam extends PageParam {

	/**
	 * 订单号
	 */
	private String orderNo;

	/**
	 * 订单状态
	 */
	private String orderState;
	
	/**
	 * 充值方式代码
	 */
	private String rechargeWayCode;

	/**
	 * 提交开始时间
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date submitStartTime;

	/**
	 * 提交结束时间
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date submitEndTime;

}
