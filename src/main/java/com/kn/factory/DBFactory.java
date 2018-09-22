package com.kn.factory;

import com.kn.factory.Constant.DBTYPE;

public class DBFactory {

	public static IFactory factory = null;

	public static IFactory createDBFactory(DBType type) {
		
		switch (type.getDbName().toUpperCase()) {
		case "MYSQL":
			factory = new MySQLDaoFactory();
			break;

		case "ORACLE":
			factory = new OracleDaoFactory();
			break;

		case "DB2":
			factory = new DB2DaoFactory();
			break;

		default:
			break;
		}

		return factory;
	}

	public static IFactory createDBFactory(int dbType) {

		switch (dbType) {
		case DBTYPE.MySQL:
			factory = new MySQLDaoFactory();
			break;

		case DBTYPE.DB2:
			factory = new DB2DaoFactory();
			break;

		case DBTYPE.Oracle:
			factory = new OracleDaoFactory();
			break;

		default:
			break;
		}

		return factory;
	}
}
