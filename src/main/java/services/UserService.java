package services;

import api.model.User.User;
import com.crowdar.api.rest.APIManager;
import com.crowdar.api.rest.Response;
import com.crowdar.core.PropertyManager;

import java.util.HashMap;
import java.util.Map;

public class UserService extends BaseService {
   public static Response get(String jsonName) {

      return get(jsonName, User[].class, setParams());
   }

   public static Map<String, String > setParams(){
      Map<String, String> params = new HashMap<String, String>();
      params.put("api.key", X_API_KEY.get());
      params.put("base.url", PropertyManager.getProperty("base.api.url"));
      params.put("workspace.id",WORKSPACE_ID.get());
      return params;
   }
   public static String getUserId(){
      User[] lastResponse = (User[]) APIManager.getLastResponse().getResponse();
      System.out.println("id_User ="+lastResponse[0].id);
      return lastResponse[0].id;
   }
}




