package com.entity.view;

import com.entity.CheciOrderEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 购票订单
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("checi_order")
public class CheciOrderView extends CheciOrderEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 订单类型的值
		*/
		private String checiOrderValue;



		//级联表 checi
			/**
			* 车次标题
			*/
			private String checiName;
			/**
			* 车票类型
			*/
			private Integer checiTypes;
				/**
				* 车票类型的值
				*/
				private String checiValue;
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

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 手机号
			*/
			private String yonghuPhone;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;
			/**
			* 余额
			*/
			private Double newMoney;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public CheciOrderView() {

	}

	public CheciOrderView(CheciOrderEntity checiOrderEntity) {
		try {
			BeanUtils.copyProperties(this, checiOrderEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 订单类型的值
			*/
			public String getCheciOrderValue() {
				return checiOrderValue;
			}
			/**
			* 设置： 订单类型的值
			*/
			public void setCheciOrderValue(String checiOrderValue) {
				this.checiOrderValue = checiOrderValue;
			}




				//级联表的get和set checi

					/**
					* 获取： 车次标题
					*/
					public String getCheciName() {
						return checiName;
					}
					/**
					* 设置： 车次标题
					*/
					public void setCheciName(String checiName) {
						this.checiName = checiName;
					}

					/**
					* 获取： 车票类型
					*/
					public Integer getCheciTypes() {
						return checiTypes;
					}
					/**
					* 设置： 车票类型
					*/
					public void setCheciTypes(Integer checiTypes) {
						this.checiTypes = checiTypes;
					}


						/**
						* 获取： 车票类型的值
						*/
						public String getCheciValue() {
							return checiValue;
						}
						/**
						* 设置： 车票类型的值
						*/
						public void setCheciValue(String checiValue) {
							this.checiValue = checiValue;
						}

					/**
					* 获取： 封面
					*/
					public String getCheciPhoto() {
						return checiPhoto;
					}
					/**
					* 设置： 封面
					*/
					public void setCheciPhoto(String checiPhoto) {
						this.checiPhoto = checiPhoto;
					}

					/**
					* 获取： 起始站
					*/
					public String getCheciFuzeren() {
						return checiFuzeren;
					}
					/**
					* 设置： 起始站
					*/
					public void setCheciFuzeren(String checiFuzeren) {
						this.checiFuzeren = checiFuzeren;
					}

					/**
					* 获取： 终点站
					*/
					public String getCheciAddress() {
						return checiAddress;
					}
					/**
					* 设置： 终点站
					*/
					public void setCheciAddress(String checiAddress) {
						this.checiAddress = checiAddress;
					}

					/**
					* 获取： 车票余量
					*/
					public Integer getCheciKucunNumber() {
						return checiKucunNumber;
					}
					/**
					* 设置： 车票余量
					*/
					public void setCheciKucunNumber(Integer checiKucunNumber) {
						this.checiKucunNumber = checiKucunNumber;
					}

					/**
					* 获取： 车票价格
					*/
					public Double getCheciNewMoney() {
						return checiNewMoney;
					}
					/**
					* 设置： 车票价格
					*/
					public void setCheciNewMoney(Double checiNewMoney) {
						this.checiNewMoney = checiNewMoney;
					}

					/**
					* 获取： 发车时间
					*/
					public Date getCheciTime() {
						return checiTime;
					}
					/**
					* 设置： 发车时间
					*/
					public void setCheciTime(Date checiTime) {
						this.checiTime = checiTime;
					}

					/**
					* 获取： 车次详情
					*/
					public String getCheciContent() {
						return checiContent;
					}
					/**
					* 设置： 车次详情
					*/
					public void setCheciContent(String checiContent) {
						this.checiContent = checiContent;
					}
















				//级联表的get和set yonghu

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}

					/**
					* 获取： 余额
					*/
					public Double getNewMoney() {
						return newMoney;
					}
					/**
					* 设置： 余额
					*/
					public void setNewMoney(Double newMoney) {
						this.newMoney = newMoney;
					}

					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}



}
