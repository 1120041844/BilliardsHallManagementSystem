package com.dao;

import com.entity.QiuzhuoyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QiuzhuoyuyueVO;
import com.entity.view.QiuzhuoyuyueView;


/**
 * 球桌预约
 * 
 * @author 
 * @email 
 * @date 2021-04-14 09:46:11
 */
public interface QiuzhuoyuyueDao extends BaseMapper<QiuzhuoyuyueEntity> {
	
	List<QiuzhuoyuyueVO> selectListVO(@Param("ew") Wrapper<QiuzhuoyuyueEntity> wrapper);
	
	QiuzhuoyuyueVO selectVO(@Param("ew") Wrapper<QiuzhuoyuyueEntity> wrapper);
	
	List<QiuzhuoyuyueView> selectListView(@Param("ew") Wrapper<QiuzhuoyuyueEntity> wrapper);

	List<QiuzhuoyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<QiuzhuoyuyueEntity> wrapper);
	
	QiuzhuoyuyueView selectView(@Param("ew") Wrapper<QiuzhuoyuyueEntity> wrapper);
	
}
