package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import pojo.Section;
import util.Util;

public class SectionDao {

	public static SessionFactory sf = Util.getSessionFactory();
	
	public static int insert(Section sc) {
		int status=0;
		
		Session session=sf.openSession();
		Transaction transaction=session.beginTransaction();

		status=(int) session.save(sc);
		
		transaction.commit();
		session.close();
		return status;
		}
	
	 public static Section getSectioneById(int sec_id)
	 {
			Section section=null;
			try
			{
				Session s=sf.openSession();
				Transaction t= s.beginTransaction();
				section=(Section)s.get(Section.class, sec_id);
				t.commit();
				s.close();
			
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			return section;
		}
	 
	 public static List<Section> getAllSection() 
		{
				List<Section> list=null;
				try
				{
				Session s=sf.openSession();
				Transaction t= s.beginTransaction();
				list=s.createCriteria(Section.class).list(); 
				t.commit();
				s.close();
			}
			
			catch(Exception e)
			{
				System.out.println(e);
			}
			
				return list;
				
			}
	

}
