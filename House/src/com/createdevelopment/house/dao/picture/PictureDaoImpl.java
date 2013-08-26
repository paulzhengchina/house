package com.createdevelopment.house.dao.picture;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import com.createdevelopment.house.dao.BaseDaoImpl;
import com.createdevelopment.house.entity.Picture;

public class PictureDaoImpl extends BaseDaoImpl implements PictureDao {

	@Override
	public Picture getPicture(String pictureId) {
		// TODO Auto-generated method stub
		DetachedCriteria detachedCriteria = DetachedCriteria
				.forClass(Picture.class);
		detachedCriteria.add(Restrictions.eq("id", pictureId));
		List<Picture> pictures = this.getHibernateTemplate().findByCriteria(
				detachedCriteria);
		if (pictures != null && pictures.size() > 0)
			return pictures.get(0);
		else
			return null;
	}

	@Override
	public void deletePicture(Picture picture) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(picture);
	}

	@Override
	public List<Picture> getPicturesForObject(String ownerId) {
		// TODO Auto-generated method stub
		DetachedCriteria detachedCriteria = DetachedCriteria
				.forClass(Picture.class);
		detachedCriteria.add(Restrictions.eq("ownerId", ownerId));
		return this.getHibernateTemplate().findByCriteria(detachedCriteria);
	}

	@Override
	public Picture savePicture(Picture picture) {
		// TODO Auto-generated method stub
		try {
			getHibernateTemplate().save(picture);
			getHibernateTemplate().flush();
			return picture;
		} catch (Exception ex) {
			throw new RuntimeException(ex.getMessage());
		}
	}

}
