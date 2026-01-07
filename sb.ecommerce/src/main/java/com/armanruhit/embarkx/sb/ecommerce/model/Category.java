package com.armanruhit.embarkx.sb.ecommerce.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Category {
    private Long categoryId;
    private String categoryName;
}
