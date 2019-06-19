package controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import pojo.Section;
import pojo.Standard;
import util.Util;

public class StandardDao {

	public static SessionFactory sf = Util.getSessionFactory();
	
	public static int add_standard(Standard std) {
		
		
		
			int status=0;
			
			Session session=sf.openSession();
			Transaction transaction=session.beginTransaction();

			status=(int) session.save(std);
			
			transaction.commit();
			session.close();
			return status;
			
	}

}
