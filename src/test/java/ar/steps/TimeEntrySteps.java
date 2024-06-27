package ar.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import services.BaseService;
import services.ClientService;
import services.TimeEntryService;
import services.UserService;


public class TimeEntrySteps extends PageSteps {
    @And("get timeEntriesId")
    public void getTimeEntriesId() {
            BaseService.ENTRY_ID.set(TimeEntryService.getTimeEntriesId());
        }
    @And("get timeEntryId")
    public void getTimeEntryId() {
        BaseService.ENTRY_ID.set(TimeEntryService.getTimeEntryId());
    }
}

