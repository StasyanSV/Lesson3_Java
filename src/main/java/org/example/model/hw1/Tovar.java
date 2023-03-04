package org.example.model.hw1;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Tovar {
    private String name;
    private Integer price;
    private Integer sort;
}
