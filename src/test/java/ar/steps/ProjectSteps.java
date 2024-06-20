package ar.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import services.BaseService;
import services.ProjectService;


public class ProjectSteps extends PageSteps {
    @And("get projectId")
    public void getProjectId() {
        BaseService.PROJECT_ID.set(ProjectService.getProjectId());
    }
}
