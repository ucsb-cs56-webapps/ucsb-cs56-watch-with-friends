package edu.ucsb.cs56.watchapp.springboot.watchwithfriends;

import lombok.Data;
import lombok.RequiredArgsConstructor; // generates constructor for fields marked with @NonNull
import lombok.NoArgsConstructor;  // @NonNull property ignored by this constructor
import lombok.NonNull;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@RequiredArgsConstructor 
public class WatchCode {

    @Id private String id;	
    @NonNull private String link;
    @NonNull private String name;
    @NonNull private String hash;
}
