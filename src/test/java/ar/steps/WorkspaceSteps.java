package ar.steps;
import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;

import services.BaseService;
import services.WorkspaceService;


public class WorkspaceSteps extends PageSteps {
    @And("get workspaceId")
    public void getWorkspaceId() {
        BaseService.WORKSPACE_ID.set(WorkspaceService.getWorkspaceId());
    }

    @And("^get message (.*)$")
    public void get(String message) {
        WorkspaceService.errorMessage(message);
    }
}
