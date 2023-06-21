package com.example.jdbcspring;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class JdbcService {
@Autowired
JdbcTemplate js;
public int insert(Student s) {
	int id=s.getId();
	String name=s.getName();
	int age=s.getAge();
	int average=s.getAverage();
	String sql="insert into student values(?,?,?,?,?)";
	int i=js.update(sql, id,name,age,average);
	return i;
	
}
public int update(Student s) {
	String sql="update student set age=?,average=?,name=? where id=?";
	int id=s.getId();
	String name=s.getName();
	int age=s.getAge();
	int average=s.getAverage();
	int j=js.update(sql, age,average,name,id);
	return j;
	
}
public int update1(int id,String name,int age,int average) {
	String sql="update student set age=?,average=?,name=? where id=?";
	int r=js.update(sql, age,average,name,id);
	return r;
}
public int delete(Student s) {
	String sql="delete from student where id=?";
	int id=s.getId();
	int k=js.update(sql, id);
	return k;
	
}
public List slct() {

List getdata=new ArrayList<>();

List<Map<String,Object>> data=new ArrayList<Map<String,Object>>();

String sql="select * from student";

data=js.queryForList(sql);

for(Map<String,Object> newdata:data) {

getdata.add(newdata);

}

return getdata;

}
public List sel(int id) {
	   List<Map<String, Object>> data = new ArrayList<>();
	   String sql = "select * from student where id=?";
	   data = js.queryForList(sql, id);

	   List<Object> resultList = new ArrayList<>();
	   for (Map<String, Object> rowData : data) {
	       resultList.add(rowData);
	   }

	   return resultList;
	}

public List sel2(Student s) {
	  int id = s.getId();
	    List l = new ArrayList<>();
        HashMap m1=new HashMap();
        List<Map<String,Object>> data= new ArrayList<Map<String,Object>>();
        String sql = "select * from student where id=?";
        data = js.queryForList(sql,id);
        for(Map listdata:data) {
        m1.put("id",listdata.get("id"));
        m1.put("name",listdata.get("name"));
        m1.put("age",listdata.get("age"));
        m1.put("average",listdata.get("average"));
        l.add(m1);
        }
        return l;
       
    }
public List getEntities( int pageSize,int pageNumber) {
List<Map<String, Object>> data = new ArrayList<>();
   int offset= pageNumber*10;
   String sql = "select * from student  limit ? offset ?";
   data = js.queryForList(sql, pageSize,offset);

   List<Object> resultList = new ArrayList<>();
   for (Map<String, Object> rowData : data) {
       resultList.add(rowData);
   }

   return resultList;
}
public File upload(int id, File photos) throws FileNotFoundException {
String sql = "INSERT INTO student(id,photos) VALUES (?,?)";
//String photos=s.getPhotos();
FileReader reader = new FileReader(photos);
int i=js.update(sql, id,photos);
//return i;
return null;
}
//public static void saveFile(String uploadDir, String fileName,
//        MultipartFile multipartFile) throws IOException {
//    Path uploadPath = Paths.get(uploadDir);
//     
//    if (!Files.exists(uploadPath)) {
//        Files.createDirectories(uploadPath);
//    }
//    try (InputStream inputStream = multipartFile.getInputStream()) {
//        Path filePath = uploadPath.resolve(fileName);
//        Files.copy(inputStream, filePath, StandardCopyOption.REPLACE_EXISTING);
//    } catch (IOException ioe) {        
//        throw new IOException("Could not save image file: " + fileName, ioe);
//    }      
//}
//public int upload {
//	// TODO Auto-generated method stub
//	return 0;
//}

}
