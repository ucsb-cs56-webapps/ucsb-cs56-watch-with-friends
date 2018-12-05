package edu.ucsb.cs56.watchapp.springboot.watchwithfriends;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;


@Data
public class WatchModel {
    private String roomName;
    private String roomHash;
    private String ID;

    @Autowired
    private WatchCodeRepository repository;

    public void showDatabase() {
        repository.save(new WatchCode("default", roomName, roomHash));
    }

    public String getRoomName() {
        return "stub";
    }

    public void setID(String ID) {
	  this.ID = ID;
    }
    public String getID(){
       return ID;
    }
    public String getURL(){
       return "https://www.youtube.com/embed/l5zJW-BL648";
    }
}
