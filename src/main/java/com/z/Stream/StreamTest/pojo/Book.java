package com.z.Stream.StreamTest.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @athor Fly
 * @data 2022/10/10 16:16
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Book {

    private Long id;
    private String name;
    private String category;
    private Integer score;
    private String intro;

}
