package com.test.git.controller;

public class controllerdf {
 String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
	System.out.println("hello");
	System.out.println();
}

@Override
public String toString() {
	return "controllerdf [name=" + name + "]";
}
 
}
