package com.apx.kafka.producer.model;


import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class InfoDTO {
    private Long id;
    private String info;
}
