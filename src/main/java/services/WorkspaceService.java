package services;
import api.model.Workspace;
import com.crowdar.api.rest.APIManager;
import com.crowdar.api.rest.Response;
import com.crowdar.core.PropertyManager;

import java.util.HashMap;
import java.util.Map;

public class WorkspaceService extends BaseService {

    public static Response get(String jsonName) {

        return get(jsonName, Workspace[].class, setParams());
    }


    public static Map<String, String > setParams(){
        Map<String, String> params = new HashMap<String, String>();
        params.put("api.key", X_API_KEY.get());
        params.put("base.url", PropertyManager.getProperty("base.api.url"));
        return params;
    }
    public static String getWorkspaceId(){
        Workspace[] lastResponse = (Workspace[]) APIManager.getLastResponse().getResponse();
        System.out.println("id_Workspace ="+lastResponse[1].id);
        return lastResponse[1].id;
    }
    public static void errorMessage(String message){
        System.out.println("Error Message ="+message);
    }
}


