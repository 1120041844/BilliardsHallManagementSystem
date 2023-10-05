package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TaiqiuzhuoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TaiqiuzhuoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TaiqiuzhuoView;


/**
 * 台球桌
 *
 * @author 
 * @email 
 * @date 2021-04-14 09:46:11
 */
public interface TaiqiuzhuoService extends IService<TaiqiuzhuoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TaiqiuzhuoVO> selectListVO(Wrapper<TaiqiuzhuoEntity> wrapper);
   	
   	TaiqiuzhuoVO selectVO(@Param("ew") Wrapper<TaiqiuzhuoEntity> wrapper);
   	
   	List<TaiqiuzhuoView> selectListView(Wrapper<TaiqiuzhuoEntity> wrapper);
   	
   	TaiqiuzhuoView selectView(@Param("ew") Wrapper<TaiqiuzhuoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TaiqiuzhuoEntity> wrapper);
   	
}

