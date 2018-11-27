package edu.ucsb.cs56.pconrad.mlab.mlabdemo;

import lombok.Data;
import lombok.RequiredArgsConstructor; // generates constructor for fields marked with @NonNull
import lombok.NoArgsConstructor;  // @NonNull property ignored by this constructor
import lombok.NonNull;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@RequiredArgsConstructor 
public class BuildingCode {

    @Id private String id;	
    @NonNull private String code;
    @NonNull private String name;
}
