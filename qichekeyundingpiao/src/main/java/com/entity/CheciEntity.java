package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 车票信息
 *
 * @author 
 * @email
 */
@TableName("checi")
public class CheciEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public CheciEntity() {

	}

	public CheciEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 车次标题
     */
    @TableField(value = "checi_name")

    private String checiName;


    /**
     * 车票类型
     */
    @TableField(value = "checi_types")

    private Integer checiTypes;


    /**
     * 封面
     */
    @TableField(value = "checi_photo")

    private String checiPhoto;


    /**
     * 起始站
     */
    @TableField(value = "checi_fuzeren")

    private String checiFuzeren;


    /**
     * 终点站
     */
    @TableField(value = "checi_address")

    private String checiAddress;


    /**
     * 车票余量
     */
    @TableField(value = "checi_kucun_number")

    private Integer checiKucunNumber;


    /**
     * 车票价格
     */
    @TableField(value = "checi_new_money")

    private Double checiNewMoney;


    /**
     * 发车时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "checi_time")

    private Date checiTime;


    /**
     * 车次详情
     */
    @TableField(value = "checi_content")

    private String checiContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 设置：车次标题
	 */
    public String getCheciName() {
        return checiName;
    }
    /**
	 * 获取：车次标题
	 */

    public void setCheciName(String checiName) {
        this.checiName = checiName;
    }
    /**
	 * 设置：车票类型
	 */
    public Integer getCheciTypes() {
        return checiTypes;
    }
    /**
	 * 获取：车票类型
	 */

    public void setCheciTypes(Integer checiTypes) {
        this.checiTypes = checiTypes;
    }
    /**
	 * 设置：封面
	 */
    public String getCheciPhoto() {
        return checiPhoto;
    }
    /**
	 * 获取：封面
	 */

    public void setCheciPhoto(String checiPhoto) {
        this.checiPhoto = checiPhoto;
    }
    /**
	 * 设置：起始站
	 */
    public String getCheciFuzeren() {
        return checiFuzeren;
    }
    /**
	 * 获取：起始站
	 */

    public void setCheciFuzeren(String checiFuzeren) {
        this.checiFuzeren = checiFuzeren;
    }
    /**
	 * 设置：终点站
	 */
    public String getCheciAddress() {
        return checiAddress;
    }
    /**
	 * 获取：终点站
	 */

    public void setCheciAddress(String checiAddress) {
        this.checiAddress = checiAddress;
    }
    /**
	 * 设置：车票余量
	 */
    public Integer getCheciKucunNumber() {
        return checiKucunNumber;
    }
    /**
	 * 获取：车票余量
	 */

    public void setCheciKucunNumber(Integer checiKucunNumber) {
        this.checiKucunNumber = checiKucunNumber;
    }
    /**
	 * 设置：车票价格
	 */
    public Double getCheciNewMoney() {
        return checiNewMoney;
    }
    /**
	 * 获取：车票价格
	 */

    public void setCheciNewMoney(Double checiNewMoney) {
        this.checiNewMoney = checiNewMoney;
    }
    /**
	 * 设置：发车时间
	 */
    public Date getCheciTime() {
        return checiTime;
    }
    /**
	 * 获取：发车时间
	 */

    public void setCheciTime(Date checiTime) {
        this.checiTime = checiTime;
    }
    /**
	 * 设置：车次详情
	 */
    public String getCheciContent() {
        return checiContent;
    }
    /**
	 * 获取：车次详情
	 */

    public void setCheciContent(String checiContent) {
        this.checiContent = checiContent;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Checi{" +
            "id=" + id +
            ", checiName=" + checiName +
            ", checiTypes=" + checiTypes +
            ", checiPhoto=" + checiPhoto +
            ", checiFuzeren=" + checiFuzeren +
            ", checiAddress=" + checiAddress +
            ", checiKucunNumber=" + checiKucunNumber +
            ", checiNewMoney=" + checiNewMoney +
            ", checiTime=" + checiTime +
            ", checiContent=" + checiContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
