package com.cloud.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class User {
    private Long id;
    private String username;
    private Integer age;
}
