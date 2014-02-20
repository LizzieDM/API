package domain;

// Generated 13-feb-2014 18:05:58 by Hibernate Tools 4.0.0

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class HabitantesUll.
 * @see domain.HabitantesUll
 * @author Hibernate Tools
 */
public class HabitantesUllHome {

	private static final Log log = LogFactory.getLog(HabitantesUllHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext()
					.lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException(
					"Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(HabitantesUll transientInstance) {
		log.debug("persisting HabitantesUll instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(HabitantesUll instance) {
		log.debug("attaching dirty HabitantesUll instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(HabitantesUll instance) {
		log.debug("attaching clean HabitantesUll instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(HabitantesUll persistentInstance) {
		log.debug("deleting HabitantesUll instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public HabitantesUll merge(HabitantesUll detachedInstance) {
		log.debug("merging HabitantesUll instance");
		try {
			HabitantesUll result = (HabitantesUll) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public HabitantesUll findById(domain.HabitantesUllId id) {
		log.debug("getting HabitantesUll instance with id: " + id);
		try {
			HabitantesUll instance = (HabitantesUll) sessionFactory
					.getCurrentSession().get("domain.HabitantesUll", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(HabitantesUll instance) {
		log.debug("finding HabitantesUll instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("domain.HabitantesUll")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
