package com.kn.factory;

public class Constant {
	
	public enum DBType {
		MySQL,
		Oracle,
		DB2,
		MongoDB,
	};
	
	interface DBTYPE {
		int MySQL = 1;
		int Oracle = 2;
		int DB2 = 3;
	}
	
}

