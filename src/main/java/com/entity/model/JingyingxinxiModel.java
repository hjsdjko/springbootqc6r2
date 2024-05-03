package com.entity.model;

import com.entity.JingyingxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 经营信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-02 16:46:23
 */
public class JingyingxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 营收金额
	 */
	
	private Integer yingshoujine;
		
	/**
	 * 月产量
	 */
	
	private String yuechanliang;
		
	/**
	 * 前一客户
	 */
	
	private String qianyikehu;
		
	/**
	 * 前一百分比
	 */
	
	private Float qianyibaifenbi;
		
	/**
	 * 前二客户
	 */
	
	private String qianerkehu;
		
	/**
	 * 前二百分比
	 */
	
	private Float qianerbaifenbi;
		
	/**
	 * 前三客户
	 */
	
	private String qiansankehu;
		
	/**
	 * 前三百分比
	 */
	
	private Float qiansanbaifenbi;
		
	/**
	 * 登记时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjishijian;
				
	
	/**
	 * 设置：营收金额
	 */
	 
	public void setYingshoujine(Integer yingshoujine) {
		this.yingshoujine = yingshoujine;
	}
	
	/**
	 * 获取：营收金额
	 */
	public Integer getYingshoujine() {
		return yingshoujine;
	}
				
	
	/**
	 * 设置：月产量
	 */
	 
	public void setYuechanliang(String yuechanliang) {
		this.yuechanliang = yuechanliang;
	}
	
	/**
	 * 获取：月产量
	 */
	public String getYuechanliang() {
		return yuechanliang;
	}
				
	
	/**
	 * 设置：前一客户
	 */
	 
	public void setQianyikehu(String qianyikehu) {
		this.qianyikehu = qianyikehu;
	}
	
	/**
	 * 获取：前一客户
	 */
	public String getQianyikehu() {
		return qianyikehu;
	}
				
	
	/**
	 * 设置：前一百分比
	 */
	 
	public void setQianyibaifenbi(Float qianyibaifenbi) {
		this.qianyibaifenbi = qianyibaifenbi;
	}
	
	/**
	 * 获取：前一百分比
	 */
	public Float getQianyibaifenbi() {
		return qianyibaifenbi;
	}
				
	
	/**
	 * 设置：前二客户
	 */
	 
	public void setQianerkehu(String qianerkehu) {
		this.qianerkehu = qianerkehu;
	}
	
	/**
	 * 获取：前二客户
	 */
	public String getQianerkehu() {
		return qianerkehu;
	}
				
	
	/**
	 * 设置：前二百分比
	 */
	 
	public void setQianerbaifenbi(Float qianerbaifenbi) {
		this.qianerbaifenbi = qianerbaifenbi;
	}
	
	/**
	 * 获取：前二百分比
	 */
	public Float getQianerbaifenbi() {
		return qianerbaifenbi;
	}
				
	
	/**
	 * 设置：前三客户
	 */
	 
	public void setQiansankehu(String qiansankehu) {
		this.qiansankehu = qiansankehu;
	}
	
	/**
	 * 获取：前三客户
	 */
	public String getQiansankehu() {
		return qiansankehu;
	}
				
	
	/**
	 * 设置：前三百分比
	 */
	 
	public void setQiansanbaifenbi(Float qiansanbaifenbi) {
		this.qiansanbaifenbi = qiansanbaifenbi;
	}
	
	/**
	 * 获取：前三百分比
	 */
	public Float getQiansanbaifenbi() {
		return qiansanbaifenbi;
	}
				
	
	/**
	 * 设置：登记时间
	 */
	 
	public void setDengjishijian(Date dengjishijian) {
		this.dengjishijian = dengjishijian;
	}
	
	/**
	 * 获取：登记时间
	 */
	public Date getDengjishijian() {
		return dengjishijian;
	}
			
}
