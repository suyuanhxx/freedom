package com.findgods.freedom.dao;

import com.findgods.freedom.model.Permission;
import com.findgods.freedom.model.Permission;

public interface PermissionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permission
     *
     * @mbggenerated Tue Jun 07 17:24:13 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permission
     *
     * @mbggenerated Tue Jun 07 17:24:13 CST 2016
     */
    int insert(Permission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permission
     *
     * @mbggenerated Tue Jun 07 17:24:13 CST 2016
     */
    int insertSelective(Permission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permission
     *
     * @mbggenerated Tue Jun 07 17:24:13 CST 2016
     */
    Permission selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permission
     *
     * @mbggenerated Tue Jun 07 17:24:13 CST 2016
     */
    int updateByPrimaryKeySelective(Permission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permission
     *
     * @mbggenerated Tue Jun 07 17:24:13 CST 2016
     */
    int updateByPrimaryKey(Permission record);
}