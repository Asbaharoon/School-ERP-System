package dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import pojo.Admin;
import util.Util;

public class AdminDao {
	
	public static SessionFactory sf = Util.getSessionFactory();
	

	public static Admin loginAdmin(Admin a2) {
		Admin a=null;
		try{
		Session session=sf.openSession();
		Transaction transaction=session.beginTransaction();
		Criteria criteria=session.createCriteria(Admin.class);
		criteria.add(Restrictions.eq("Admin_name", a2.getAdmin_name()));
		criteria.add(Restrictions.eq("Admin_pass", a2.getAdmin_pass()));
		 a=(Admin)criteria.uniqueResult();
		transaction.commit();
		session.close();
		}catch(Exception e){
			System.out.println(""+e);
		}
		
		return a;
	}

}
