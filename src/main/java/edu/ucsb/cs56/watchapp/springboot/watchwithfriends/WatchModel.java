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

    public void setRoom(string ID) {
	this.ID = ID;
    }

    @Override
    public String toString(){
	    return ID;
    }
}
