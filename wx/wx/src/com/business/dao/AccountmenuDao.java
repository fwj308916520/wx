package com.business.dao;
import java.util.*;
import com.eplat.db.BindParamUtils;
import java.sql.*;
import javax.sql.*;
import com.business.domain.*;
import com.eplat.db.dao.AbstractBaseDao;
import com.eplat.db.dao.BaseDao;
/**
 * @类名称：AccountmenuDao
 * @类描述：微信菜单表
 * @创建人：代码生成器
 * @创建时间：2019年02月27日 14:42:28
 */
public class AccountmenuDao extends AbstractBaseDao implements BaseDao {
    /**
     *
     * insert
     *
     * @描述：新增数据
     * @param name
     * @param @return 设定文件
     * @return String DOM对象
     * @Exception 异常对象
     */
    public void insert(Object obj) throws Exception {
        PreparedStatement pstmt = null;
        try {
            AccountmenuBean bean = (AccountmenuBean) obj;
            String statement ="INSERT INTO WX_ACCOUNT_MENU "+
                    "(ID,MTYPE,EVENT_TYPE,NAME,INPUT_CODE,URL,SORT,PARENT_ID,MSG_TYPE,MSG_ID,GID,CREATE_TIME)"+
                    " VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            pstmt = this.getDBConnection().createPreparedStatement(statement);
            pstmt.setBigDecimal(1,bean.getId());
            pstmt.setString(2,bean.getMtype());
            pstmt.setString(3,bean.getEventtype());
            pstmt.setString(4,bean.getName());
            pstmt.setString(5,bean.getInputcode());
            pstmt.setString(6,bean.getUrl());
            pstmt.setBigDecimal(7,bean.getSort());
            pstmt.setBigDecimal(8,bean.getParentid());
            pstmt.setString(9,bean.getMsgtype());
            pstmt.setString(10,bean.getMsgid());
            pstmt.setBigDecimal(11,bean.getGid());
            pstmt.setTimestamp(12,bean.getCreatetime());
            pstmt.execute();
        } catch (SQLException e) {
            throw new Exception(e);
        } finally {
            this.getDBConnection().closePreparedStatement(pstmt);
        }
    }
    /**
     *
     * insertBatch
     *
     * @描述：批量新增数据
     * @param name
     * @param @return 设定文件
     * @return String DOM对象
     * @Exception 异常对象
     */

    public void insertBatch(List<AccountmenuBean> list) throws Exception {
        PreparedStatement pstmt = null;
        try {
            String statement ="INSERT INTO WX_ACCOUNT_MENU "+
                    "(ID,MTYPE,EVENT_TYPE,NAME,INPUT_CODE,URL,SORT,PARENT_ID,MSG_TYPE,MSG_ID,GID,CREATE_TIME)"+
                    " VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            pstmt = this.getDBConnection().createPreparedStatement(statement);
            if ((list != null) && (list.size() > 0)) {
                for (int i = 0; i < list.size(); i++) {
                    AccountmenuBean bean =list.get(i);
                    pstmt.setBigDecimal(1,bean.getId());
                    pstmt.setString(2,bean.getMtype());
                    pstmt.setString(3,bean.getEventtype());
                    pstmt.setString(4,bean.getName());
                    pstmt.setString(5,bean.getInputcode());
                    pstmt.setString(6,bean.getUrl());
                    pstmt.setBigDecimal(7,bean.getSort());
                    pstmt.setBigDecimal(8,bean.getParentid());
                    pstmt.setString(9,bean.getMsgtype());
                    pstmt.setString(10,bean.getMsgid());
                    pstmt.setBigDecimal(11,bean.getGid());
                    pstmt.setTimestamp(12,bean.getCreatetime());
                    pstmt.addBatch();
                }
                pstmt.executeBatch();
            }
        } catch (SQLException e) {
            throw new Exception(e);
        } finally {
            this.getDBConnection().closePreparedStatement(pstmt);
        }
    }
    /**
     *
     * update
     *
     * @描述：修改数据
     * @param name
     * @param @return 设定文件
     * @return String DOM对象
     * @Exception 异常对象
     */

    public void update(Object obj) throws Exception {
        PreparedStatement pstmt = null;
        try {
            AccountmenuBean bean = (AccountmenuBean) obj;
            String statement ="UPDATE WX_ACCOUNT_MENU SET "+
                    "ID=?,MTYPE=?,EVENT_TYPE=?,NAME=?,INPUT_CODE=?,URL=?,SORT=?,PARENT_ID=?,MSG_TYPE=?,MSG_ID=?,GID=?,CREATE_TIME=?"+
                    " WHERE ID=?";
            pstmt = this.getDBConnection().createPreparedStatement(statement);
            pstmt.setBigDecimal(1,bean.getId());
            pstmt.setString(2,bean.getMtype());
            pstmt.setString(3,bean.getEventtype());
            pstmt.setString(4,bean.getName());
            pstmt.setString(5,bean.getInputcode());
            pstmt.setString(6,bean.getUrl());
            pstmt.setBigDecimal(7,bean.getSort());
            pstmt.setBigDecimal(8,bean.getParentid());
            pstmt.setString(9,bean.getMsgtype());
            pstmt.setString(10,bean.getMsgid());
            pstmt.setBigDecimal(11,bean.getGid());
            pstmt.setTimestamp(12,bean.getCreatetime());
            pstmt.setBigDecimal(13,bean.getId());
            pstmt.execute();
        } catch (SQLException e) {
            throw new Exception(e);
        } finally {
            this.getDBConnection().closePreparedStatement(pstmt);
        }
    }
    /**
     *
     * updateBatch
     *
     * @描述：批量修改数据
     * @param name
     * @param @return 设定文件
     * @return String DOM对象
     * @Exception 异常对象
     */

    public void updateBatch(List<AccountmenuBean> list) throws Exception {
        PreparedStatement pstmt = null;
        try {
            String statement ="UPDATE WX_ACCOUNT_MENU SET "+
                    "ID=?,MTYPE=?,EVENT_TYPE=?,NAME=?,INPUT_CODE=?,URL=?,SORT=?,PARENT_ID=?,MSG_TYPE=?,MSG_ID=?,GID=?,CREATE_TIME=?"+
                    " WHERE ID=?";
            pstmt = this.getDBConnection().createPreparedStatement(statement);
            if ((list != null) && (list.size() > 0)) {
                for (int i = 0; i < list.size(); i++) {
                    AccountmenuBean bean = list.get(i);
                    pstmt.setBigDecimal(1,bean.getId());
                    pstmt.setString(2,bean.getMtype());
                    pstmt.setString(3,bean.getEventtype());
                    pstmt.setString(4,bean.getName());
                    pstmt.setString(5,bean.getInputcode());
                    pstmt.setString(6,bean.getUrl());
                    pstmt.setBigDecimal(7,bean.getSort());
                    pstmt.setBigDecimal(8,bean.getParentid());
                    pstmt.setString(9,bean.getMsgtype());
                    pstmt.setString(10,bean.getMsgid());
                    pstmt.setBigDecimal(11,bean.getGid());
                    pstmt.setTimestamp(12,bean.getCreatetime());
                    pstmt.setBigDecimal(13,bean.getId());
                    pstmt.addBatch();
                }
                pstmt.executeBatch();
            }
        } catch (SQLException e) {
            throw new Exception(e);
        } finally {
            this.getDBConnection().closePreparedStatement(pstmt);
        }
    }
    /**
     *
     * delete
     *
     * @描述：删除数据
     * @param name
     * @param @return 设定文件
     * @return String DOM对象
     * @Exception 异常对象
     */

    public void delete(Object obj) throws Exception {
        PreparedStatement pstmt = null;
        try {
            AccountmenuBean bean = (AccountmenuBean) obj;
            String statement ="DELETE FROM WX_ACCOUNT_MENU "+
                    " WHERE ID=?";
            pstmt = this.getDBConnection().createPreparedStatement(statement);
            pstmt.setBigDecimal(1,bean.getId());
            pstmt.execute();
        } catch (SQLException e) {
            throw new Exception(e);
        } finally {
            this.getDBConnection().closePreparedStatement(pstmt);
        }
    }
    /**
     *
     * deleteBatch
     *
     * @描述：批量修改数据
     * @param name
     * @param @return 设定文件
     * @return String DOM对象
     * @Exception 异常对象
     */

    public void deleteBatch(List<AccountmenuBean> list) throws Exception {
        PreparedStatement pstmt = null;
        try {
            String statement ="DELETE FROM  WX_ACCOUNT_MENU "+
                    " WHERE ID=?";
            pstmt = this.getDBConnection().createPreparedStatement(statement);
            if ((list != null) && (list.size() > 0)) {
                for (int i = 0; i < list.size(); i++) {
                    AccountmenuBean bean = list.get(i);
                    pstmt.setBigDecimal(1,bean.getId());
                    pstmt.addBatch();
                }
                pstmt.executeBatch();
            }
        } catch (SQLException e) {
            throw new Exception(e);
        } finally {
            this.getDBConnection().closePreparedStatement(pstmt);
        }
    }
    public void delete() throws Exception {
        PreparedStatement pstmt = null;
        try {
            String statement ="DELETE FROM  WX_ACCOUNT_MENU ";
            pstmt = this.getDBConnection().createPreparedStatement(statement);

            pstmt.execute();

        } catch (SQLException e) {
            throw new Exception(e);
        } finally {
            this.getDBConnection().closePreparedStatement(pstmt);
        }
    }
    /**
     *
     * query
     *
     * @描述：查询数据
     * @param name
     * @param @return 设定文件
     * @return String DOM对象
     * @Exception 异常对象
     */

    public List<AccountmenuBean> query() throws Exception {
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        ArrayList<AccountmenuBean> list=new ArrayList<AccountmenuBean>();
        try {
            String statement ="SELECT * FROM WX_ACCOUNT_MENU";
            pstmt = this.getDBConnection().createPreparedStatement(statement);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                AccountmenuBean bean = new AccountmenuBean();
                bean.setId(rs.getBigDecimal("ID"));
                bean.setMtype(rs.getString("MTYPE"));
                bean.setEventtype(rs.getString("EVENT_TYPE"));
                bean.setName(rs.getString("NAME"));
                bean.setInputcode(rs.getString("INPUT_CODE"));
                bean.setUrl(rs.getString("URL"));
                bean.setSort(rs.getBigDecimal("SORT"));
                bean.setParentid(rs.getBigDecimal("PARENT_ID"));
                bean.setMsgtype(rs.getString("MSG_TYPE"));
                bean.setMsgid(rs.getString("MSG_ID"));
                bean.setGid(rs.getBigDecimal("GID"));
                bean.setCreatetime(rs.getTimestamp("CREATE_TIME"));
                list.add(bean);
            }
            return list;
        } catch (SQLException e) {
            throw new Exception(e);
        } finally {
            this.getDBConnection().closeResultSet(rs);
            this.getDBConnection().closePreparedStatement(pstmt);
        }
    }
    /**
     *
     * queryPK
     *
     * @描述：根据主键查询数据
     * @param name
     * @param @return 设定文件
     * @return String DOM对象
     * @Exception 异常对象
     */

    public Object queryPK(Object obj) throws Exception {
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            AccountmenuBean bean = (AccountmenuBean) obj;
            String statement ="SELECT * FROM WX_ACCOUNT_MENU "+
                    " WHERE ID=?";
            pstmt = this.getDBConnection().createPreparedStatement(statement);
            pstmt.setBigDecimal(1,bean.getId());
            rs = pstmt.executeQuery();
            if (rs.next()) {
                bean.setId(rs.getBigDecimal("ID"));
                bean.setMtype(rs.getString("MTYPE"));
                bean.setEventtype(rs.getString("EVENT_TYPE"));
                bean.setName(rs.getString("NAME"));
                bean.setInputcode(rs.getString("INPUT_CODE"));
                bean.setUrl(rs.getString("URL"));
                bean.setSort(rs.getBigDecimal("SORT"));
                bean.setParentid(rs.getBigDecimal("PARENT_ID"));
                bean.setMsgtype(rs.getString("MSG_TYPE"));
                bean.setMsgid(rs.getString("MSG_ID"));
                bean.setGid(rs.getBigDecimal("GID"));
                bean.setCreatetime(rs.getTimestamp("CREATE_TIME"));
            }
            return bean;
        } catch (SQLException e) {
            throw new Exception(e);
        } finally {
            this.getDBConnection().closeResultSet(rs);
            this.getDBConnection().closePreparedStatement(pstmt);
        }
    }
    /**
     *
     * queryByCause
     *
     * @描述：根据主键查询数据
     * @param name
     * @param @return 设定文件
     * @return String DOM对象
     * @Exception 异常对象
     */

    public List<AccountmenuBean> queryByCause(String sql,Object... sqlParams) throws Exception {
        ArrayList<AccountmenuBean> list=new ArrayList<AccountmenuBean>();
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            String statement ="SELECT * FROM WX_ACCOUNT_MENU WHERE 1=1 " +sql;
            pstmt = this.getDBConnection().createPreparedStatement(statement);
            for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
                BindParamUtils.bindPreparedObject(pstmt, i + 1, sqlParams[i]);
            }
            rs = pstmt.executeQuery();
            while (rs.next()) {
                AccountmenuBean bean = new AccountmenuBean();
                bean.setId(rs.getBigDecimal("ID"));
                bean.setMtype(rs.getString("MTYPE"));
                bean.setEventtype(rs.getString("EVENT_TYPE"));
                bean.setName(rs.getString("NAME"));
                bean.setInputcode(rs.getString("INPUT_CODE"));
                bean.setUrl(rs.getString("URL"));
                bean.setSort(rs.getBigDecimal("SORT"));
                bean.setParentid(rs.getBigDecimal("PARENT_ID"));
                bean.setMsgtype(rs.getString("MSG_TYPE"));
                bean.setMsgid(rs.getString("MSG_ID"));
                bean.setGid(rs.getBigDecimal("GID"));
                bean.setCreatetime(rs.getTimestamp("CREATE_TIME"));
                list.add(bean);
            }
            return list;
        } catch (SQLException e) {
            throw new Exception(e);
        } finally {
            this.getDBConnection().closeResultSet(rs);
            this.getDBConnection().closePreparedStatement(pstmt);
        }
    }
}
