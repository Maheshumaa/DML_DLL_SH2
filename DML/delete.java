package Sh2;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.*;
import org.apache.hadoop.hbase.client.Delete;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.util.Bytes;

public class delete {
	public static void main(String[] args) throws IOException {
		Configuration config = HBaseConfiguration.create();
		String Table = "Employee"; 
		HTable Htable = new HTable(config, Table); 
		Delete delete_data = new Delete(Bytes.toBytes(04));  
		delete_data.deleteColumn(Bytes.toBytes("uma_3"), Bytes.toBytes("City"));
		
		Htable.delete(delete_data); 
		Htable.close();
		System.out.println("Data is deleted from the selected table");
	}
}