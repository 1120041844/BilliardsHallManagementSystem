package com.dao;

import com.entity.JiezhangxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiezhangxinxiVO;
import com.entity.view.JiezhangxinxiView;


/**
 * 结账信息
 * 
 * @author 
 * @email 
 * @date 2021-04-14 09:46:11
 */
public interface JiezhangxinxiDao extends BaseMapper<JiezhangxinxiEntity> {
	
	List<JiezhangxinxiVO> selectListVO(@Param("ew") Wrapper<JiezhangxinxiEntity> wrapper);
	
	JiezhangxinxiVO selectVO(@Param("ew") Wrapper<JiezhangxinxiEntity> wrapper);
	
	List<JiezhangxinxiView> selectListView(@Param("ew") Wrapper<JiezhangxinxiEntity> wrapper);

	List<JiezhangxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<JiezhangxinxiEntity> wrapper);
	
	JiezhangxinxiView selectView(@Param("ew") Wrapper<JiezhangxinxiEntity> wrapper);
	
}
