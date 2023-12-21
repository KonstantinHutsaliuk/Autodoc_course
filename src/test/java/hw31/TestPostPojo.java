package hw31;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static lesson31.Specification.*;
import static org.hamcrest.Matchers.notNullValue;

public class TestPostPojo {
    private final String BASE_URL = "https://reqres.in/";

    @Test
    public void testPostWithPojo() {
        installSpec(requestSpecification(BASE_URL), responseSpecification(201));
        CreateData createData = new CreateData("morpheus", "leader");
        SuccessRegData successRegData = given()
                .when()
                .body(createData)
                .post("api/users")
                .then().log().all()
                .body("id", notNullValue())
                .body("createdAt", notNullValue())
                .extract()
                .as(SuccessRegData.class);

        Assert.assertEquals(createData.getName(), successRegData.getName());
        Assert.assertEquals(createData.getJob(), successRegData.getJob());

    }
}
