package generated.process_122zdl7;

import static org.camunda.bpm.engine.test.assertions.ProcessEngineTests.assertThat;

import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.camunda.community.bpmndt.api.AbstractJUnit4TestCase;
import org.camunda.community.bpmndt.api.UserTaskHandler;
import org.junit.runner.Description;

/**
 * From: startEvent: StartEvent_1, To: endEvent: Event_0wugyb3, Length: 6
 */
public class TC_24_Error_Event2 extends AbstractJUnit4TestCase {
  private UserTaskHandler Activity_1lput3k;

  @Override
  protected void starting(Description description) {
    super.starting(description);

    // userTask: Activity_1lput3k
    Activity_1lput3k = new UserTaskHandler(getProcessEngine(), "Activity_1lput3k");
  }

  @Override
  protected void execute(ProcessInstance pi) {
    // startEvent: StartEvent_1
    assertThat(pi).hasPassed("StartEvent_1");

    // userTask: Activity_1lput3k
    assertThat(pi).isWaitingAt("Activity_1lput3k");
    instance.apply(Activity_1lput3k);
    assertThat(pi).hasPassed("Activity_1lput3k");

    // exclusiveGateway: Gateway_1qqviba
    assertThat(pi).hasPassed("Gateway_1qqviba");

    // serviceTask: Activity_0j5s04e
    assertThat(pi).hasPassed("Activity_0j5s04e");

    // boundaryEvent: Event_1bahl10
    assertThat(pi).hasPassed("Event_1bahl10");

    // endEvent: Event_0wugyb3
    assertThat(pi).hasPassed("Event_0wugyb3");
  }

  @Override
  protected String getBpmnResourceName() {
    return "24-Error-Event.bpmn";
  }

  @Override
  public String getEnd() {
    return "Event_0wugyb3";
  }

  @Override
  public String getProcessDefinitionKey() {
    return "Process_122zdl7";
  }

  @Override
  public String getStart() {
    return "StartEvent_1";
  }

  /**
   * Returns the handler for userTask: Activity_1lput3k
   */
  public UserTaskHandler handleActivity_1lput3k() {
    return Activity_1lput3k;
  }
}
