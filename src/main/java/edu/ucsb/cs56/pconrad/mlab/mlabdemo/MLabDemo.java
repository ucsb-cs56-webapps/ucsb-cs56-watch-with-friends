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

public class MLabDemo {
    public static void main(String [] args) throws java.io.IOException, java.net.URISyntaxException {
	System.out.println("Mlab Demo");

	java.io.InputStream in = new MLabDemo().getClass().getResourceAsStream("/buildings.json");	
	byte[] jsonData = StreamUtils.copyToByteArray(in);
	
	//create ObjectMapper instance
	ObjectMapper objectMapper = new ObjectMapper();

	//convert json string to object
        List<BuildingCode> list =
	    objectMapper.readValue(jsonData, List.class);

	System.out.println(list);
    }
}
