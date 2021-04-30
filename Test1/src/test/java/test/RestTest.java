package test;

import org.junit.platform.commons.annotation.Testable;

public class RestTest {

    @Test
    public  void get() {
        when().
        get("https://jsonplaceholder.typicode.com/todos/1").
        than().
        statusCode(200).
                assertThat().body("id", equalTo("1"), "title", equalTo("delectus aut autem"));
        Response response = get("https://jsonplaceholder.typicode.com/todos/1");

    }
    @Test
    public  void post() {

        given().
                contetntType("application/json").body("{\n" +
                "  \"userId\": 2,\n" +
                "  \"id\": 2,\n" +
                "  \"title\": \"hey\",\n" +
                "  \"completed\": tried\n" +
                "}").
                when().
                post("https://jsonplaceholder.typicode.com/todos/1").
                than().
                statusCode(201).


    }
}
