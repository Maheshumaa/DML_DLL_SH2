package Sh2;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.*;
import org.apache.hadoop.hbase.client.HBaseAdmin;

public class drop {
	public static void main(String[] args) throws IOException {
		Configuration config = HBaseConfiguration.create(); 
		HBaseAdmin had = new HBaseAdmin(config); 
		String table = "Employee";
	  
		had.disableTable(table);
		had.deleteTable(table); 
		System.out.printf(table," is droped succesfully);
	}
}