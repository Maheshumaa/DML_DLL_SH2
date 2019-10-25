package Sh2;
import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.*;
import org.apache.hadoop.hbase.client.HBaseAdmin;

public class alterTable {
	public static void main(String args[]) throws IOException,MasterNotRunningException {
		Configuration config = HBaseConfiguration.create(); 
														
		HBaseAdmin ma = new HBaseAdmin(conf); 
		HColumnDescriptor um = new HColumnDescriptor("Name"); 
																		
		had.addColumn("FirstTable", um); // Adding column family by altering the table 
		System.out.println("Tabled is alter succefully");
	}
}