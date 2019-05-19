package com.business.dao;
import java.util.*;
import com.business.domain.*;
import com.eplat.db.dao.AnnotationParentDao;
/**
 * @类名称：MemberprivilegeDao
 * @类描述：会员特权
 * @创建人：代码生成器
 * @创建时间：2019年03月07日 16:47:52
 */
public class MemberprivilegeDao extends AnnotationParentDao {
    @SuppressWarnings("unchecked")
    public List<MemberprivilegeBean> query(String... orderFields) throws Exception {
        return (List<MemberprivilegeBean>)super.query(new MemberprivilegeBean(), orderFields);
    }
    @SuppressWarnings("unchecked")
    public List<MemberprivilegeBean> queryByCause(String sql, Object... sqlParams) throws Exception {
        return (List<MemberprivilegeBean>)super.queryByCause(new MemberprivilegeBean(), sql, sqlParams);
    }
    @SuppressWarnings("unchecked")
    public void deleteByCause(String sql, Object... sqlParams) throws Exception {
        super.deleteByCause(new MemberprivilegeBean(), sql, sqlParams);
    }
}
