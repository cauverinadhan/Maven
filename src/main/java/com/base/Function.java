package com.base;
import java.time.LocalTime;
import java.util.function.Supplier;


public class Function implements Supplier<LocalTime>{
	
	public LocalTime get() {
		// TODO Auto-generated method stub
		return LocalTime.now();
	}
public static class Datemaethod{
	
	public static void main(String[] args) {
		//Function d= new Function();
		//System.out.println(d.get());
	Supplier<LocalTime>	d=new Supplier<LocalTime>() {
		public LocalTime get() {
			return LocalTime.now();
		}
	};
	System.out.println(d.get());
	}
}}