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
@Story("Get List Users")
@Test


public class GetAllUsersTest {

    @Description("Get the list of all  users for ReqRes")
    @Severity(SeverityLevel.CRITICAL)
    public void getListOfUsersForReqRestest() {
        getAllUsersResponse().
                then().
                assertThat().
                statusCode(SUCCESS_STATUS_CODE);

    }


    }
