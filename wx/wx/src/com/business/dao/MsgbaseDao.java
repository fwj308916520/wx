package com.business.dao;
import java.util.*;
import com.business.domain.*;
import com.eplat.db.dao.AnnotationParentDao;
/**
 * @类名称：MsgbaseDao
 * @类描述：消息基础表
 * @创建人：代码生成器
 * @创建时间：2019年03月08日 11:33:09
 */
public class MsgbaseDao extends AnnotationParentDao {
    @SuppressWarnings("unchecked")
    public List<MsgbaseBean> query(String... orderFields) throws Exception {
        return (List<MsgbaseBean>)super.query(new MsgbaseBean(), orderFields);
    }
    @SuppressWarnings("unchecked")
    public List<MsgbaseBean> queryByCause(String sql, Object... sqlParams) throws Exception {
        return (List<MsgbaseBean>)super.queryByCause(new MsgbaseBean(), sql, sqlParams);
    }
    @SuppressWarnings("unchecked")
    public void deleteByCause(String sql, Object... sqlParams) throws Exception {
        super.deleteByCause(new MsgbaseBean(), sql, sqlParams);
    }
    @SuppressWarnings("unchecked")
    public List<MsgbaseBean> queryCause(String sql, Object... sqlParams) throws Exception{
        return (List<MsgbaseBean>)super.queryCause(new MsgbaseBean(), sql, sqlParams);
    }
}
