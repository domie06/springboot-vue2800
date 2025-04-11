package com.entity.model;

import com.entity.CheciOrderEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 购票订单
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class CheciOrderModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 订单号
     */
    private String checiOrderUuidNumber;


    /**
     * 车票
     */
    private Integer checiId;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 购买数量
     */
    private Integer buyNumber;


    /**
     * 实付价格
     */
    private Double checiOrderTruePrice;


    /**
     * 订单类型
     */
    private Integer checiOrderTypes;


    /**
     * 订单创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show3
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：订单号
	 */
    public String getCheciOrderUuidNumber() {
        return checiOrderUuidNumber;
    }


    /**
	 * 设置：订单号
	 */
    public void setCheciOrderUuidNumber(String checiOrderUuidNumber) {
        this.checiOrderUuidNumber = checiOrderUuidNumber;
    }
    /**
	 * 获取：车票
	 */
    public Integer getCheciId() {
        return checiId;
    }


    /**
	 * 设置：车票
	 */
    public void setCheciId(Integer checiId) {
        this.checiId = checiId;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：购买数量
	 */
    public Integer getBuyNumber() {
        return buyNumber;
    }


    /**
	 * 设置：购买数量
	 */
    public void setBuyNumber(Integer buyNumber) {
        this.buyNumber = buyNumber;
    }
    /**
	 * 获取：实付价格
	 */
    public Double getCheciOrderTruePrice() {
        return checiOrderTruePrice;
    }


    /**
	 * 设置：实付价格
	 */
    public void setCheciOrderTruePrice(Double checiOrderTruePrice) {
        this.checiOrderTruePrice = checiOrderTruePrice;
    }
    /**
	 * 获取：订单类型
	 */
    public Integer getCheciOrderTypes() {
        return checiOrderTypes;
    }


    /**
	 * 设置：订单类型
	 */
    public void setCheciOrderTypes(Integer checiOrderTypes) {
        this.checiOrderTypes = checiOrderTypes;
    }
    /**
	 * 获取：订单创建时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：订单创建时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show3
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show3
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
