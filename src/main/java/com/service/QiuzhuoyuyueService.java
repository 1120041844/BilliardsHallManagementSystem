package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QiuzhuoyuyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QiuzhuoyuyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QiuzhuoyuyueView;


/**
 * 球桌预约
 *
 * @author 
 * @email 
 * @date 2021-04-14 09:46:11
 */
public interface QiuzhuoyuyueService extends IService<QiuzhuoyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QiuzhuoyuyueVO> selectListVO(Wrapper<QiuzhuoyuyueEntity> wrapper);
   	
   	QiuzhuoyuyueVO selectVO(@Param("ew") Wrapper<QiuzhuoyuyueEntity> wrapper);
   	
   	List<QiuzhuoyuyueView> selectListView(Wrapper<QiuzhuoyuyueEntity> wrapper);
   	
   	QiuzhuoyuyueView selectView(@Param("ew") Wrapper<QiuzhuoyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QiuzhuoyuyueEntity> wrapper);
   	
}

