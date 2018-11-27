package edu.ucsb.cs56.pconrad.mlab.mlabdemo;

import lombok.Data;
import lombok.RequiredArgsConstructor; // generates constructor for fields marked with @NonNull
import lombok.NonNull;
import org.springframework.data.annotation.Id;

@Data
@RequiredArgsConstructor 
public class BuildingCode {

    @Id private String id;	
    @NonNull private String code;
    @NonNull private String name;
}
