package edu.ucsb.cs56.watchapp.springboot.watchwithfriends;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Data
public class WatchModel {
    private String roomName;
    private String roomHash;
    private String URL;

    @Autowired
    private WatchCodeRepository repository;

    public void showDatabase() {
        repository.save(new WatchCode("none", roomName, roomHash));
    }

    public void getData() {
       WatchCode wc = repository.findByHash(roomHash); 
       URL = wc.getLink(); 
       roomName = wc.getName();
       roomHash = wc.getHash();
    }
    public void setVid(String id, String vid){
       repository.save(new WatchCode(vid, "", id+""));
    }
    public String getRoomName() {
        return "name";
        //return roomName;
    }
    public void create(String id){
        repository.save(new WatchCode("none", "name", id));
    }

    public void setID(String ID) {
	  roomHash = ID;
    }
    public String getID(){
       return "123";
       //return roomHash;
    }
    public String getURL(){
       return "https://www.youtube.com//qAuHpmM6_2c";
       //return URL;
    }
}
