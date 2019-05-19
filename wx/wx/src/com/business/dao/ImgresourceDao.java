package com.business.dao;
import java.util.*;
import com.eplat.db.BindParamUtils;

import java.math.BigDecimal;
import java.sql.*;
import javax.sql.*;
import com.business.domain.*;
import com.eplat.db.dao.AbstractBaseDao;
import com.eplat.db.dao.BaseDao;
/**
 * @类名称：ImgresourceDao
 * @类描述：微信图片表
 * @创建人：代码生成器
 * @创建时间：2019年03月08日 23:08:06
 */
public class ImgresourceDao extends AbstractBaseDao implements BaseDao {
    /**
     *
     * insert
     *
     * @描述：新增数据
     * @param 
     * @param @return 设定文件
     * @return String DOM对象
     * @Exception 异常对象
     */
    public void insert(Object obj) throws Exception {
        PreparedStatement pstmt = null;
        try {
            ImgresourceBean bean = (ImgresourceBean) obj;
            String statement ="INSERT INTO WX_IMG_RESOURCE "+
                    "(IMG_ID,MEDIA_ID,ORIGINAL_NAME,IMG_TYPE,IMG_NAME,IMG_URL,IMG_HTTP_URL,IMG_SIZE,CREATE_DATE,UPDATE_DATE,IMG_FLAG,WX_ACCOUNT,BASE_ID)"+
                    " VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pstmt = this.getDBConnection().createPreparedStatement(statement);
            pstmt.setBigDecimal(1,bean.getImgid());
            pstmt.setString(2,bean.getMediaid());
            pstmt.setString(3,bean.getOriginalname());
            pstmt.setString(4,bean.getImgtype());
            pstmt.setString(5,bean.getImgname());
            pstmt.setString(6,bean.getImgurl());
            pstmt.setString(7,bean.getImghttpurl());
            pstmt.setBigDecimal(8,bean.getImgsize());
            pstmt.setTimestamp(9,bean.getCreatedate());
            pstmt.setTimestamp(10,bean.getUpdatedate());
            pstmt.setString(11,bean.getImgflag());
            pstmt.setString(12,bean.getWxaccount());
            pstmt.setBigDecimal(13,bean.getBaseid());
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
     * @param 
     * @param @return 设定文件
     * @return String DOM对象
     * @Exception 异常对象
     */

    public void insertBatch(List<ImgresourceBean> list) throws Exception {
        PreparedStatement pstmt = null;
        try {
            String statement ="INSERT INTO WX_IMG_RESOURCE "+
                    "(IMG_ID,MEDIA_ID,ORIGINAL_NAME,IMG_TYPE,IMG_NAME,IMG_URL,IMG_HTTP_URL,IMG_SIZE,CREATE_DATE,UPDATE_DATE,IMG_FLAG,WX_ACCOUNT,BASE_ID)"+
                    " VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pstmt = this.getDBConnection().createPreparedStatement(statement);
            if ((list != null) && (list.size() > 0)) {
                for (int i = 0; i < list.size(); i++) {
                    ImgresourceBean bean =list.get(i);
                    pstmt.setBigDecimal(1,bean.getImgid());
                    pstmt.setString(2,bean.getMediaid());
                    pstmt.setString(3,bean.getOriginalname());
                    pstmt.setString(4,bean.getImgtype());
                    pstmt.setString(5,bean.getImgname());
                    pstmt.setString(6,bean.getImgurl());
                    pstmt.setString(7,bean.getImghttpurl());
                    pstmt.setBigDecimal(8,bean.getImgsize());
                    pstmt.setTimestamp(9,bean.getCreatedate());
                    pstmt.setTimestamp(10,bean.getUpdatedate());
                    pstmt.setString(11,bean.getImgflag());
                    pstmt.setString(12,bean.getWxaccount());
                    pstmt.setBigDecimal(13,bean.getBaseid());
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
     * @param 
     * @param @return 设定文件
     * @return String DOM对象
     * @Exception 异常对象
     */

    public void update(Object obj) throws Exception {
        PreparedStatement pstmt = null;
        try {
            ImgresourceBean bean = (ImgresourceBean) obj;
            String statement ="UPDATE WX_IMG_RESOURCE SET "+
                    "IMG_ID=?,MEDIA_ID=?,ORIGINAL_NAME=?,IMG_TYPE=?,IMG_NAME=?,IMG_URL=?,IMG_HTTP_URL=?,IMG_SIZE=?,CREATE_DATE=?,UPDATE_DATE=?,IMG_FLAG=?,WX_ACCOUNT=?,BASE_ID=?"+
                    " WHERE IMG_ID=?";
            pstmt = this.getDBConnection().createPreparedStatement(statement);
            pstmt.setBigDecimal(1,bean.getImgid());
            pstmt.setString(2,bean.getMediaid());
            pstmt.setString(3,bean.getOriginalname());
            pstmt.setString(4,bean.getImgtype());
            pstmt.setString(5,bean.getImgname());
            pstmt.setString(6,bean.getImgurl());
            pstmt.setString(7,bean.getImghttpurl());
            pstmt.setBigDecimal(8,bean.getImgsize());
            pstmt.setTimestamp(9,bean.getCreatedate());
            pstmt.setTimestamp(10,bean.getUpdatedate());
            pstmt.setString(11,bean.getImgflag());
            pstmt.setString(12,bean.getWxaccount());
            pstmt.setBigDecimal(13,bean.getBaseid());
            pstmt.setBigDecimal(14,bean.getImgid());
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
     * @param 
     * @param @return 设定文件
     * @return String DOM对象
     * @Exception 异常对象
     */

    public void updateBatch(List<ImgresourceBean> list) throws Exception {
        PreparedStatement pstmt = null;
        try {
            String statement ="UPDATE WX_IMG_RESOURCE SET "+
                    "IMG_ID=?,MEDIA_ID=?,ORIGINAL_NAME=?,IMG_TYPE=?,IMG_NAME=?,IMG_URL=?,IMG_HTTP_URL=?,IMG_SIZE=?,CREATE_DATE=?,UPDATE_DATE=?,IMG_FLAG=?,WX_ACCOUNT=?,BASE_ID=?"+
                    " WHERE IMG_ID=?";
            pstmt = this.getDBConnection().createPreparedStatement(statement);
            if ((list != null) && (list.size() > 0)) {
                for (int i = 0; i < list.size(); i++) {
                    ImgresourceBean bean = list.get(i);
                    pstmt.setBigDecimal(1,bean.getImgid());
                    pstmt.setString(2,bean.getMediaid());
                    pstmt.setString(3,bean.getOriginalname());
                    pstmt.setString(4,bean.getImgtype());
                    pstmt.setString(5,bean.getImgname());
                    pstmt.setString(6,bean.getImgurl());
                    pstmt.setString(7,bean.getImghttpurl());
                    pstmt.setBigDecimal(8,bean.getImgsize());
                    pstmt.setTimestamp(9,bean.getCreatedate());
                    pstmt.setTimestamp(10,bean.getUpdatedate());
                    pstmt.setString(11,bean.getImgflag());
                    pstmt.setString(12,bean.getWxaccount());
                    pstmt.setBigDecimal(13,bean.getBaseid());
                    pstmt.setBigDecimal(14,bean.getImgid());
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
     * @param 
     * @param @return 设定文件
     * @return String DOM对象
     * @Exception 异常对象
     */

    public void delete(Object obj) throws Exception {
        PreparedStatement pstmt = null;
        try {
            ImgresourceBean bean = (ImgresourceBean) obj;
            String statement ="DELETE FROM WX_IMG_RESOURCE "+
                    " WHERE IMG_ID=?";
            pstmt = this.getDBConnection().createPreparedStatement(statement);
            pstmt.setBigDecimal(1,bean.getImgid());
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
     * @param 
     * @param @return 设定文件
     * @return String DOM对象
     * @Exception 异常对象
     */

    public void deleteBatch(List<ImgresourceBean> list) throws Exception {
        PreparedStatement pstmt = null;
        try {
            String statement ="DELETE FROM  WX_IMG_RESOURCE "+
                    " WHERE IMG_ID=?";
            pstmt = this.getDBConnection().createPreparedStatement(statement);
            if ((list != null) && (list.size() > 0)) {
                for (int i = 0; i < list.size(); i++) {
                    ImgresourceBean bean = list.get(i);
                    pstmt.setBigDecimal(1,bean.getImgid());
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
     * @param 
     * @param @return 设定文件
     * @return String DOM对象
     * @Exception 异常对象
     */

    public List<ImgresourceBean> query() throws Exception {
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        ArrayList<ImgresourceBean> list=new ArrayList<ImgresourceBean>();
        try {
            String statement ="SELECT * FROM WX_IMG_RESOURCE";
            pstmt = this.getDBConnection().createPreparedStatement(statement);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                ImgresourceBean bean = new ImgresourceBean();
                bean.setImgid(rs.getBigDecimal("IMG_ID"));
                bean.setMediaid(rs.getString("MEDIA_ID"));
                bean.setOriginalname(rs.getString("ORIGINAL_NAME"));
                bean.setImgtype(rs.getString("IMG_TYPE"));
                bean.setImgname(rs.getString("IMG_NAME"));
                bean.setImgurl(rs.getString("IMG_URL"));
                bean.setImghttpurl(rs.getString("IMG_HTTP_URL"));
                bean.setImgsize(rs.getBigDecimal("IMG_SIZE"));
                bean.setCreatedate(rs.getTimestamp("CREATE_DATE"));
                bean.setUpdatedate(rs.getTimestamp("UPDATE_DATE"));
                bean.setImgflag(rs.getString("IMG_FLAG"));
                bean.setWxaccount(rs.getString("WX_ACCOUNT"));
                bean.setBaseid(rs.getBigDecimal("BASE_ID"));
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
     * @param 
     * @param @return 设定文件
     * @return String DOM对象
     * @Exception 异常对象
     */

    public Object queryPK(Object obj) throws Exception {
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            ImgresourceBean bean = (ImgresourceBean) obj;
            String statement ="SELECT * FROM WX_IMG_RESOURCE "+
                    " WHERE IMG_ID=?";
            pstmt = this.getDBConnection().createPreparedStatement(statement);
            pstmt.setBigDecimal(1,bean.getImgid());
            rs = pstmt.executeQuery();
            if (rs.next()) {
                bean.setImgid(rs.getBigDecimal("IMG_ID"));
                bean.setMediaid(rs.getString("MEDIA_ID"));
                bean.setOriginalname(rs.getString("ORIGINAL_NAME"));
                bean.setImgtype(rs.getString("IMG_TYPE"));
                bean.setImgname(rs.getString("IMG_NAME"));
                bean.setImgurl(rs.getString("IMG_URL"));
                bean.setImghttpurl(rs.getString("IMG_HTTP_URL"));
                bean.setImgsize(rs.getBigDecimal("IMG_SIZE"));
                bean.setCreatedate(rs.getTimestamp("CREATE_DATE"));
                bean.setUpdatedate(rs.getTimestamp("UPDATE_DATE"));
                bean.setImgflag(rs.getString("IMG_FLAG"));
                bean.setWxaccount(rs.getString("WX_ACCOUNT"));
                bean.setBaseid(rs.getBigDecimal("BASE_ID"));
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
     * @param 
     * @param @return 设定文件
     * @return String DOM对象
     * @Exception 异常对象
     */

    public List<ImgresourceBean> queryByCause(String sql,Object... sqlParams) throws Exception {
        ArrayList<ImgresourceBean> list=new ArrayList<ImgresourceBean>();
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            String statement ="SELECT * FROM WX_IMG_RESOURCE WHERE 1=1 " +sql;
            pstmt = this.getDBConnection().createPreparedStatement(statement);
            for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
                BindParamUtils.bindPreparedObject(pstmt, i + 1, sqlParams[i]);
            }
            rs = pstmt.executeQuery();
            while (rs.next()) {
                ImgresourceBean bean = new ImgresourceBean();
                bean.setImgid(rs.getBigDecimal("IMG_ID"));
                bean.setMediaid(rs.getString("MEDIA_ID"));
                bean.setOriginalname(rs.getString("ORIGINAL_NAME"));
                bean.setImgtype(rs.getString("IMG_TYPE"));
                bean.setImgname(rs.getString("IMG_NAME"));
                bean.setImgurl(rs.getString("IMG_URL"));
                bean.setImghttpurl(rs.getString("IMG_HTTP_URL"));
                bean.setImgsize(rs.getBigDecimal("IMG_SIZE"));
                bean.setCreatedate(rs.getTimestamp("CREATE_DATE"));
                bean.setUpdatedate(rs.getTimestamp("UPDATE_DATE"));
                bean.setImgflag(rs.getString("IMG_FLAG"));
                bean.setWxaccount(rs.getString("WX_ACCOUNT"));
                bean.setBaseid(rs.getBigDecimal("BASE_ID"));
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

    public void updateBaseId(Object obj) throws Exception {
        PreparedStatement pstmt = null;
        try {
            ImgresourceBean bean = (ImgresourceBean) obj;
            String statement ="UPDATE WX_IMG_RESOURCE SET  BASE_ID=? WHERE IMG_ID=?";
            pstmt = this.getDBConnection().createPreparedStatement(statement);
            pstmt.setBigDecimal(1,bean.getBaseid());
            pstmt.setBigDecimal(2,bean.getImgid());
            pstmt.execute();
        } catch (SQLException e) {
            throw new Exception(e);
        } finally {
            this.getDBConnection().closePreparedStatement(pstmt);
        }
    }

    public void updateBatchBaseId(List<ImgresourceBean> list,BigDecimal baseId) throws Exception {
        PreparedStatement pstmt = null;
        try {
            String statement ="UPDATE WX_IMG_RESOURCE SET BASE_ID=? WHERE IMG_ID=?";
            pstmt = this.getDBConnection().createPreparedStatement(statement);
            if ((list != null) && (list.size() > 0)) {
                for (int i = 0; i < list.size(); i++) {
                    ImgresourceBean bean = list.get(i);
                    pstmt.setBigDecimal(1,baseId);
                    pstmt.setBigDecimal(2,bean.getImgid());
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
}
