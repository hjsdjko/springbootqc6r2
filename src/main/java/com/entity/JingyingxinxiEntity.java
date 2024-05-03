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
 * 经营信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-02 16:46:23
 */
@TableName("jingyingxinxi")
public class JingyingxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JingyingxinxiEntity() {
		
	}
	
	public JingyingxinxiEntity(T t) {
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
	 * 统计月份
	 */
					
	private String tongjiyuefen;
	
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
	 * 设置：统计月份
	 */
	public void setTongjiyuefen(String tongjiyuefen) {
		this.tongjiyuefen = tongjiyuefen;
	}
	/**
	 * 获取：统计月份
	 */
	public String getTongjiyuefen() {
		return tongjiyuefen;
	}
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
