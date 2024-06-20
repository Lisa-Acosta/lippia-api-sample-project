package services;
import api.model.Task.Task;
import com.crowdar.api.rest.Response;
import com.crowdar.core.PropertyManager;

import java.util.HashMap;
import java.util.Map;

public class TaskService extends BaseService {
    public static Response get(String jsonName) {
        return get(jsonName, Task[].class, setParams());
    }

    public static Response post(String jsonName) {
        return post(jsonName, Task.class, setParams());
    }


    public static Map<String, String > setParams(){
        Map<String, String> params = new HashMap<String, String>();
        params.put("api.key", X_API_KEY.get());
        params.put("base.url", PropertyManager.getProperty("base.api.url"));
        params.put("workspace.id", WORKSPACE_ID.get());
        params.put("project.id", PROJECT_ID.get());
        return params;
    }

}


