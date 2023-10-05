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
 * 台球桌
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-14 09:46:11
 */
@TableName("taiqiuzhuo")
public class TaiqiuzhuoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public TaiqiuzhuoEntity() {
		
	}
	
	public TaiqiuzhuoEntity(T t) {
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
	 * 桌号
	 */
					
	private String zhuohao;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 小时价格
	 */
					
	private Float xiaoshijiage;
	
	/**
	 * 球桌介绍
	 */
					
	private String qiuzhuojieshao;
	
	/**
	 * 可约时间
	 */
					
	private String keyueshijian;
	
	/**
	 * 状态
	 */
					
	private String zhuangtai;
	
	
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
	 * 设置：桌号
	 */
	public void setZhuohao(String zhuohao) {
		this.zhuohao = zhuohao;
	}
	/**
	 * 获取：桌号
	 */
	public String getZhuohao() {
		return zhuohao;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：小时价格
	 */
	public void setXiaoshijiage(Float xiaoshijiage) {
		this.xiaoshijiage = xiaoshijiage;
	}
	/**
	 * 获取：小时价格
	 */
	public Float getXiaoshijiage() {
		return xiaoshijiage;
	}
	/**
	 * 设置：球桌介绍
	 */
	public void setQiuzhuojieshao(String qiuzhuojieshao) {
		this.qiuzhuojieshao = qiuzhuojieshao;
	}
	/**
	 * 获取：球桌介绍
	 */
	public String getQiuzhuojieshao() {
		return qiuzhuojieshao;
	}
	/**
	 * 设置：可约时间
	 */
	public void setKeyueshijian(String keyueshijian) {
		this.keyueshijian = keyueshijian;
	}
	/**
	 * 获取：可约时间
	 */
	public String getKeyueshijian() {
		return keyueshijian;
	}
	/**
	 * 设置：状态
	 */
	public void setZhuangtai(String zhuangtai) {
		this.zhuangtai = zhuangtai;
	}
	/**
	 * 获取：状态
	 */
	public String getZhuangtai() {
		return zhuangtai;
	}

}
