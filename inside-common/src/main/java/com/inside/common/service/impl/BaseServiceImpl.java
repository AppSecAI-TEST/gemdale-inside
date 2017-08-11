package com.inside.common.service.impl;

import com.github.abel533.entity.Example;
import com.github.abel533.mapper.Mapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.inside.common.model.BasePojo;
import com.inside.common.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

/**
 * Created by Ethan on 2017/8/9.
 */
public abstract class BaseServiceImpl<T extends BasePojo>  implements BaseService<T> {


    @Autowired
    private Mapper<T> mapper;

    @Override
    public T queryById(Long id) {
        return this.mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<T> queryAll() {
        return this.mapper.select(null);
    }

    @Override
    public T queryOne(T t) {
        return this.mapper.selectOne(t);
    }

    @Override
    public List<T> queryListByWhere(T t) {
        return this.mapper.select(t);
    }

    @Override
    public PageInfo<T> queryPageListByWhere(Integer page, Integer rows, T t) {
        // 设置分页条件
        PageHelper.startPage(page, rows);
        List<T> list = this.queryListByWhere(t);
        return new PageInfo<T>(list);
    }

    @Override
    public Integer save(T t) {
        t.setCreated(new Date());
        t.setUpdated(t.getCreated());
        return this.mapper.insert(t);
    }

    @Override
    public Integer saveSelective(T t) {
        t.setCreated(new Date());
        t.setUpdated(t.getCreated());
        return this.mapper.insertSelective(t);
    }

    @Override
    public Integer update(T t) {
        return this.mapper.updateByPrimaryKey(t);
    }

    @Override
    public Integer updateSelective(T t) {
        t.setUpdated(new Date());
        return this.mapper.updateByPrimaryKeySelective(t);
    }

    @Override
    public Integer deleteById(Long id) {
        return this.mapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer deleteByIds(Class<T> clazz, String property, List<Object> values) {
        Example example = new Example(clazz);
        example.createCriteria().andIn(property, values);
        return this.mapper.deleteByExample(example);
    }

    @Override
    public Integer deleteByWhere(T t) {
        return this.mapper.delete(t);
    }
}
