package APITesting;

import static io.restassured.RestAssured.given;

import java.io.File;

public class FileUploadAndDownload {
	
	public void singleFileUpload() {
	
	File myFile = new File("path of the file ");
	
	given()
	
		.multiPart("file", myFile)
		.contentType("mulitpart/form-date")
		
	.when()
		.post("url of the api")
		
	.then()
		.statusCode(200)
	//	.body("filename", equalTo("Text1.txt"))
		.log().all();
	}
	
	
	
	
	
	public void multipleFileUpload() {
		
		File myFile1 = new File("path of the file ");
		File myFile2= new File("path of the file ");
		
		given()
			.multiPart("file", myFile1)
			.multiPart("file", myFile2)
			.contentType("mulitpart/form-date")
			
		.when()
			.post("url of the api")
			
		.then()
			.statusCode(200)
		//	.body("filename", equalTo("Text1.txt"))
			.log().all();
		}

}
