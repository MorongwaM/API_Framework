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
@Story("Post a Users")
@Test

public class Post_CreateNewUserTest {

    {

    }

        @Description("As an API User, I want to create a New User")
        @Severity(SeverityLevel.MINOR)
        public void CreateNewUsertest () {
            createNewUserResponse().
                    then().
                    assertThat().
                    statusCode(CREATE_SUCCESS_STATUS_CODE).
                    body("id",notNullValue()).
                    body("name",containsString("Morongwa")).
                    body("job",containsString("Test Engineer"));


        }


}
