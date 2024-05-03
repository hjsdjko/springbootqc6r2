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
 * 工资调整
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-02 16:46:23
 */
@TableName("gongzidiaozheng")
public class GongzidiaozhengEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public GongzidiaozhengEntity() {
		
	}
	
	public GongzidiaozhengEntity(T t) {
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
	 * 调整原因
	 */
					
	private String diaozhengyuanyin;
	
	/**
	 * 调整额度
	 */
					
	private Integer diaozhengedu;
	
	/**
	 * 调整时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date diaozhengshijian;
	
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
	 * 设置：调整原因
	 */
	public void setDiaozhengyuanyin(String diaozhengyuanyin) {
		this.diaozhengyuanyin = diaozhengyuanyin;
	}
	/**
	 * 获取：调整原因
	 */
	public String getDiaozhengyuanyin() {
		return diaozhengyuanyin;
	}
	/**
	 * 设置：调整额度
	 */
	public void setDiaozhengedu(Integer diaozhengedu) {
		this.diaozhengedu = diaozhengedu;
	}
	/**
	 * 获取：调整额度
	 */
	public Integer getDiaozhengedu() {
		return diaozhengedu;
	}
	/**
	 * 设置：调整时间
	 */
	public void setDiaozhengshijian(Date diaozhengshijian) {
		this.diaozhengshijian = diaozhengshijian;
	}
	/**
	 * 获取：调整时间
	 */
	public Date getDiaozhengshijian() {
		return diaozhengshijian;
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

}
