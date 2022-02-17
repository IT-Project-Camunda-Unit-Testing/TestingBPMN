package generated.process_1dxzyrd;

import static org.camunda.bpm.engine.test.assertions.ProcessEngineTests.assertThat;

import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.camunda.community.bpmndt.api.AbstractJUnit4TestCase;
import org.camunda.community.bpmndt.api.UserTaskHandler;
import org.junit.runner.Description;

/**
 * From: startEvent: StartEvent_1, To: endEvent: Event_10c6k2y, Length: 3
 */
public class TC_03_Aufgabe_Benutzer extends AbstractJUnit4TestCase {
  private UserTaskHandler Activity_1ve37kh;

  @Override
  protected void starting(Description description) {
    super.starting(description);

    // userTask: Activity_1ve37kh
    Activity_1ve37kh = new UserTaskHandler(getProcessEngine(), "Activity_1ve37kh");
  }

  @Override
  protected void execute(ProcessInstance pi) {
    // startEvent: StartEvent_1
    assertThat(pi).hasPassed("StartEvent_1");

    // userTask: Activity_1ve37kh
    assertThat(pi).isWaitingAt("Activity_1ve37kh");
    instance.apply(Activity_1ve37kh);
    assertThat(pi).hasPassed("Activity_1ve37kh");

    // endEvent: Event_10c6k2y
    assertThat(pi).hasPassed("Event_10c6k2y");
  }

  @Override
  protected String getBpmnResourceName() {
    return "03-Aufgabe-Benutzer.bpmn";
  }

  @Override
  public String getEnd() {
    return "Event_10c6k2y";
  }

  @Override
  public String getProcessDefinitionKey() {
    return "Process_1dxzyrd";
  }

  @Override
  public String getStart() {
    return "StartEvent_1";
  }

  /**
   * Returns the handler for userTask: Activity_1ve37kh
   */
  public UserTaskHandler handleActivity_1ve37kh() {
    return Activity_1ve37kh;
  }
}
