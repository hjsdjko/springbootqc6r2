package com.entity.model;

import com.entity.YuangonggongziEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 员工工资
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-02 16:46:23
 */
public class YuangonggongziModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 员工工号
	 */
	
	private String yuangonggonghao;
		
	/**
	 * 员工姓名
	 */
	
	private String yuangongxingming;
		
	/**
	 * 部门
	 */
	
	private String bumen;
		
	/**
	 * 基本工资
	 */
	
	private Integer jibengongzi;
		
	/**
	 * 工龄补贴
	 */
	
	private Integer gonglingbutie;
		
	/**
	 * 加班工资
	 */
	
	private Integer jiabangongzi;
		
	/**
	 * 奖励
	 */
	
	private Integer jiangli;
		
	/**
	 * 罚款
	 */
	
	private Integer fakuan;
		
	/**
	 * 个税
	 */
	
	private Integer geshui;
		
	/**
	 * 社保代缴
	 */
	
	private Integer shebaodaijiao;
		
	/**
	 * 奖惩说明
	 */
	
	private String jiangchengshuoming;
		
	/**
	 * 实发工资
	 */
	
	private Float shifagongzi;
		
	/**
	 * 登记时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjishijian;
				
	
	/**
	 * 设置：员工工号
	 */
	 
	public void setYuangonggonghao(String yuangonggonghao) {
		this.yuangonggonghao = yuangonggonghao;
	}
	
	/**
	 * 获取：员工工号
	 */
	public String getYuangonggonghao() {
		return yuangonggonghao;
	}
				
	
	/**
	 * 设置：员工姓名
	 */
	 
	public void setYuangongxingming(String yuangongxingming) {
		this.yuangongxingming = yuangongxingming;
	}
	
	/**
	 * 获取：员工姓名
	 */
	public String getYuangongxingming() {
		return yuangongxingming;
	}
				
	
	/**
	 * 设置：部门
	 */
	 
	public void setBumen(String bumen) {
		this.bumen = bumen;
	}
	
	/**
	 * 获取：部门
	 */
	public String getBumen() {
		return bumen;
	}
				
	
	/**
	 * 设置：基本工资
	 */
	 
	public void setJibengongzi(Integer jibengongzi) {
		this.jibengongzi = jibengongzi;
	}
	
	/**
	 * 获取：基本工资
	 */
	public Integer getJibengongzi() {
		return jibengongzi;
	}
				
	
	/**
	 * 设置：工龄补贴
	 */
	 
	public void setGonglingbutie(Integer gonglingbutie) {
		this.gonglingbutie = gonglingbutie;
	}
	
	/**
	 * 获取：工龄补贴
	 */
	public Integer getGonglingbutie() {
		return gonglingbutie;
	}
				
	
	/**
	 * 设置：加班工资
	 */
	 
	public void setJiabangongzi(Integer jiabangongzi) {
		this.jiabangongzi = jiabangongzi;
	}
	
	/**
	 * 获取：加班工资
	 */
	public Integer getJiabangongzi() {
		return jiabangongzi;
	}
				
	
	/**
	 * 设置：奖励
	 */
	 
	public void setJiangli(Integer jiangli) {
		this.jiangli = jiangli;
	}
	
	/**
	 * 获取：奖励
	 */
	public Integer getJiangli() {
		return jiangli;
	}
				
	
	/**
	 * 设置：罚款
	 */
	 
	public void setFakuan(Integer fakuan) {
		this.fakuan = fakuan;
	}
	
	/**
	 * 获取：罚款
	 */
	public Integer getFakuan() {
		return fakuan;
	}
				
	
	/**
	 * 设置：个税
	 */
	 
	public void setGeshui(Integer geshui) {
		this.geshui = geshui;
	}
	
	/**
	 * 获取：个税
	 */
	public Integer getGeshui() {
		return geshui;
	}
				
	
	/**
	 * 设置：社保代缴
	 */
	 
	public void setShebaodaijiao(Integer shebaodaijiao) {
		this.shebaodaijiao = shebaodaijiao;
	}
	
	/**
	 * 获取：社保代缴
	 */
	public Integer getShebaodaijiao() {
		return shebaodaijiao;
	}
				
	
	/**
	 * 设置：奖惩说明
	 */
	 
	public void setJiangchengshuoming(String jiangchengshuoming) {
		this.jiangchengshuoming = jiangchengshuoming;
	}
	
	/**
	 * 获取：奖惩说明
	 */
	public String getJiangchengshuoming() {
		return jiangchengshuoming;
	}
				
	
	/**
	 * 设置：实发工资
	 */
	 
	public void setShifagongzi(Float shifagongzi) {
		this.shifagongzi = shifagongzi;
	}
	
	/**
	 * 获取：实发工资
	 */
	public Float getShifagongzi() {
		return shifagongzi;
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
