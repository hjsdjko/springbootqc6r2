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
 * 员工工资
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-02 16:46:23
 */
@TableName("yuangonggongzi")
public class YuangonggongziEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YuangonggongziEntity() {
		
	}
	
	public YuangonggongziEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 工资月份
	 */
					
	private String gongziyuefen;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date dengjishijian;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：工资月份
	 */
	public void setGongziyuefen(String gongziyuefen) {
		this.gongziyuefen = gongziyuefen;
	}
	/**
	 * 获取：工资月份
	 */
	public String getGongziyuefen() {
		return gongziyuefen;
	}
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
