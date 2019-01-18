package com.example.day01;

import java.util.ArrayList;

public class Demo {
	ArrayList<Dome> lol;

	public Demo(ArrayList<Dome> lol) {
		super();
		this.lol = lol;
	}

	public ArrayList<Dome> getLol() {
		return lol;
	}

	public void setLol(ArrayList<Dome> lol) {
		this.lol = lol;
	}

	@Override
	public String toString() {
		return "Demo [lol=" + lol + "]";
	}
}
