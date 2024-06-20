package services;

import api.model.Workspaces.Workspace;
import com.crowdar.api.rest.APIManager;
import com.crowdar.api.rest.Response;
import com.crowdar.core.PropertyManager;

import java.util.HashMap;
import java.util.Map;

public class WorkspaceService extends BaseService {

    public static Response get(String jsonName) {

        return get(jsonName, Workspace[].class, setParams());
    }

    public static Map<String, String> setParams() {
        Map<String, String> params = new HashMap<String, String>();
        params.put("api.key", PropertyManager.getProperty("x.api.key"));
        params.put("base.url", PropertyManager.getProperty("base.api.url"));
        return params;
    }

    public static String getWorkspaceId() {
        Workspace[] lastResponse = (Workspace[]) APIManager.getLastResponse().getResponse();
        System.out.println("id_Workspace =" + lastResponse[4].id);
        System.out.println("name ="+lastResponse[4].name);
        return lastResponse[4].id;
    }

    public static void errorMessage(String message) {
        System.out.println("Error Message =" +message);
    }

}


