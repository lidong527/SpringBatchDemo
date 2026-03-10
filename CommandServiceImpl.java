package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class CommandServiceImpl implements CommandService {

	public void display01() {
		System.out.println("処理：hello, sping Boot.");
	}
	
	public void display02() {
		System.out.println("処理：hello, world.");
	}
}
