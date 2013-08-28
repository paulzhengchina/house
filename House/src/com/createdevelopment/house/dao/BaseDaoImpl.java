package com.createdevelopment.house.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.createdevelopment.house.entity.Picture;



public class BaseDaoImpl extends HibernateDaoSupport implements BaseDao{
	
    
	public List findResultForPager(String hql,int start,int num){
		
    Query query=this.getSession().createQuery(hql);
    query.setFirstResult(start);
    query.setMaxResults(num);
	return query.list();
	}
	
	public int findAllResNum(String hql){
		List results=this.getHibernateTemplate().find(hql);
		if(results!=null&&results.size()>0)
			return results.size();
		else
			return 0;
	}
	
	public int findAllResNum(DetachedCriteria detachedCriteria ){
		List results=this.getHibernateTemplate().findByCriteria(detachedCriteria);
		if(results!=null&&results.size()>0)
			return results.size();
		else
			return 0;
	}
	
	public int findAllResNum(Object obj ){
		List results=this.getHibernateTemplate().findByExample(obj);
		if(results!=null&&results.size()>0)
			return results.size();
		else
			return 0;
	}
	
	public Object saveEntityWithReturnedObjection(Object entity) {
		// TODO Auto-generated method stub
		try {
			getHibernateTemplate().save(entity);
			getHibernateTemplate().flush();
			return entity;
		} catch (Exception ex) {
			throw new RuntimeException(ex.getMessage());
		}
	}
}
