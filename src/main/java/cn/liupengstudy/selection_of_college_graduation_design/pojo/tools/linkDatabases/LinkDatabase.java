package cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.linkDatabases;

import java.sql.Connection;
import java.sql.SQLException;

public interface LinkDatabase {

    Connection getConnection();

}
