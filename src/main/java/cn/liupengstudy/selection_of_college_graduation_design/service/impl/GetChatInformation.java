package cn.liupengstudy.selection_of_college_graduation_design.service.impl;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.CharInformationVersionII;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.TeacherAllApplicatioonPaperInformation;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.linkDatabases.LinkMySQL.SelectData;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @文件名 cn.liupengstudy.selection_of_college_graduation_design.service.impl
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/2/19 - 12:03 上午
 * @修改人和其它信息
 */
public class GetChatInformation {

    private int groupID;

    List<CharInformationVersionII> listS;

    List<CharInformationVersionII> listT;

    List<CharInformationVersionII> list;

    private SelectData selectData;

    public GetChatInformation(int groupID) throws SQLException {
        this.groupID = groupID;
        this.initS();
        this.createListS();
        this.initT();
        this.createListT();
        this.AddList();
    }

    public void initS() {
        try {
            this.selectData = new SelectData("select chatInformationTable.id, chatInformationTable.IDtype, chatInformationTable.bodyID, studentsDetailsTable.name, chatInformationTable.date, chatInformationTable.time, chatInformationTable.chat from chatInformationTable join studentsDetailsTable on chatInformationTable.bodyID = studentsDetailsTable.studentID and chatInformationTable.groupID = " + this.groupID + " and chatInformationTable.IDtype = 1;");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void createListS() throws SQLException {
        this.listS = new ArrayList<CharInformationVersionII>();
        while (this.selectData.getResultSet().next()) {
            CharInformationVersionII charInformationVersionII = new CharInformationVersionII();
            charInformationVersionII.setId(this.selectData.getResultSet().getInt("id"));
            charInformationVersionII.setIDtype(this.selectData.getResultSet().getInt("IDtype"));
            charInformationVersionII.setBodyID(this.selectData.getResultSet().getString("bodyID"));
            charInformationVersionII.setName(this.selectData.getResultSet().getString("name"));
            charInformationVersionII.setData(this.selectData.getResultSet().getString("date"));
            charInformationVersionII.setTimee(this.selectData.getResultSet().getString("time"));
            charInformationVersionII.setChat(this.selectData.getResultSet().getString("chat"));
            listS.add(charInformationVersionII);
        }
    }

    public void initT() {
        try {
            this.selectData = new SelectData("select chatInformationTable.id, chatInformationTable.IDtype, chatInformationTable.bodyID, teachersDetailsTable.name, chatInformationTable.date, chatInformationTable.time, chatInformationTable.chat from chatInformationTable join teachersDetailsTable on chatInformationTable.bodyID = teachersDetailsTable.teacherID and chatInformationTable.groupID = " + this.groupID + " and chatInformationTable.IDtype = 2;");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void createListT() throws SQLException {
        this.listT = new ArrayList<CharInformationVersionII>();
        while (this.selectData.getResultSet().next()) {
            CharInformationVersionII charInformationVersionII = new CharInformationVersionII();
            charInformationVersionII.setId(this.selectData.getResultSet().getInt("id"));
            charInformationVersionII.setIDtype(this.selectData.getResultSet().getInt("IDtype"));
            charInformationVersionII.setBodyID(this.selectData.getResultSet().getString("bodyID"));
            charInformationVersionII.setName(this.selectData.getResultSet().getString("name"));
            charInformationVersionII.setData(this.selectData.getResultSet().getString("date"));
            charInformationVersionII.setTimee(this.selectData.getResultSet().getString("time"));
            charInformationVersionII.setChat(this.selectData.getResultSet().getString("chat"));
            listT.add(charInformationVersionII);
        }
    }

    public void AddList() {
        list = new ArrayList<CharInformationVersionII>();
        int indexS = 0;
        int indexT = 0;
        boolean key = true;
        int p = 0;
        if (listS.size() > 0 && listT.size() > 0) {
            p = 0;
        }
        if (listS.size() > 0 && listT.size() == 0) {
            p = 1;
        }
        if (listS.size() == 0 && listT.size() > 0) {
            p = 2;
        }
        if (listS.size() == 0 && listT.size() == 0) {
            return;
        }
        while(key) {
            if (p == 1) {
                CharInformationVersionII charInformationVersionIIS = listS.get(indexS);
                list.add(charInformationVersionIIS);
                indexS = indexS + 1;
                if (indexS == listS.size()) {
                    key = false;
                }
            }
            if (p == 2) {
                CharInformationVersionII charInformationVersionIIT = listT.get(indexT);
                list.add(charInformationVersionIIT);
                indexT = indexT + 1;
                if (indexT == listT.size()) {
                    key = false;
                }
            }
            if (p == 0) {
                CharInformationVersionII charInformationVersionIIS = listS.get(indexS);
                CharInformationVersionII charInformationVersionIIT = listT.get(indexT);
                if (charInformationVersionIIS.getId() > charInformationVersionIIT.getId()) {
                    list.add(charInformationVersionIIT);
                    indexT = indexT + 1;
                    if (indexT == listT.size()) {
                        p = 1;
                    }
                } else {
                    list.add(charInformationVersionIIS);
                    indexS = indexS + 1;
                    if (indexS == listS.size()) {
                        p = 2;
                    }
                }
            }
        }
    }

    public List<CharInformationVersionII> getList() {
        return list;
    }

    public static void main(String[] args) throws SQLException {
        GetChatInformation getChatInformation = new GetChatInformation(1);

        for (int i=0;i<getChatInformation.getList().size();i++) {
            System.out.println(getChatInformation.list.get(i).toString());
        }
    }


}
