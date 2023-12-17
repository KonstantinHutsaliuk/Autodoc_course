package lesson31.registration;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static lesson31.Specification.*;

public class TestUnsuccessRegWithPojo {
    private final String BASE_URL = "https://reqres.in/";
    private final String EXPECTED_ERROR = "Missing password";

    @Test
    public void testSuccessRegWithPojo() {
        installSpec(requestSpecification(BASE_URL), responseSpecification(400));

        Register register = new Register("eve.holt@reqres.in");
        UnSuccessReg unSuccessReg = given()
                .body(register)
                .when()
                .post("api/register")
                .then().log().all()
                .extract().as(UnSuccessReg.class);

        Assert.assertEquals(unSuccessReg.getError(), EXPECTED_ERROR);

    }
}
