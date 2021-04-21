package com.sxl.learn;

import com.sxl.learn.entity.Book;
import io.restassured.RestAssured;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;

import io.restassured.response.Response;

import java.util.List;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class SpringBootBootstrapTest {

    private static final String API_ROOT =
            "http://localhost:8081:/api/books";

    private Book createRandomBook(){
        Book book = new Book();
        book.setAuthor(randomAlphabetic(10));
        book.setAuthor(randomAlphabetic(15));
        return book;
    }

    private String createBookAsUri(Book book){
        Response response = RestAssured.given()
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .body(book)
                .post(API_ROOT);
        return API_ROOT+"/"+response.jsonPath().getString("id");
    }

    @Test
    public void whenGetBooksByTitle_thenOk(){
        Book book = createRandomBook();
        createBookAsUri(book);
        Response response = RestAssured.get(
                API_ROOT + "/title/"+book.getTitle());

        assertEquals(HttpStatus.OK.value(),response.getStatusCode());
    }

    @Test
    public void whenGetBooksByTitle_thenOK() {
        Book book = createRandomBook();
        createBookAsUri(book);
        Response response = RestAssured.get(
                API_ROOT + "/title/" + book.getTitle());

        assertEquals(HttpStatus.OK.value(), response.getStatusCode());
        assertTrue(response.as(List.class)
                .size() > 0);
    }


}
