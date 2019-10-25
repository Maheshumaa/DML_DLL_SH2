package Sh2;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.*;
import org.apache.hadoop.hbase.client.HBaseAdmin;

public class tableExists {
	public static void main(String args[]) throws IOException {
		Configuration config = HBaseConfiguration.create(); 
		HBaseAdmin had = new HBaseAdmin(config); 
		boolean exists = had.tableExists("Employee");
		System.out.println("Table exists: ");
		System.out.println(exists);
	}
}