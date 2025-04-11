package com.entity.vo;

import com.entity.CheciOrderEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 购票订单
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("checi_order")
public class CheciOrderVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 订单号
     */

    @TableField(value = "checi_order_uuid_number")
    private String checiOrderUuidNumber;


    /**
     * 车票
     */

    @TableField(value = "checi_id")
    private Integer checiId;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 购买数量
     */

    @TableField(value = "buy_number")
    private Integer buyNumber;


    /**
     * 实付价格
     */

    @TableField(value = "checi_order_true_price")
    private Double checiOrderTruePrice;


    /**
     * 订单类型
     */

    @TableField(value = "checi_order_types")
    private Integer checiOrderTypes;


    /**
     * 订单创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show3
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：订单号
	 */
    public String getCheciOrderUuidNumber() {
        return checiOrderUuidNumber;
    }


    /**
	 * 获取：订单号
	 */

    public void setCheciOrderUuidNumber(String checiOrderUuidNumber) {
        this.checiOrderUuidNumber = checiOrderUuidNumber;
    }
    /**
	 * 设置：车票
	 */
    public Integer getCheciId() {
        return checiId;
    }


    /**
	 * 获取：车票
	 */

    public void setCheciId(Integer checiId) {
        this.checiId = checiId;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：购买数量
	 */
    public Integer getBuyNumber() {
        return buyNumber;
    }


    /**
	 * 获取：购买数量
	 */

    public void setBuyNumber(Integer buyNumber) {
        this.buyNumber = buyNumber;
    }
    /**
	 * 设置：实付价格
	 */
    public Double getCheciOrderTruePrice() {
        return checiOrderTruePrice;
    }


    /**
	 * 获取：实付价格
	 */

    public void setCheciOrderTruePrice(Double checiOrderTruePrice) {
        this.checiOrderTruePrice = checiOrderTruePrice;
    }
    /**
	 * 设置：订单类型
	 */
    public Integer getCheciOrderTypes() {
        return checiOrderTypes;
    }


    /**
	 * 获取：订单类型
	 */

    public void setCheciOrderTypes(Integer checiOrderTypes) {
        this.checiOrderTypes = checiOrderTypes;
    }
    /**
	 * 设置：订单创建时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：订单创建时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间 show3
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show3
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
