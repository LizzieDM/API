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
 * Home object for domain model class DomiciliosUll.
 * @see domain.DomiciliosUll
 * @author Hibernate Tools
 */
public class DomiciliosUllHome {

	private static final Log log = LogFactory.getLog(DomiciliosUllHome.class);

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

	public void persist(DomiciliosUll transientInstance) {
		log.debug("persisting DomiciliosUll instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(DomiciliosUll instance) {
		log.debug("attaching dirty DomiciliosUll instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(DomiciliosUll instance) {
		log.debug("attaching clean DomiciliosUll instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(DomiciliosUll persistentInstance) {
		log.debug("deleting DomiciliosUll instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public DomiciliosUll merge(DomiciliosUll detachedInstance) {
		log.debug("merging DomiciliosUll instance");
		try {
			DomiciliosUll result = (DomiciliosUll) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public DomiciliosUll findById(domain.DomiciliosUllId id) {
		log.debug("getting DomiciliosUll instance with id: " + id);
		try {
			DomiciliosUll instance = (DomiciliosUll) sessionFactory
					.getCurrentSession().get("domain.DomiciliosUll", id);
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

	public List findByExample(DomiciliosUll instance) {
		log.debug("finding DomiciliosUll instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("domain.DomiciliosUll")
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
