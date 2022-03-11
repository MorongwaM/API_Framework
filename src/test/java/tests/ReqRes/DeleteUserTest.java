package tests.ReqRes;
import io.qameta.allure.*;
import org.testng.annotations.Test;
import static common.RequestBuilder.*;
import static common.CommonTestData.*;

@Feature("tests.ReqRes API")
@Story("Update(Put) User")
@Test

public class DeleteUserTest {

    @Description("As an API User, I want to Delete a User")
    @Severity(SeverityLevel.BLOCKER)
    public void deleteUsertest() {
        DeleteUserResponse().
                then().
                assertThat().
                statusCode(DELETE_SUCCESS_STATUS_CODE);

    }

}
