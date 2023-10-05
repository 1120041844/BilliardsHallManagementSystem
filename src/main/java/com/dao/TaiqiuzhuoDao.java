package com.dao;

import com.entity.TaiqiuzhuoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TaiqiuzhuoVO;
import com.entity.view.TaiqiuzhuoView;


/**
 * 台球桌
 * 
 * @author 
 * @email 
 * @date 2021-04-14 09:46:11
 */
public interface TaiqiuzhuoDao extends BaseMapper<TaiqiuzhuoEntity> {
	
	List<TaiqiuzhuoVO> selectListVO(@Param("ew") Wrapper<TaiqiuzhuoEntity> wrapper);
	
	TaiqiuzhuoVO selectVO(@Param("ew") Wrapper<TaiqiuzhuoEntity> wrapper);
	
	List<TaiqiuzhuoView> selectListView(@Param("ew") Wrapper<TaiqiuzhuoEntity> wrapper);

	List<TaiqiuzhuoView> selectListView(Pagination page,@Param("ew") Wrapper<TaiqiuzhuoEntity> wrapper);
	
	TaiqiuzhuoView selectView(@Param("ew") Wrapper<TaiqiuzhuoEntity> wrapper);
	
}
