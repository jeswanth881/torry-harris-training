package com.torryharris.train.newtrain.repository;


import com.torryharris.train.newtrain.model.Train;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TrainRepository extends CrudRepository<Train,Integer> {
    List<Train> findBySourcePointAndDestinationPoint(String sourcePoint, String destinationPoint);
}
