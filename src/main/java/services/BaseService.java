package services;

import com.crowdar.api.rest.APIManager;
import com.crowdar.api.rest.MethodsService;
import com.google.instrumentation.stats.StatsContext;


public class BaseService extends MethodsService {

   public static final ThreadLocal<String> X_API_KEY = new ThreadLocal<>();
   public static final ThreadLocal<String> WORKSPACE_ID = new ThreadLocal<>();
   public static final ThreadLocal<String> CLIENT_ID = new ThreadLocal<>();
   public static final ThreadLocal<String> PROJECT_ID = new ThreadLocal<>();
   public static final ThreadLocal<String> USER_ID = new ThreadLocal<>();
   public static final ThreadLocal<String> ENTRY_ID = new ThreadLocal<>();

   public static void getResponseMessage() {
      String message = APIManager.getLastResponse().getMessage();
      System.out.println("Last Response Message ="+message);
   }
}


