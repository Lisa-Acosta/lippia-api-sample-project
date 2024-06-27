package ar.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import services.BaseService;
import services.UserService;


public class UserSteps extends PageSteps {
    @And("get userId")
    public void getUserId() {
        BaseService.USER_ID.set(UserService.getUserId());
    }
}
