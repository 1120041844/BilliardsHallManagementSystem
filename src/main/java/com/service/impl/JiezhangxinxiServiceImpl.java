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


import com.dao.JiezhangxinxiDao;
import com.entity.JiezhangxinxiEntity;
import com.service.JiezhangxinxiService;
import com.entity.vo.JiezhangxinxiVO;
import com.entity.view.JiezhangxinxiView;

@Service("jiezhangxinxiService")
public class JiezhangxinxiServiceImpl extends ServiceImpl<JiezhangxinxiDao, JiezhangxinxiEntity> implements JiezhangxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiezhangxinxiEntity> page = this.selectPage(
                new Query<JiezhangxinxiEntity>(params).getPage(),
                new EntityWrapper<JiezhangxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiezhangxinxiEntity> wrapper) {
		  Page<JiezhangxinxiView> page =new Query<JiezhangxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiezhangxinxiVO> selectListVO(Wrapper<JiezhangxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiezhangxinxiVO selectVO(Wrapper<JiezhangxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiezhangxinxiView> selectListView(Wrapper<JiezhangxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiezhangxinxiView selectView(Wrapper<JiezhangxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
