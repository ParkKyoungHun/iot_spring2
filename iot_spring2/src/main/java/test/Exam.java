package test;

import org.apache.commons.dbcp.BasicDataSource;

public class Exam {

	Exam(BasicDataSource str){
		
	}
	public static void main(String[] args){
		BasicDataSource dataSourceSpied = new BasicDataSource();
		Exam e = new Exam(dataSourceSpied);
	}
}
