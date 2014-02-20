package resources;



import hibernate.HibernateUtil;

import java.util.List;

import javax.servlet.ServletContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;
import org.hibernate.Session;
import org.hibernate.Transaction;

import domain.ViviendasUll;
import domain.ViviendasUllHome;

@Path("/")
public class Viviendas {
	@Context
	UriInfo uriInfo;
	@Context
	Request request;
	@Context
	ServletContext context;
	
	@GET
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public List<ViviendasUll> getViviendas() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction txn = session.beginTransaction();
		List<ViviendasUll> retorno = null;
		try{ 
			ViviendasUllHome DAOCasas = new ViviendasUllHome();
			retorno = DAOCasas.findAll2();
		}
		catch (Exception e){
			e.printStackTrace();
		}
		finally{
			txn.commit();
			return retorno;
		}
		
	}
}
