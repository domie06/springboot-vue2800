package com.entity.model;

import com.entity.CheciEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 车票信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class CheciModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 车次标题
     */
    private String checiName;


    /**
     * 车票类型
     */
    private Integer checiTypes;


    /**
     * 封面
     */
    private String checiPhoto;


    /**
     * 起始站
     */
    private String checiFuzeren;


    /**
     * 终点站
     */
    private String checiAddress;


    /**
     * 车票余量
     */
    private Integer checiKucunNumber;


    /**
     * 车票价格
     */
    private Double checiNewMoney;


    /**
     * 发车时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date checiTime;


    /**
     * 车次详情
     */
    private String checiContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间  show1 show2 photoShow
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
	 * 获取：车次标题
	 */
    public String getCheciName() {
        return checiName;
    }


    /**
	 * 设置：车次标题
	 */
    public void setCheciName(String checiName) {
        this.checiName = checiName;
    }
    /**
	 * 获取：车票类型
	 */
    public Integer getCheciTypes() {
        return checiTypes;
    }


    /**
	 * 设置：车票类型
	 */
    public void setCheciTypes(Integer checiTypes) {
        this.checiTypes = checiTypes;
    }
    /**
	 * 获取：封面
	 */
    public String getCheciPhoto() {
        return checiPhoto;
    }


    /**
	 * 设置：封面
	 */
    public void setCheciPhoto(String checiPhoto) {
        this.checiPhoto = checiPhoto;
    }
    /**
	 * 获取：起始站
	 */
    public String getCheciFuzeren() {
        return checiFuzeren;
    }


    /**
	 * 设置：起始站
	 */
    public void setCheciFuzeren(String checiFuzeren) {
        this.checiFuzeren = checiFuzeren;
    }
    /**
	 * 获取：终点站
	 */
    public String getCheciAddress() {
        return checiAddress;
    }


    /**
	 * 设置：终点站
	 */
    public void setCheciAddress(String checiAddress) {
        this.checiAddress = checiAddress;
    }
    /**
	 * 获取：车票余量
	 */
    public Integer getCheciKucunNumber() {
        return checiKucunNumber;
    }


    /**
	 * 设置：车票余量
	 */
    public void setCheciKucunNumber(Integer checiKucunNumber) {
        this.checiKucunNumber = checiKucunNumber;
    }
    /**
	 * 获取：车票价格
	 */
    public Double getCheciNewMoney() {
        return checiNewMoney;
    }


    /**
	 * 设置：车票价格
	 */
    public void setCheciNewMoney(Double checiNewMoney) {
        this.checiNewMoney = checiNewMoney;
    }
    /**
	 * 获取：发车时间
	 */
    public Date getCheciTime() {
        return checiTime;
    }


    /**
	 * 设置：发车时间
	 */
    public void setCheciTime(Date checiTime) {
        this.checiTime = checiTime;
    }
    /**
	 * 获取：车次详情
	 */
    public String getCheciContent() {
        return checiContent;
    }


    /**
	 * 设置：车次详情
	 */
    public void setCheciContent(String checiContent) {
        this.checiContent = checiContent;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：添加时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
