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
 * Home object for domain model class ViviendasUll.
 * @see domain.ViviendasUll
 * @author Hibernate Tools
 */
public class ViviendasUllHome {

	private static final Log log = LogFactory.getLog(ViviendasUllHome.class);

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

	public void persist(ViviendasUll transientInstance) {
		log.debug("persisting ViviendasUll instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(ViviendasUll instance) {
		log.debug("attaching dirty ViviendasUll instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ViviendasUll instance) {
		log.debug("attaching clean ViviendasUll instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(ViviendasUll persistentInstance) {
		log.debug("deleting ViviendasUll instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ViviendasUll merge(ViviendasUll detachedInstance) {
		log.debug("merging ViviendasUll instance");
		try {
			ViviendasUll result = (ViviendasUll) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ViviendasUll findById(domain.ViviendasUllId id) {
		log.debug("getting ViviendasUll instance with id: " + id);
		try {
			ViviendasUll instance = (ViviendasUll) sessionFactory
					.getCurrentSession().get("domain.ViviendasUll", id);
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

	public List findByExample(ViviendasUll instance) {
		log.debug("finding ViviendasUll instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("domain.ViviendasUll")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
	
	public List<ViviendasUll> findAll2() {
		log.debug("finding Casasjuventud instance by example");
		try {
			List<ViviendasUll> results = (List<ViviendasUll>) sessionFactory
					.getCurrentSession().createCriteria("domain.ViviendasUll")
					.list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
