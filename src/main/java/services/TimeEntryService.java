package services;

import api.model.Entry.Entry;
import com.crowdar.api.rest.APIManager;
import com.crowdar.api.rest.Response;
import com.crowdar.core.PropertyManager;

import java.util.HashMap;
import java.util.Map;

public class TimeEntryService extends BaseService {
   public static Response get(String jsonName) {
      return get(jsonName, Entry[].class, setParams());
   }
   public static Response post(String jsonName) {
      return post(jsonName, Entry.class, setParamsPost());
   }
   public static Response delete(String jsonName) {
      return delete(jsonName,Entry.class, setParamsDelete());
   }
   public static Response put(String jsonName) {
      return put(jsonName,Entry.class, setParamsDelete());
   }
   public static Map<String, String > setParams(){
      Map<String, String> params = new HashMap<String, String>();
      params.put("api.key", X_API_KEY.get());
      params.put("base.url", PropertyManager.getProperty("base.api.url"));
      params.put("workspace.id",WORKSPACE_ID.get());
      params.put("user.id",USER_ID.get());
      return params;
   }
   public static Map<String, String > setParamsPost(){
      Map<String, String> params = new HashMap<String, String>();
      params.put("api.key", X_API_KEY.get());
      params.put("base.url", PropertyManager.getProperty("base.api.url"));
      params.put("workspace.id",WORKSPACE_ID.get());
      return params;
   }
   public static Map<String, String > setParamsDelete(){
      Map<String, String> params = new HashMap<String, String>();
      params.put("api.key", X_API_KEY.get());
      params.put("base.url", PropertyManager.getProperty("base.api.url"));
      params.put("workspace.id",WORKSPACE_ID.get());
      params.put("timeEntry.id", ENTRY_ID.get());
      return params;
   }

   public static String getTimeEntriesId(){
      Entry[] lastResponse = (Entry[]) APIManager.getLastResponse().getResponse();
      System.out.println("id_Entry ="+lastResponse[0].id);
      return lastResponse[0].id;
   }
   public static String getTimeEntryId(){
      Entry lastResponse = (Entry) APIManager.getLastResponse().getResponse();
      System.out.println("id_Entry ="+lastResponse.id);
      return lastResponse.id;
   }
}




