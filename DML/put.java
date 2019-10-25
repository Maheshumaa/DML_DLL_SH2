package Sh2;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.*;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.util.Bytes;
public class put{
public static void main(String[] args) throws IOException {
Configuration config = HBaseConfiguration.create(); 
String Table  = "Employee";
HTable hTable = new HTable(config, Table);      
Put row1 = new Put(Bytes.toBytes("01"));

// column family 1
row1.add(Bytes.toBytes("uma_1"),   	Bytes.toBytes("Emp_ID"),	Bytes.toBytes("MAMA"));
row1.add(Bytes.toBytes("uma_1"),	Bytes.toBytes("Name"),		Bytes.toBytes("Kiran"));
row1.add(Bytes.toBytes("uma_1"),	Bytes.toBytes("Designation"),		Bytes.toBytes("Programmer"));
// column family 2
row1.add(Bytes.toBytes("uma_2"),   	Bytes.toBytes("Gmail"),	Bytes.toBytes("Mah@gamil.com"));
row1.add(Bytes.toBytes("uma_2"),	Bytes.toBytes("Salary"),		Bytes.toBytes("67000"));
row1.add(Bytes.toBytes("uma_2"),	Bytes.toBytes("Phonenumber"),		Bytes.toBytes("9959177"));
//column family 3
row1.add(Bytes.toBytes("uma_3"),	Bytes.toBytes("Gender"),		Bytes.toBytes("PPAA"));
row1.add(Bytes.toBytes("uma_3"),	Bytes.toBytes("Age"),		Bytes.toBytes("33"));
row1.add(Bytes.toBytes("uma_3"),	Bytes.toBytes("City"),		Bytes.toBytes("TPT"));
hTable.put(row1); // Adding the data into HTable

//ROW 2
Put row2 = new Put(Bytes.toBytes("02"));  
//syntax  column family name, column name  and its value
//column family 1
row2.add(Bytes.toBytes("uma_1"),   	Bytes.toBytes("Emp_ID"),	Bytes.toBytes("NANA"));
row2.add(Bytes.toBytes("uma_1"),	Bytes.toBytes("Name"),		Bytes.toBytes("Chinnu"));
row2.add(Bytes.toBytes("uma_1"),	Bytes.toBytes("Designation"),		Bytes.toBytes("Commer"));
//column family 2
row2.add(Bytes.toBytes("uma_2"),   	Bytes.toBytes("Gmail"),	Bytes.toBytes("Klala@gmail.com"));
row2.add(Bytes.toBytes("uma_2"),	Bytes.toBytes("salary"),		Bytes.toBytes("9000"));
row2.add(Bytes.toBytes("uma_2"),	Bytes.toBytes("Phonenumber"),		Bytes.toBytes("2123123341"));
//column family 3
row2.add(Bytes.toBytes("uma_3"),	Bytes.toBytes("Gender"),		Bytes.toBytes("Male"));
row2.add(Bytes.toBytes("uma_3"),	Bytes.toBytes("Age"),		Bytes.toBytes("21"));
row2.add(Bytes.toBytes("uma_3"),	Bytes.toBytes("City"),		Bytes.toBytes("Guntur"));
hTable.put(row2); // Adding the data into HTable

//ROW 3
Put row3 = new Put(Bytes.toBytes("03"));  
//syntax  column family name, column name  and its value
//column family 1
row3.add(Bytes.toBytes("uma_1"),   	Bytes.toBytes("Emp_ID"),	Bytes.toBytes("MAMA"));
row3.add(Bytes.toBytes("uma_1"),	Bytes.toBytes("Name"),		Bytes.toBytes("Mahesh"));
row3.add(Bytes.toBytes("uma_1"),	Bytes.toBytes("Designation"),		Bytes.toBytes("Developer"));
//column family 2
row3.add(Bytes.toBytes("uma_2"),   	Bytes.toBytes("Gmail"),	Bytes.toBytes("Sassa@gmail.com"));
row3.add(Bytes.toBytes("uma_2"),	Bytes.toBytes("salary"),		Bytes.toBytes("23000"));
row3.add(Bytes.toBytes("uma_2"),	Bytes.toBytes("Phonenumber"),		Bytes.toBytes("123123123"));
//column family 3
row3.add(Bytes.toBytes("uma_3"),	Bytes.toBytes("Gender"),		Bytes.toBytes("Male"));
row3.add(Bytes.toBytes("uma_3"),	Bytes.toBytes("Age"),		Bytes.toBytes("21"));
row3.add(Bytes.toBytes("uma_3"),	Bytes.toBytes("City"),		Bytes.toBytes("Rishikesh"));
hTable.put(row3); // Adding the data into HTable


//ROW 4
Put row4 = new Put(Bytes.toBytes("04"));  
//syntax  column family name, column name  and its value
//column family 1
row4.add(Bytes.toBytes("uma_1"),   	Bytes.toBytes("Emp_ID"),	Bytes.toBytes("MAMA"));
row4.add(Bytes.toBytes("uma_1"),	Bytes.toBytes("Name"),		Bytes.toBytes("Jawahar"));
row4.add(Bytes.toBytes("uma_1"),	Bytes.toBytes("Designation"), Bytes.toBytes("Senior manager"));
//column family 2
row4.add(Bytes.toBytes("uma_2"),   	Bytes.toBytes("Gmail"),	Bytes.toBytes("jawahar333@gmail.com"));
row4.add(Bytes.toBytes("uma_2"),	Bytes.toBytes("salary"),		Bytes.toBytes("20000"));
row4.add(Bytes.toBytes("uma_2"),	Bytes.toBytes("Phonenumber"),		Bytes.toBytes("9833534577"));
//column family 3
row4.add(Bytes.toBytes("uma_3"),	Bytes.toBytes("Gender"),		Bytes.toBytes("Male"));
row4.add(Bytes.toBytes("uma_3"),	Bytes.toBytes("Age"),		Bytes.toBytes("32"));
row4.add(Bytes.toBytes("uma_3"),	Bytes.toBytes("City"),		Bytes.toBytes("Kiyush"));
hTable.put(row4); // Adding the data into HTable

//ROW 5
Put row5 = new Put(Bytes.toBytes("05"));  
//syntax  column family name, column name  and its value
//column family 1
row5.add(Bytes.toBytes("uma_1"),   	Bytes.toBytes("Emp_ID"),	Bytes.toBytes("MAMAM"));
row5.add(Bytes.toBytes("uma_1"),	Bytes.toBytes("Name"),		Bytes.toBytes("Kapu"));
row5.add(Bytes.toBytes("uma_1"),	Bytes.toBytes("Designation"),		Bytes.toBytes("Asst manager"));
//column family 2
row5.add(Bytes.toBytes("uma_2"),   	Bytes.toBytes("Gmail"),	Bytes.toBytes("srinu@gmail.com"));
row5.add(Bytes.toBytes("uma_2"),	Bytes.toBytes("salary"),		Bytes.toBytes("23232"));
row5.add(Bytes.toBytes("uma_2"),	Bytes.toBytes("Phonenumber"),		Bytes.toBytes("7234187423747"));
//column family 3
row5.add(Bytes.toBytes("uma_3"),	Bytes.toBytes("Gender"),		Bytes.toBytes("Male"));
row5.add(Bytes.toBytes("uma_3"),	Bytes.toBytes("Age"),		Bytes.toBytes("23"));
row5.add(Bytes.toBytes("uma_3"),	Bytes.toBytes("City"),		Bytes.toBytes("Um"));
hTable.put(row5); // Adding the data into HTable

System.out.println("Data is inserted in the ",Table," table");     
hTable.close();   // Closing HTable   
}
}