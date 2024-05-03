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
 * 序时账
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-02 16:46:23
 */
@TableName("xushizhang")
public class XushizhangEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XushizhangEntity() {
		
	}
	
	public XushizhangEntity(T t) {
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
	 * 凭证单号
	 */
					
	private String pingzhengdanhao;
	
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
	 * 设置：凭证单号
	 */
	public void setPingzhengdanhao(String pingzhengdanhao) {
		this.pingzhengdanhao = pingzhengdanhao;
	}
	/**
	 * 获取：凭证单号
	 */
	public String getPingzhengdanhao() {
		return pingzhengdanhao;
	}
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
