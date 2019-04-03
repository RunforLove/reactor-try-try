package com.runforlove.reactortrytry;


import org.junit.Test;

import java.util.Arrays;

public class KeyRepositoryWrongTest {
	
	
	@Test
	public void test(){
		KeyRepositoryWrong keyRepositoryWrong = new KeyRepositoryWrong();
		
		String s = Arrays.toString(keyRepositoryWrong.getOrCreateBy("test"));
		
		while (true){
			new Thread(() -> {
				if(!s.equals(Arrays.toString(keyRepositoryWrong.getOrCreateBy("test")))){
					System.out.println("wrong!!!");
				}
			}, "thread-1").start();
			
			new Thread(() -> {
				if(!s.equals(Arrays.toString(keyRepositoryWrong.getOrCreateBy("test")))){
					System.out.println("wrong!!!");
				}
			}, "thread-2").start();
			
			new Thread(() -> {
				if(!s.equals(Arrays.toString(keyRepositoryWrong.getOrCreateBy("test")))){
					System.out.println("wrong!!!");
				}
			}, "thread-3").start();
		}
		
		
	}
	
	
	@Test
	public void t(){
		KeyRepositoryWrong keyRepositoryWrong = new KeyRepositoryWrong();
		System.out.println(Arrays.toString(keyRepositoryWrong.getOrCreateBy("test1")));
		System.out.println(Arrays.toString(keyRepositoryWrong.getOrCreateBy("test1")));
	}
}