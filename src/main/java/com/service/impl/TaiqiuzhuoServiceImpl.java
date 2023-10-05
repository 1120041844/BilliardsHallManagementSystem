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


import com.dao.TaiqiuzhuoDao;
import com.entity.TaiqiuzhuoEntity;
import com.service.TaiqiuzhuoService;
import com.entity.vo.TaiqiuzhuoVO;
import com.entity.view.TaiqiuzhuoView;

@Service("taiqiuzhuoService")
public class TaiqiuzhuoServiceImpl extends ServiceImpl<TaiqiuzhuoDao, TaiqiuzhuoEntity> implements TaiqiuzhuoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TaiqiuzhuoEntity> page = this.selectPage(
                new Query<TaiqiuzhuoEntity>(params).getPage(),
                new EntityWrapper<TaiqiuzhuoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TaiqiuzhuoEntity> wrapper) {
		  Page<TaiqiuzhuoView> page =new Query<TaiqiuzhuoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TaiqiuzhuoVO> selectListVO(Wrapper<TaiqiuzhuoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TaiqiuzhuoVO selectVO(Wrapper<TaiqiuzhuoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TaiqiuzhuoView> selectListView(Wrapper<TaiqiuzhuoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TaiqiuzhuoView selectView(Wrapper<TaiqiuzhuoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
