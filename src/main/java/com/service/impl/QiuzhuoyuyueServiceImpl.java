package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.QiuzhuoyuyueDao;
import com.entity.QiuzhuoyuyueEntity;
import com.service.QiuzhuoyuyueService;
import com.entity.vo.QiuzhuoyuyueVO;
import com.entity.view.QiuzhuoyuyueView;

@Service("qiuzhuoyuyueService")
public class QiuzhuoyuyueServiceImpl extends ServiceImpl<QiuzhuoyuyueDao, QiuzhuoyuyueEntity> implements QiuzhuoyuyueService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QiuzhuoyuyueEntity> page = this.selectPage(
                new Query<QiuzhuoyuyueEntity>(params).getPage(),
                new EntityWrapper<QiuzhuoyuyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QiuzhuoyuyueEntity> wrapper) {
		  Page<QiuzhuoyuyueView> page =new Query<QiuzhuoyuyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QiuzhuoyuyueVO> selectListVO(Wrapper<QiuzhuoyuyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QiuzhuoyuyueVO selectVO(Wrapper<QiuzhuoyuyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QiuzhuoyuyueView> selectListView(Wrapper<QiuzhuoyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QiuzhuoyuyueView selectView(Wrapper<QiuzhuoyuyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
