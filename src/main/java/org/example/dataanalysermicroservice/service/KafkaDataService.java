package org.example.dataanalysermicroservice.service;

import org.example.dataanalysermicroservice.model.Data;

public interface KafkaDataService {

    void handle(Data data);
}
