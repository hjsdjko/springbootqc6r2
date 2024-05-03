package com.entity.model;

import com.entity.XushizhangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 序时账
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-02 16:46:23
 */
public class XushizhangModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 发票
	 */
	
	private String fapiao;
		
	/**
	 * 收支类型
	 */
	
	private String shouzhileixing;
		
	/**
	 * 摘要
	 */
	
	private String zhaiyao;
		
	/**
	 * 对方科目
	 */
	
	private String duifangkemu;
		
	/**
	 * 金额
	 */
	
	private Float jine;
		
	/**
	 * 登记时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjishijian;
				
	
	/**
	 * 设置：发票
	 */
	 
	public void setFapiao(String fapiao) {
		this.fapiao = fapiao;
	}
	
	/**
	 * 获取：发票
	 */
	public String getFapiao() {
		return fapiao;
	}
				
	
	/**
	 * 设置：收支类型
	 */
	 
	public void setShouzhileixing(String shouzhileixing) {
		this.shouzhileixing = shouzhileixing;
	}
	
	/**
	 * 获取：收支类型
	 */
	public String getShouzhileixing() {
		return shouzhileixing;
	}
				
	
	/**
	 * 设置：摘要
	 */
	 
	public void setZhaiyao(String zhaiyao) {
		this.zhaiyao = zhaiyao;
	}
	
	/**
	 * 获取：摘要
	 */
	public String getZhaiyao() {
		return zhaiyao;
	}
				
	
	/**
	 * 设置：对方科目
	 */
	 
	public void setDuifangkemu(String duifangkemu) {
		this.duifangkemu = duifangkemu;
	}
	
	/**
	 * 获取：对方科目
	 */
	public String getDuifangkemu() {
		return duifangkemu;
	}
				
	
	/**
	 * 设置：金额
	 */
	 
	public void setJine(Float jine) {
		this.jine = jine;
	}
	
	/**
	 * 获取：金额
	 */
	public Float getJine() {
		return jine;
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
