package com.davi.paisesinfo.repository;

import com.davi.paisesinfo.model.PaisesInfo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PaisesInfoRepository extends MongoRepository<PaisesInfo, String> {
    Optional<PaisesInfo> findByIsoAlfa3(String isoAlfa3);
}
