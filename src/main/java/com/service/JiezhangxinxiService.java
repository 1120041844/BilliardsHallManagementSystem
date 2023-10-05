package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiezhangxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiezhangxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiezhangxinxiView;


/**
 * 结账信息
 *
 * @author 
 * @email 
 * @date 2021-04-14 09:46:11
 */
public interface JiezhangxinxiService extends IService<JiezhangxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiezhangxinxiVO> selectListVO(Wrapper<JiezhangxinxiEntity> wrapper);
   	
   	JiezhangxinxiVO selectVO(@Param("ew") Wrapper<JiezhangxinxiEntity> wrapper);
   	
   	List<JiezhangxinxiView> selectListView(Wrapper<JiezhangxinxiEntity> wrapper);
   	
   	JiezhangxinxiView selectView(@Param("ew") Wrapper<JiezhangxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiezhangxinxiEntity> wrapper);
   	
}

