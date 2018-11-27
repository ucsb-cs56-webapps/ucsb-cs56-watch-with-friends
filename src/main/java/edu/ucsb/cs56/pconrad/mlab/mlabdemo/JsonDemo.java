package edu.ucsb.cs56.pconrad.mlab.mlabdemo;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import java.lang.invoke.MethodHandles;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.ObjectNode;

import org.springframework.util.StreamUtils;


import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.charset.Charset;
import static java.nio.charset.StandardCharsets.UTF_8; 

public class JsonDemo {

	/**
	   Read a file that is under a Maven project in src/main/java/resources
	   and return its contents as a <code>byte []</code>.   
       The filename should be specified as if the directory 
	   <code>src/main/java/resources</code> were the root of the filesystem.
	   This code relies on <code>org.springframework.util.StreamUtils</code>
	   so the <code>pom.xml</code> should include <code>spring-core</code> 
	   as a dependency.


	   @param filename filename, which should start with a <code>"/"</code>
	   @return contents of the file
	 */
	public static byte [] readByteDataFromResourceFile(String filename) throws java.io.IOException {
		java.io.InputStream in = MethodHandles.lookup().lookupClass().getResourceAsStream(filename);
		// java.io.InputStream in = new JsonDemo().getClass().getResourceAsStream(filename);	
		byte[] data = StreamUtils.copyToByteArray(in);
		return data;
	}
	
    public static void main(String [] args) throws java.io.IOException, java.net.URISyntaxException {
		System.out.println("Mlab Demo");

		// read buildings.json into a List<BuildingCode>		
		byte [] jsonData = readByteDataFromResourceFile("/buildings.json");
		ObjectMapper om = new ObjectMapper();
        List<BuildingCode> list = om.readValue(jsonData, new TypeReference<List<BuildingCode>>(){});

		System.out.println(list);
		
    }
}
