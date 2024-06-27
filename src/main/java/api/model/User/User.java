package api.model.User;

import java.util.ArrayList;

public class User {
    public String id;
    public String email;
    public String name;
    public ArrayList<Object> memberships;
    public String profilePicture;
    public String activeWorkspace;
    public String defaultWorkspace;
    public Settings settings;
    public String status;
    public ArrayList<Object> customFields;
}
