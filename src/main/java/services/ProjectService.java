package services;
import api.model.Project.AddProject;
import api.model.Workspaces.Workspace;
import com.crowdar.api.rest.APIManager;
import com.crowdar.api.rest.Response;
import com.crowdar.core.PropertyManager;

import java.util.HashMap;
import java.util.Map;

public class ProjectService extends BaseService {

    public static Response post(String jsonName) {

        return post(jsonName, AddProject.class, setParams());
    }


    public static Map<String, String > setParams(){
        Map<String, String> params = new HashMap<String, String>();
        params.put("api.key", X_API_KEY.get());
        params.put("base.url", PropertyManager.getProperty("base.api.url"));
        params.put("workspace.id", WORKSPACE_ID.get());
        return params;
    }
}


