package generated.process_1r9rtcm;

import static org.camunda.bpm.engine.test.assertions.ProcessEngineTests.assertThat;

import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.camunda.community.bpmndt.api.AbstractJUnit4TestCase;
import org.camunda.community.bpmndt.api.UserTaskHandler;
import org.junit.runner.Description;

/**
 * From: startEvent: StartEvent_1, To: endEvent: Event_1ricljh, Length: 3
 */
public class TC_26_Call_Activity_2 extends AbstractJUnit4TestCase {
  private UserTaskHandler Activity_0ztrxmv;

  @Override
  protected void starting(Description description) {
    super.starting(description);

    // userTask: Activity_0ztrxmv
    Activity_0ztrxmv = new UserTaskHandler(getProcessEngine(), "Activity_0ztrxmv");
  }

  @Override
  protected void execute(ProcessInstance pi) {
    // startEvent: StartEvent_1
    assertThat(pi).hasPassed("StartEvent_1");

    // userTask: Activity_0ztrxmv
    assertThat(pi).isWaitingAt("Activity_0ztrxmv");
    instance.apply(Activity_0ztrxmv);
    assertThat(pi).hasPassed("Activity_0ztrxmv");

    // endEvent: Event_1ricljh
    assertThat(pi).hasPassed("Event_1ricljh");
  }

  @Override
  protected String getBpmnResourceName() {
    return "26-Call-Activity-2.bpmn";
  }

  @Override
  public String getEnd() {
    return "Event_1ricljh";
  }

  @Override
  public String getProcessDefinitionKey() {
    return "Process_1r9rtcm";
  }

  @Override
  public String getStart() {
    return "StartEvent_1";
  }

  /**
   * Returns the handler for userTask: Activity_0ztrxmv
   */
  public UserTaskHandler handleActivity_0ztrxmv() {
    return Activity_0ztrxmv;
  }
}
