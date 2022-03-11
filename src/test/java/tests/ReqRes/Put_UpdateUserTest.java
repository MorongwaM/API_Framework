package tests.ReqRes;
import io.qameta.allure.*;
import io.restassured.response.Response;
import io.restassured.response.Validatable;
import org.testng.annotations.Test;
import static common.RequestBuilder.*;
import static common.CommonTestData.*;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import org.json.simple.JSONObject;


@Feature("tests.ReqRes API")
@Story("Update(Put) User")
@Test

public class Put_UpdateUserTest {


    @Description("As an API User, I want to Update a User")
    @Severity(SeverityLevel.TRIVIAL)
    public void updateUsertest() {
        UpdateUserResponse().
                then().
                assertThat().
                statusCode(SUCCESS_STATUS_CODE).
                body("name", containsString("Morongwa")).
                body("job", containsString("Test Engineer"));


    }
}
