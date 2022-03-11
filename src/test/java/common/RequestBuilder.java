package common;
import io.restassured.response.Response;
import  static  common.BasePaths.*;
import static common.ContentType.ReqRes_ContentType;
import static common.PayloadBuilder.UpdateUserObject;
import static common.PayloadBuilder.createNewUserObject;
import  static  io.restassured.RestAssured.given;


public class RequestBuilder {

    public static Response getBreedListResponse() {
        return given().
                when().
                get(BREEDS_BASE_PATH + "/list/all").
                then().
                log().all().
                extract().response();
    }

    public static Response getRandomimageSubBreedResponse() {
        return given().
                when().
                get(SUB_BREEDS_PATH + "/retriever/golden/images/random").
                then().
                log().all().
                extract().response();
    }

    public static Response getAllUsersResponse() {
        return given().
                when().
                get(LIST_USERS).
                then().
                log().all().
                extract().response();
    }

    public static Response createNewUserResponse() {
        return given().
                when().
                body(createNewUserObject()).
                contentType(ReqRes_ContentType).
                log().all().
                post(Create_New_USER_PATH).
                then().
                log().all().
                extract().response();


    }

    public static Response UpdateUserResponse() {
        return given().when().body(UpdateUserObject()).
                contentType(ReqRes_ContentType).
                log().all().
                put(UPDATE_USER_PATH).
                then().
                log().all().
                extract().response();

    }

    public static Response PatchUserResponse() {
        return given().when().body(UpdateUserObject()).
                contentType(ReqRes_ContentType).
                log().all().
                put(UPDATE_USER_PATH).
                then().
                log().all().
                extract().response();


    }


    public static Response DeleteUserResponse() {
        return given().
                when().
                delete(UPDATE_USER_PATH).
                then().
                log().all().
                extract().response();

    }


}




