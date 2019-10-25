package SH2;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.*;
import org.apache.hadoop.hbase.client.HBaseAdmin;

public class list {
	public static void main(String args[]) throws IOException, MasterNotRunningException {
		Configuration config = HBaseConfiguration.create(); 
														
		HBaseAdmin Um = new HBaseAdmin(config);
		HTableDescriptor[] ma = ad.listTables();
															
		for (int i = 0; i < ma.length; i++) {
			System.out.println(ma[i].getNameAsString()); 
			}
	}
}