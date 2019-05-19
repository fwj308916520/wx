package com.business.dao;
import java.util.*;
import com.eplat.db.BindParamUtils;
import java.sql.*;
import javax.sql.*;
import com.business.domain.*;
import com.eplat.db.dao.AbstractBaseDao;
import com.eplat.db.dao.BaseDao;
/**
 * @类名称：AccountfansDao
 * @类描述：关注粉丝
 * @创建人：代码生成器
 * @创建时间：2019年02月27日 14:30:12  55
 */
public class AccountfansDao extends AbstractBaseDao implements BaseDao {
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
            AccountfansBean bean = (AccountfansBean) obj;
            String statement ="INSERT INTO WX_ACCOUNT_FANS "+
                    "(FANS_ID,OPEN_ID,PHONE,CUST_NO,SUBSCRIBE_STATUS,NICK_NAME,GENDER,LANGUAGE,COUNTRY,PROVINCE,CITY,HEAD_IMG_URL,REMARK,CREATE_TIME)"+
                    " VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pstmt = this.getDBConnection().createPreparedStatement(statement);
            pstmt.setBigDecimal(1,bean.getFansid());
            pstmt.setString(2,bean.getOpenid());
            pstmt.setString(3,bean.getPhone());
            pstmt.setString(4,bean.getCustno());
            pstmt.setBigDecimal(5,bean.getSubscribestatus());
            pstmt.setString(6,bean.getNickname());
            pstmt.setBigDecimal(7,bean.getGender());
            pstmt.setString(8,bean.getLanguage());
            pstmt.setString(9,bean.getCountry());
            pstmt.setString(10,bean.getProvince());
            pstmt.setString(11,bean.getCity());
            pstmt.setString(12,bean.getHeadimgurl());
            pstmt.setString(13,bean.getRemark());
            pstmt.setTimestamp(14,bean.getCreatetime());
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

    public void insertBatch(List<AccountfansBean> list) throws Exception {
        PreparedStatement pstmt = null;
        try {
            String statement ="INSERT INTO WX_ACCOUNT_FANS "+
                    "(FANS_ID,OPEN_ID,PHONE,CUST_NO,SUBSCRIBE_STATUS,NICK_NAME,GENDER,LANGUAGE,COUNTRY,PROVINCE,CITY,HEAD_IMG_URL,REMARK,CREATE_TIME)"+
                    " VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pstmt = this.getDBConnection().createPreparedStatement(statement);
            if ((list != null) && (list.size() > 0)) {
                for (int i = 0; i < list.size(); i++) {
                    AccountfansBean bean =list.get(i);
                    pstmt.setBigDecimal(1,bean.getFansid());
                    pstmt.setString(2,bean.getOpenid());
                    pstmt.setString(3,bean.getPhone());
                    pstmt.setString(4,bean.getCustno());
                    pstmt.setBigDecimal(5,bean.getSubscribestatus());
                    pstmt.setString(6,bean.getNickname());
                    pstmt.setBigDecimal(7,bean.getGender());
                    pstmt.setString(8,bean.getLanguage());
                    pstmt.setString(9,bean.getCountry());
                    pstmt.setString(10,bean.getProvince());
                    pstmt.setString(11,bean.getCity());
                    pstmt.setString(12,bean.getHeadimgurl());
                    pstmt.setString(13,bean.getRemark());
                    pstmt.setTimestamp(14,bean.getCreatetime());
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
            AccountfansBean bean = (AccountfansBean) obj;
            String statement ="UPDATE WX_ACCOUNT_FANS SET "+
                    "FANS_ID=?,OPEN_ID=?,PHONE=?,CUST_NO=?,SUBSCRIBE_STATUS=?,NICK_NAME=?,GENDER=?,LANGUAGE=?,COUNTRY=?,PROVINCE=?,CITY=?,HEAD_IMG_URL=?,REMARK=?,CREATE_TIME=?"+
                    " WHERE FANS_ID=?";
            pstmt = this.getDBConnection().createPreparedStatement(statement);
            pstmt.setBigDecimal(1,bean.getFansid());
            pstmt.setString(2,bean.getOpenid());
            pstmt.setString(3,bean.getPhone());
            pstmt.setString(4,bean.getCustno());
            pstmt.setBigDecimal(5,bean.getSubscribestatus());
            pstmt.setString(6,bean.getNickname());
            pstmt.setBigDecimal(7,bean.getGender());
            pstmt.setString(8,bean.getLanguage());
            pstmt.setString(9,bean.getCountry());
            pstmt.setString(10,bean.getProvince());
            pstmt.setString(11,bean.getCity());
            pstmt.setString(12,bean.getHeadimgurl());
            pstmt.setString(13,bean.getRemark());
            pstmt.setTimestamp(14,bean.getCreatetime());
            pstmt.setBigDecimal(15,bean.getFansid());
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

    public void updateBatch(List<AccountfansBean> list) throws Exception {
        PreparedStatement pstmt = null;
        try {
            String statement ="UPDATE WX_ACCOUNT_FANS SET "+
                    "FANS_ID=?,OPEN_ID=?,PHONE=?,CUST_NO=?,SUBSCRIBE_STATUS=?,NICK_NAME=?,GENDER=?,LANGUAGE=?,COUNTRY=?,PROVINCE=?,CITY=?,HEAD_IMG_URL=?,REMARK=?,CREATE_TIME=?"+
                    " WHERE FANS_ID=?";
            pstmt = this.getDBConnection().createPreparedStatement(statement);
            if ((list != null) && (list.size() > 0)) {
                for (int i = 0; i < list.size(); i++) {
                    AccountfansBean bean = list.get(i);
                    pstmt.setBigDecimal(1,bean.getFansid());
                    pstmt.setString(2,bean.getOpenid());
                    pstmt.setString(3,bean.getPhone());
                    pstmt.setString(4,bean.getCustno());
                    pstmt.setBigDecimal(5,bean.getSubscribestatus());
                    pstmt.setString(6,bean.getNickname());
                    pstmt.setBigDecimal(7,bean.getGender());
                    pstmt.setString(8,bean.getLanguage());
                    pstmt.setString(9,bean.getCountry());
                    pstmt.setString(10,bean.getProvince());
                    pstmt.setString(11,bean.getCity());
                    pstmt.setString(12,bean.getHeadimgurl());
                    pstmt.setString(13,bean.getRemark());
                    pstmt.setTimestamp(14,bean.getCreatetime());
                    pstmt.setBigDecimal(15,bean.getFansid());
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
            AccountfansBean bean = (AccountfansBean) obj;
            String statement ="DELETE FROM WX_ACCOUNT_FANS "+
                    " WHERE FANS_ID=?";
            pstmt = this.getDBConnection().createPreparedStatement(statement);
            pstmt.setBigDecimal(1,bean.getFansid());
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

    public void deleteBatch(List<AccountfansBean> list) throws Exception {
        PreparedStatement pstmt = null;
        try {
            String statement ="DELETE FROM  WX_ACCOUNT_FANS "+
                    " WHERE FANS_ID=?";
            pstmt = this.getDBConnection().createPreparedStatement(statement);
            if ((list != null) && (list.size() > 0)) {
                for (int i = 0; i < list.size(); i++) {
                    AccountfansBean bean = list.get(i);
                    pstmt.setBigDecimal(1,bean.getFansid());
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
     * query
     *
     * @描述：查询数据
     * @param name
     * @param @return 设定文件
     * @return String DOM对象
     * @Exception 异常对象
     */

    public List<AccountfansBean> query() throws Exception {
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        ArrayList<AccountfansBean> list=new ArrayList<AccountfansBean>();
        try {
            String statement ="SELECT * FROM WX_ACCOUNT_FANS";
            pstmt = this.getDBConnection().createPreparedStatement(statement);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                AccountfansBean bean = new AccountfansBean();
                bean.setFansid(rs.getBigDecimal("FANS_ID"));
                bean.setOpenid(rs.getString("OPEN_ID"));
                bean.setPhone(rs.getString("PHONE"));
                bean.setCustno(rs.getString("CUST_NO"));
                bean.setSubscribestatus(rs.getBigDecimal("SUBSCRIBE_STATUS"));
                bean.setNickname(rs.getString("NICK_NAME"));
                bean.setGender(rs.getBigDecimal("GENDER"));
                bean.setLanguage(rs.getString("LANGUAGE"));
                bean.setCountry(rs.getString("COUNTRY"));
                bean.setProvince(rs.getString("PROVINCE"));
                bean.setCity(rs.getString("CITY"));
                bean.setHeadimgurl(rs.getString("HEAD_IMG_URL"));
                bean.setRemark(rs.getString("REMARK"));
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
            AccountfansBean bean = (AccountfansBean) obj;
            String statement ="SELECT * FROM WX_ACCOUNT_FANS "+
                    " WHERE FANS_ID=?";
            pstmt = this.getDBConnection().createPreparedStatement(statement);
            pstmt.setBigDecimal(1,bean.getFansid());
            rs = pstmt.executeQuery();
            if (rs.next()) {
                bean.setFansid(rs.getBigDecimal("FANS_ID"));
                bean.setOpenid(rs.getString("OPEN_ID"));
                bean.setPhone(rs.getString("PHONE"));
                bean.setCustno(rs.getString("CUST_NO"));
                bean.setSubscribestatus(rs.getBigDecimal("SUBSCRIBE_STATUS"));
                bean.setNickname(rs.getString("NICK_NAME"));
                bean.setGender(rs.getBigDecimal("GENDER"));
                bean.setLanguage(rs.getString("LANGUAGE"));
                bean.setCountry(rs.getString("COUNTRY"));
                bean.setProvince(rs.getString("PROVINCE"));
                bean.setCity(rs.getString("CITY"));
                bean.setHeadimgurl(rs.getString("HEAD_IMG_URL"));
                bean.setRemark(rs.getString("REMARK"));
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

    public Object queryByOpenId(Object obj) throws Exception {
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            AccountfansBean bean = (AccountfansBean) obj;
            String statement ="SELECT * FROM WX_ACCOUNT_FANS WHERE OPEN_ID=?";
            pstmt = this.getDBConnection().createPreparedStatement(statement);
            pstmt.setString(1,bean.getOpenid());
            rs = pstmt.executeQuery();
            if (rs.next()) {
                bean.setFansid(rs.getBigDecimal("FANS_ID"));
                bean.setOpenid(rs.getString("OPEN_ID"));
                bean.setPhone(rs.getString("PHONE"));
                bean.setCustno(rs.getString("CUST_NO"));
                bean.setSubscribestatus(rs.getBigDecimal("SUBSCRIBE_STATUS"));
                bean.setNickname(rs.getString("NICK_NAME"));
                bean.setGender(rs.getBigDecimal("GENDER"));
                bean.setLanguage(rs.getString("LANGUAGE"));
                bean.setCountry(rs.getString("COUNTRY"));
                bean.setProvince(rs.getString("PROVINCE"));
                bean.setCity(rs.getString("CITY"));
                bean.setHeadimgurl(rs.getString("HEAD_IMG_URL"));
                bean.setRemark(rs.getString("REMARK"));
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

    public List<AccountfansBean> queryByCause(String sql,Object... sqlParams) throws Exception {
        ArrayList<AccountfansBean> list=new ArrayList<AccountfansBean>();
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            String statement ="SELECT * FROM WX_ACCOUNT_FANS WHERE 1=1 " +sql;
            pstmt = this.getDBConnection().createPreparedStatement(statement);
            for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
                BindParamUtils.bindPreparedObject(pstmt, i + 1, sqlParams[i]);
            }
            rs = pstmt.executeQuery();
            while (rs.next()) {
                AccountfansBean bean = new AccountfansBean();
                bean.setFansid(rs.getBigDecimal("FANS_ID"));
                bean.setOpenid(rs.getString("OPEN_ID"));
                bean.setPhone(rs.getString("PHONE"));
                bean.setCustno(rs.getString("CUST_NO"));
                bean.setSubscribestatus(rs.getBigDecimal("SUBSCRIBE_STATUS"));
                bean.setNickname(rs.getString("NICK_NAME"));
                bean.setGender(rs.getBigDecimal("GENDER"));
                bean.setLanguage(rs.getString("LANGUAGE"));
                bean.setCountry(rs.getString("COUNTRY"));
                bean.setProvince(rs.getString("PROVINCE"));
                bean.setCity(rs.getString("CITY"));
                bean.setHeadimgurl(rs.getString("HEAD_IMG_URL"));
                bean.setRemark(rs.getString("REMARK"));
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
