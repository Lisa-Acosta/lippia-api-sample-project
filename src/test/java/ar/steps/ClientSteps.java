package ar.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import services.BaseService;
import services.ClientService;


public class ClientSteps extends PageSteps {
    @And("get clientId")
    public void getClientId() {
        BaseService.CLIENT_ID.set(ClientService.getClientId());
    }

}
