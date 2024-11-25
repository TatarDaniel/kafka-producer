package com.apx.kafka.producer.service;

import com.apx.kafka.producer.config.InfoConvertor;
import com.apx.kafka.producer.model.InfoDTO;
import com.apx.kafka.producer.model.InfoEntity;
import com.apx.kafka.producer.repository.InfoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InfoService {

    private final InfoRepository infoRepository;
    private final InfoConvertor infoConvertor;

    public InfoService(final InfoRepository infoRepository, final InfoConvertor infoConvertor) {
        this.infoRepository = infoRepository;
        this.infoConvertor = infoConvertor;
    }

    public List<InfoDTO> getInfo(InfoDTO infoDTO) {
        List<InfoEntity> infoEntity = infoRepository.findAll();
        List<InfoDTO> infoDTOs = new ArrayList<>();
        for(InfoEntity infoEntity1 : infoEntity) {
            infoDTOs.add(infoConvertor.convertToInfoDTO(infoEntity1));
        }
        return infoDTOs;
    }
}
