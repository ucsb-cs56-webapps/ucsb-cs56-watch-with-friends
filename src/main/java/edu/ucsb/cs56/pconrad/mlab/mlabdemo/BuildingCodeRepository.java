package edu.ucsb.cs56.pconrad.mlab.mlabdemo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface BuildingCodeRepository extends MongoRepository<BuildingCode, String> {
    public BuildingCode findByCode(String code);
}
