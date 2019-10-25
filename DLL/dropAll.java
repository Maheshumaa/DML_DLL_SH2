package Sh2;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.*;
import org.apache.hadoop.hbase.client.HBaseAdmin;

public class dropAll{
	public static void main(String[] args) throws IOException {
		Configuration config = HBaseConfiguration.create(); 
		HBaseAdmin had = new HBaseAdmin(config); 
		String regex = "E";
		had.disableTables(regex);
		had.deleteTables(regex);
		System.out.printf("All the Tables matching the regex'",regex,"' are dropped");
	}
}
