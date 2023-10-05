package com.entity.vo;

import com.entity.TaiqiuzhuoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 台球桌
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-14 09:46:11
 */
public class TaiqiuzhuoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
