package com.apx.kafka.producer.config;


import com.apx.kafka.producer.model.InfoDTO;
import com.apx.kafka.producer.model.InfoEntity;
import org.springframework.stereotype.Component;

@Component
public class InfoConvertor {

    public InfoConvertor() {}

    public InfoEntity convertToInfoEntity(InfoDTO infoDTO) {
        return InfoEntity.builder()
                .info(infoDTO.getInfo())
                .build();
    }

    public InfoDTO convertToInfoDTO(InfoEntity infoEntity) {
        return InfoDTO.builder()
                .id(infoEntity.getId())
                .info(infoEntity.getInfo())
                .build();
    }
}
