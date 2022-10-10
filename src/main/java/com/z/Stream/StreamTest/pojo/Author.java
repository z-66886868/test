package com.z.Stream.StreamTest.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Objects;

/**
 * @athor Fly
 * @data 2022/10/10 16:12
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Author {

    private Long id;
    private String name;
    private Integer age;
    private String intro;
    private List<Book> books;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(id, author.id) &&
                Objects.equals(name, author.name) &&
                Objects.equals(age, author.age) &&
                Objects.equals(intro, author.intro)
                && Objects.equals(books, author.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, intro, books);
    }
}
