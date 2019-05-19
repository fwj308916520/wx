package com.business.dao;
import java.util.*;
import com.business.domain.*;
import com.eplat.db.dao.AnnotationParentDao;
/**
 * @类名称：TplmsgtextDao
 * @类描述：微信消息模板表
 * @创建人：代码生成器
 * @创建时间：2019年03月08日 12:02:31
 */
public class QminfjDao extends AnnotationParentDao {
    @SuppressWarnings("unchecked")
    public List<QminfjBean> query(String... orderFields) throws Exception {
        return (List<QminfjBean>)super.query(new QminfjBean(), orderFields);
    }
    @SuppressWarnings("unchecked")
    public List<QminfjBean> queryByCause(String sql, Object... sqlParams) throws Exception {
        return (List<QminfjBean>)super.queryByCause(new QminfjBean(), sql, sqlParams);
    }
    @SuppressWarnings("unchecked")
    public void deleteByCause(String sql, Object... sqlParams) throws Exception {
        super.deleteByCause(new QminfjBean(), sql, sqlParams);
    }
}
