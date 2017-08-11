package com.inside.common.service;

import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * Created by Ethan on 2017/8/9.
 */
public interface BaseService<T> {

    /**
     * 根据id查询数据
     *
     * @param id
     * @return
     */
    public T queryById(Long id) ;

    /**
     * 查询所有数据
     *
     * @return
     */
    public List<T> queryAll();

    /**
     * 根据条件查询一条数据，如果有多条数据会抛出异常
     *
     * @param t
     * @return
     */
    public T queryOne(T t);

    /**
     * 根据条件查询数据列表
     *
     * @param t
     * @return
     */
    public List<T> queryListByWhere(T t);

    /**
     * 分页查询
     *
     * @param page
     * @param rows
     * @param t
     * @return
     */
    public PageInfo<T> queryPageListByWhere(Integer page, Integer rows, T t);

    /**
     * 新增数据，返回成功的条数
     *
     * @param t
     * @return
     */
    public Integer save(T t);

    /**
     * 新增数据，使用不为null的字段，返回成功的条数
     *
     * @param t
     * @return
     */
    public Integer saveSelective(T t);

    /**
     * 修改数据，返回成功的条数
     *
     * @param t
     * @return
     */
    public Integer update(T t);

    /**
     * 修改数据，使用不为null的字段，返回成功的条数
     *
     * @param t
     * @return
     */
    public Integer updateSelective(T t);

    /**
     * 根据id删除数据
     *
     * @param id
     * @return
     */
    public Integer deleteById(Long id);

    /**
     * 批量删除
     * @param clazz
     * @param property
     * @param values
     * @return
     */
    public Integer deleteByIds(Class<T> clazz, String property, List<Object> values);

    /**
     * 根据条件做删除
     *
     * @param t
     * @return
     */
    public Integer deleteByWhere(T t);
}
