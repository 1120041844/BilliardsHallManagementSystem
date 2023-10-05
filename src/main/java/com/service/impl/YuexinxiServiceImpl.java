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


import com.dao.YuexinxiDao;
import com.entity.YuexinxiEntity;
import com.service.YuexinxiService;
import com.entity.vo.YuexinxiVO;
import com.entity.view.YuexinxiView;

@Service("yuexinxiService")
public class YuexinxiServiceImpl extends ServiceImpl<YuexinxiDao, YuexinxiEntity> implements YuexinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuexinxiEntity> page = this.selectPage(
                new Query<YuexinxiEntity>(params).getPage(),
                new EntityWrapper<YuexinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuexinxiEntity> wrapper) {
		  Page<YuexinxiView> page =new Query<YuexinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuexinxiVO> selectListVO(Wrapper<YuexinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuexinxiVO selectVO(Wrapper<YuexinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuexinxiView> selectListView(Wrapper<YuexinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuexinxiView selectView(Wrapper<YuexinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
