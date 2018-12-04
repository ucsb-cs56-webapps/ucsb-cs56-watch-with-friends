package edu.ucsb.cs56.watchapp.springboot.watchwithfriends;

import lombok.Data;
import 


@Data
public class WatchModel {
    private String roomName;
    private String roomHash;

    @Autowired
    private WatchCodeRepository repository;

    public void showDatabase() {
        repository.save(new WatchCode("default", roomName, roomHash));
        for (WatchCode wc : repository.findByHash()) {
            System.out.println(wc);
        }
    }
}
