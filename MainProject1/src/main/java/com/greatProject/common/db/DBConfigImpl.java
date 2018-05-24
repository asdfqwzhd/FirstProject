package com.greatProject.common.db;

import javax.sql.DataSource;

import org.seasar.doma.jdbc.Config;
import org.seasar.doma.jdbc.dialect.Dialect;
import org.springframework.beans.factory.InitializingBean;

public class DBConfigImpl implements Config,InitializingBean  {
	
	private DataSource dataSource;
	
	private Dialect dialect;

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public DataSource getDataSource() {
		return dataSource;
	}

	@Override
	public Dialect getDialect() {
		return dialect;
	}
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void setDialect(Dialect dialect) {
		this.dialect = dialect;
	}
}
