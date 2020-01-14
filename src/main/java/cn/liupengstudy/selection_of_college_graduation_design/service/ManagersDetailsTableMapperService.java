package cn.liupengstudy.selection_of_college_graduation_design.service;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.ManagersDetailsTable;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @文件名 cn.liupengstudy.selection_of_college_graduation_design.service
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/1/14 - 10:45 下午
 * @修改人和其它信息
 */
public interface ManagersDetailsTableMapperService {

    int deleteByPrimaryKey(Integer id);

    int insert(ManagersDetailsTable record);

    int insertSelective(ManagersDetailsTable record);

    ManagersDetailsTable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ManagersDetailsTable record);

    int updateByPrimaryKey(ManagersDetailsTable record);

    List<ManagersDetailsTable> findByManagerID(String managerID);

}