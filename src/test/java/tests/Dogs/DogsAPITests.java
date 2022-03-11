package tests.Dogs;
import io.qameta.allure.*;
import io.restassured.response.Response;
import io.restassured.response.Validatable;
import org.testng.annotations.Test;
import static common.RequestBuilder.*;
import static common.CommonTestData.*;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

@Feature("tests.Dogs API")
@Story("Get Breeds List")
@Test

public class DogsAPITests {


    @Description("As an API User, I want to view the list of all breeds")
    @Severity(SeverityLevel.CRITICAL)
    public void getbreedsListtest() {
        getBreedListResponse().
                then().
                assertThat().
                statusCode(SUCCESS_STATUS_CODE);

    }

    @Description("As an API User, I want to verify that retriever is in the list")
    @Severity(SeverityLevel.NORMAL)
    public void getBreedsListAndVerifyRetriverIsInThetest() {
        getBreedListResponse().
                then().
                assertThat().
                statusCode(SUCCESS_STATUS_CODE).body(containsString("retriever"));

    }


    @Description("As an API User, I want to see random images")
    @Severity(SeverityLevel.BLOCKER)
    public void getRandomImageSubBreedsGoldenTest() {
        getRandomimageSubBreedResponse().
                then().
                assertThat().
                statusCode(SUCCESS_STATUS_CODE).
                body(containsString("success"));
    }



}


