package com.springproject.springannotation;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	//create an array of Strings
	private String data[] = {
			"Beware of the danger",
			"Hard Work pays off",
			"The journey is the reward"
			
	};
	
	//create a random number generator
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		//pick a random string from the array
		int index = myRandom.nextInt(data.length);
		String theFortune = data[index];
		
		return theFortune;
	}

}
