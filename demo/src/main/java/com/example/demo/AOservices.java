package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class AOservices {

	public int add(int a,int b) {
		return a+b;
	}
	public int sub(int a,int b) {
		return a-b;
	}
	public int mul(int a,int b) {
		return a*b;
	}
	public String div(int a,int b) {
		try {
			return  "the answer is "+a/b;
			}
		catch(Exception e){
			return "Exception"+e;
		}
		
		}
	
	
	
	}
