package upskill.ebay.pageAction;

import static io.restassured.RestAssured.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

import java.io.File;


public class PetstoreRestAssuredActions {
	
	public void CreatePet(){
		given().
		body(new File(System.getProperty("user.dir") + "/src/test/resource/ApiRequestPayloads/CreatePetRequest.json" )).
		when().
		header("Content-Type", "application/json").
		header("Username", "upskill").
		header("Password", "123").
		post("https://petstore.swagger.io/v2/pet").
		then().
			log().body().
		and().
			assertThat().statusCode(200).
		and().
		body(matchesJsonSchema(new File(System.getProperty("user.dir") + "/src/test/resource/ApiRequestPayloads/CreatePetRequest.json")));
		
	}
	public void updatePet(){
		given().
			body(new File(System.getProperty("user.dir") + "/src/test/resource/ApiRequestPayloads/UpdatePetRequest.json" )).
		when().
			header("Content-Type", "application/json").
			header("Username", "upskill").
			header("Password", "123").
			put("https://petstore.swagger.io/v2/pet").
		then().
			log().body().
		and().
			assertThat().statusCode(200).
		and().
			body(matchesJsonSchema(new File(System.getProperty("user.dir") + "/src/test/resource/ApiRequestPayloads/UpdatePetRequest.json")));
	}
	public void getPet(){
		given().
		when().
		header("Content-Type", "application/json").
		header("Username", "upskill").
		header("Password", "123").
		get("https://petstore.swagger.io/v2/pet/2").
		then().
			log().body().
		and().
			assertThat().statusCode(200).
		and().
		body(matchesJsonSchema(new File(System.getProperty("user.dir") + "/src/test/resource/ApiRequestPayloads/GetPetRequest.json")));
		
	}
	public void deletePet(){
		given().
		header("Content-Type", "application/json").
		header("Username", "upskill").
		header("Password", "123").
		get("https://petstore.swagger.io/v2/pet/2").
		then().
			log().body().
		and().
			assertThat().statusCode(200).
		and().
		body(matchesJsonSchema(new File(System.getProperty("user.dir") + "/src/test/resource/ApiRequestPayloads/DeletePetRequest.json")));
		
		
	}

}
