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
 * 固定资产
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-02 16:46:23
 */
@TableName("gudingzichan")
public class GudingzichanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public GudingzichanEntity() {
		
	}
	
	public GudingzichanEntity(T t) {
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
	 * 资产名称
	 */
					
	private String zichanmingcheng;
	
	/**
	 * 封面
	 */
					
	private String fengmian;
	
	/**
	 * 资产类别
	 */
					
	private String zichanleibie;
	
	/**
	 * 资产状态
	 */
					
	private String zichanzhuangtai;
	
	/**
	 * 资产价值
	 */
					
	private Integer zichanjiazhi;
	
	/**
	 * 风险计提
	 */
					
	private Integer fengxianjiti;
	
	/**
	 * 计提原因
	 */
					
	private String jitiyuanyin;
	
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
	 * 设置：资产名称
	 */
	public void setZichanmingcheng(String zichanmingcheng) {
		this.zichanmingcheng = zichanmingcheng;
	}
	/**
	 * 获取：资产名称
	 */
	public String getZichanmingcheng() {
		return zichanmingcheng;
	}
	/**
	 * 设置：封面
	 */
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
	/**
	 * 设置：资产类别
	 */
	public void setZichanleibie(String zichanleibie) {
		this.zichanleibie = zichanleibie;
	}
	/**
	 * 获取：资产类别
	 */
	public String getZichanleibie() {
		return zichanleibie;
	}
	/**
	 * 设置：资产状态
	 */
	public void setZichanzhuangtai(String zichanzhuangtai) {
		this.zichanzhuangtai = zichanzhuangtai;
	}
	/**
	 * 获取：资产状态
	 */
	public String getZichanzhuangtai() {
		return zichanzhuangtai;
	}
	/**
	 * 设置：资产价值
	 */
	public void setZichanjiazhi(Integer zichanjiazhi) {
		this.zichanjiazhi = zichanjiazhi;
	}
	/**
	 * 获取：资产价值
	 */
	public Integer getZichanjiazhi() {
		return zichanjiazhi;
	}
	/**
	 * 设置：风险计提
	 */
	public void setFengxianjiti(Integer fengxianjiti) {
		this.fengxianjiti = fengxianjiti;
	}
	/**
	 * 获取：风险计提
	 */
	public Integer getFengxianjiti() {
		return fengxianjiti;
	}
	/**
	 * 设置：计提原因
	 */
	public void setJitiyuanyin(String jitiyuanyin) {
		this.jitiyuanyin = jitiyuanyin;
	}
	/**
	 * 获取：计提原因
	 */
	public String getJitiyuanyin() {
		return jitiyuanyin;
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
