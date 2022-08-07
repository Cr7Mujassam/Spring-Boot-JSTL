package com.in28minutes.springboot.web.springbootfirstwebapplication.list;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class ListShow {
	
	public String car;
	
	public ArrayList<String> showList() {
		ArrayList<String> li =  new ArrayList<>();
		li.add("Honda City");
		li.add("Tesla");
		li.add("Mustang GT");
		li.add(car);
		return li;
		}
	
	
}
