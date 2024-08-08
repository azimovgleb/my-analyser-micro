package org.example.dataanalysermicroservice.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.dataanalysermicroservice.model.Data;
import org.example.dataanalysermicroservice.repository.DataRepository;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class KafkaDataServiceImpl implements KafkaDataService{

    private final DataRepository dataRepository;

    @Override
    public void handle(Data data) {
        log.info("Data object {} was saved", data);
        dataRepository.save(data);
    }

}
