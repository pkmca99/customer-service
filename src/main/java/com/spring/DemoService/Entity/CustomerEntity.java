package com.spring.DemoService.Entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

}
