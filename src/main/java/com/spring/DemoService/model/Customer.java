package com.spring.DemoService.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Customer {
    private String firstName;
    private String lastName;
    private Integer id;


}
