package com.myjs.sys.module.Dao;

import java.io.Serializable;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;

import com.myjs.commons.DaoUtil;
import com.myjs.sys.module.model.LSysFunction;

public class functionDaoImpl extends DaoUtil implements functionDao{
	private static final Logger log = LogManager.getLogger(functionDaoImpl.class);

	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@SuppressWarnings("unchecked")
	public List<LSysFunction> findbyproperties(String functionName) throws Exception{
		log.debug("findbyproperties start");
		List<?> querylist = null;
		String[] valuearr = new String[1];
		valuearr[0]="%" + functionName + "%";
		String queryString = "from LSysFunction lsf where  1=1";
		if(functionName != null && !functionName.equals("")){
			queryString += " and lsf.functionName like '"+valuearr[0]+"'";
		}
		log.debug("queryString = {}", queryString);
		querylist = super.getHibernateTemplate().find(queryString);
		log.debug("findbyproperties end");
		return (List<LSysFunction>) querylist;
	}

	public boolean save(LSysFunction transientInstance) throws Exception {
		log.debug("saving LSysFunction instance");
		boolean flag = false;
		Serializable lizable=super.getHibernateTemplate().save(transientInstance);
		if(null!=lizable||!"".equals(lizable)){
			flag=true;
		}
		log.debug("save successful");
		return flag;
	}
}
