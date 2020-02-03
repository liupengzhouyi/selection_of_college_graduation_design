package cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.linkDatabases.LinkMySQL.LinkTool;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.linkDatabases.LinkDatabase;

import java.sql.Connection;
import java.sql.SQLException;

public interface LinkMySQL extends LinkDatabase {

    Connection getConnection();

    void createConnection() throws ClassNotFoundException, SQLException;

    void createConnection(String url, String userName, String password) throws SQLException, ClassNotFoundException;

}


