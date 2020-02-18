package com.kafka.consumer.springbootkafkaconsumer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author mzwandile on 2020/02/18
 * @project kafka
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String name;
    private String dept;
}
