package com.entity.vo;

import com.entity.ShiyongdingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 使用订单
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-14 09:46:11
 */
public class ShiyongdingdanVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 桌号
	 */
	
	private String zhuohao;
		
	/**
	 * 小时价格
	 */
	
	private Float xiaoshijiage;
		
	/**
	 * 使用时长
	 */
	
	private Float shiyongshizhang;
		
	/**
	 * 总价格
	 */
	
	private String zongjiage;
		
	/**
	 * 使用日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shiyongriqi;
		
	/**
	 * 会员号
	 */
	
	private String huiyuanhao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
				
	
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
	 * 设置：使用时长
	 */
	 
	public void setShiyongshizhang(Float shiyongshizhang) {
		this.shiyongshizhang = shiyongshizhang;
	}
	
	/**
	 * 获取：使用时长
	 */
	public Float getShiyongshizhang() {
		return shiyongshizhang;
	}
				
	
	/**
	 * 设置：总价格
	 */
	 
	public void setZongjiage(String zongjiage) {
		this.zongjiage = zongjiage;
	}
	
	/**
	 * 获取：总价格
	 */
	public String getZongjiage() {
		return zongjiage;
	}
				
	
	/**
	 * 设置：使用日期
	 */
	 
	public void setShiyongriqi(Date shiyongriqi) {
		this.shiyongriqi = shiyongriqi;
	}
	
	/**
	 * 获取：使用日期
	 */
	public Date getShiyongriqi() {
		return shiyongriqi;
	}
				
	
	/**
	 * 设置：会员号
	 */
	 
	public void setHuiyuanhao(String huiyuanhao) {
		this.huiyuanhao = huiyuanhao;
	}
	
	/**
	 * 获取：会员号
	 */
	public String getHuiyuanhao() {
		return huiyuanhao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
			
}
