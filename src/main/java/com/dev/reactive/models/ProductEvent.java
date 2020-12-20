package com.dev.reactive.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
public class ProductEvent {
    private Long eventId;
    private String  eventName;
}
