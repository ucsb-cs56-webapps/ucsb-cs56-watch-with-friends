package edu.ucsb.cs56.watchapp.springboot.watchwithfriends;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface WatchCodeRepository extends MongoRepository<WatchCode, String> {
    public WatchCode findByHash(String hash);
}
