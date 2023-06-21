package com.example.jdbcspring;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.view.RedirectView;
import org.springframework.web.multipart.support.MissingServletRequestPartException;

import io.micrometer.common.util.StringUtils;
@CrossOrigin(origins = "*")
@RestController
public class jdbcController {
	@Autowired
	JdbcService jc;
	@PostMapping("student-insert")
	public String insert(@RequestBody Student s) {
		int i=jc.insert(s);
		if(i>0) {
			return "Data is Inserted into student Table";
		}
		else 
		{
			return "Data is not Inserted into The Table";
		}
	}
	@PostMapping("student-update")
	public String update(@RequestBody Student s) {
		int j=jc.update(s);
		if(j>0) {
			return "Data is Updated in student Table";
		}
		else 
		{	
			return "Data is not Updated into The Table";
		}
	}
	@GetMapping("fetch")

	public List fetch() {

	return jc.slct();

	}
	@PostMapping("student-delete")
	public String delete(@RequestBody Student s) {
		int k=jc.delete(s);
		if(k>0) {
			return "Data is Deleted in student Table";
		}
		else 
		{
			return "Data is not Deleted from The Table";
		}
	}
	@GetMapping("student-update1/{id}/{name}/{age}/{average}")
	public String update1(@PathVariable int id, @PathVariable String name,@PathVariable int age,@PathVariable int average) {
		int r=jc.update1(id,name,age,average);
		if(r>0) {
			return "Data is Deleted in student Table";
		}
		else 
		{
			return "Data is not Deleted from The Table";
		}
	}
	 @GetMapping("sel/{id}")
	    public List sel(@PathVariable int id) {
	    return jc.sel(id);
	    }
	 @GetMapping("sel2")
	 public List sel2(@RequestParam("id") int id) {
	 return jc.sel(id);
	 }
	 @GetMapping("entities")
	   public List getEntities(
	    @RequestParam(defaultValue = "10") int pageSize,
	           @RequestParam(defaultValue = "0") int pageNumber
	           ) {
	       return jc.getEntities(pageSize,pageNumber);
	   }

	  @GetMapping("/index")
	  public String hello() {
	    return "uploader";
	  }
	  @GetMapping("upload")
		public File upload(@RequestParam("id") int id,@RequestParam("photos") File photos) throws FileNotFoundException {
			File j=jc.upload(id,photos);
			return null;
		}

}
