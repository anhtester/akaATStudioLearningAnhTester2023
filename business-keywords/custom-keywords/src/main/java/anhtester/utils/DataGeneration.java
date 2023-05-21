package anhtester.utils;

import net.datafaker.Faker;

public class DataGeneration {

	public String getFullName(){

		Faker faker = new Faker();

		return faker.name().fullName();
	}

	public String getEmail(){
		Faker faker = new Faker();

		return faker.internet().emailAddress();
	}

}