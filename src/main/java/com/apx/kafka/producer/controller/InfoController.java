package com.apx.kafka.producer.controller;

import com.apx.kafka.producer.model.InfoDTO;
import com.apx.kafka.producer.service.InfoService;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class InfoController {

    private final InfoService infoService;

    private KafkaTemplate<String, String> kafkaTemplate;

    public InfoController(final InfoService infoService, final KafkaTemplate<String, String> kafkaTemplate) {
        this.infoService = infoService;
        this.kafkaTemplate = kafkaTemplate;
    }

    @GetMapping("/info")
    public List<InfoDTO> getAll(InfoDTO infoDTO) {
        return infoService.getInfo(infoDTO);
    }

    @PostMapping("/send")
    public String sendMessage(@RequestBody String message) {
        kafkaTemplate.send("test-topic", message);
        return "Message sent to Kafka!";
    }
}
