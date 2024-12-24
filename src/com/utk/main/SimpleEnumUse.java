package com.utk.main;

import com.utk.model.Spiciness;

public class SimpleEnumUse {

	public static void main(String[] args) {
		
		Spiciness howHot = Spiciness.FLAMING;
		System.out.println(howHot);
		for(Spiciness spicy: Spiciness.values()) {
			System.out.println(spicy + ", ordinal " + spicy.ordinal());
		}

	}

}
