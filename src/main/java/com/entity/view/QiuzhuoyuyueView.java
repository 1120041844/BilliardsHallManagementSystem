package com.entity.view;

import com.entity.QiuzhuoyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 球桌预约
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-14 09:46:11
 */
@TableName("qiuzhuoyuyue")
public class QiuzhuoyuyueView  extends QiuzhuoyuyueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QiuzhuoyuyueView(){
	}
 
 	public QiuzhuoyuyueView(QiuzhuoyuyueEntity qiuzhuoyuyueEntity){
 	try {
			BeanUtils.copyProperties(this, qiuzhuoyuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
