package com.z.Stream.StreamTest;

import com.z.Stream.StreamTest.pojo.Author;
import com.z.Stream.StreamTest.pojo.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @athor Fly
 * @data 2022/10/11 17:01
 * @Version 1.0
 */
public class OptionalTest {

    public static void main(String[] args) {
//        Optional<Author> authors = Optional.ofNullable(getAuthors());
//        authors.ifPresent(author -> System.out.println(author));

        Optional<Author> optionalAuthor = getOptionalAuthor();
//      optionalAuthor.ifPresent(author -> System.out.println(author));
//      Author author = optionalAuthor.orElseGet(() -> new Author());
//      System.out.println(author);

        //filter() 过滤
        Optional<Author> author1 = optionalAuthor.filter(author -> author.getAge() > 10);
//      author1.ifPresent(author -> System.out.println(author));

        //isPresent() 非空返回true 为空返回false
//        if(author1.isPresent()){
//            System.out.println(author1.get().getName());
//            System.out.println(author1.get().getAge());
//            System.out.println(author1.get().getIntro());
//        }

        Optional<List<Book>> books = author1.map(author -> author.getBooks());
        books.ifPresent(books1 -> System.out.println(books1));


//        try {
//            Author author1 = optionalAuthor.orElseThrow(() -> new RuntimeException("数据为空"));
//            System.out.println(author1);
//        } catch (Throwable e) {
//            e.printStackTrace();
//        }


//        Optional<Author> authorNull = Optional.of(getAuthors());
//        System.out.println(authorNull);

    }

    public static ArrayList<Author> getListAuthors() {
        Author author = new Author(1L, "余华", 33, "活着", null);
        Author author1 = new Author(1L, "莫言", 43, "活着", null);
        ArrayList<Author> arrayList = new ArrayList<>(Arrays.asList(author,author1));
        return arrayList;
    }

    public static Optional<ArrayList<Author>> getOptionalListAuthor() {
        Author author = new Author(1L, "余华", 33, "活着", null);
        Author author1 = new Author(1L, "莫言", 43, "活着", null);
        ArrayList<Author> arrayList = new ArrayList<>(Arrays.asList(author,author1));
        return Optional.ofNullable(arrayList);
    }

    public static Author getAuthors() {
        Author author = new Author(1L, "余华", 33, "活着", null);
        return author;
    }

    public static Optional<Author> getOptionalAuthor() {
        Author author1 = new Author(1L, "莫言", 43, "活着", null);
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book(1L,"刀的两侧是光明与黑暗","哲学,爱情",88,"用一把刀划分了爱情"));
        bookList.add(new Book(2L,"一个人不能死在同一把刀下","个人成长,爱情",99,"讲述如何从失败中明悟真理"));
        author1.setBooks(bookList);
        return Optional.ofNullable(author1);
    }

}
