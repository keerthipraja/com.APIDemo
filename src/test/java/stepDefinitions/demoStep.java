package stepDefinitions;

import io.cucumber.java.en.*;
import pojo.jsonBody;

public class demoStep {
    @Given("dfgh")
    public void dfgh() {
       jsonBody payload=new jsonBody();
      // payload.setJob("manual test");
        System.out.println(payload.getJob());
    }
    @When("dddd")
    public void dddd() {
        jsonBody payload=new jsonBody();
        payload.setJob("manual test");
        System.out.println(payload.getJob());
    }
}
