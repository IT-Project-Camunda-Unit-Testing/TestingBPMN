package generated.process_1j9q4qa;

import static org.camunda.bpm.engine.test.assertions.ProcessEngineTests.assertThat;

import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.camunda.community.bpmndt.api.AbstractJUnit4TestCase;
import org.camunda.community.bpmndt.api.UserTaskHandler;
import org.junit.runner.Description;

/**
 * From: startEvent: StartEvent_1, To: endEvent: Event_097pvti, Length: 5
 */
public class TC_25_Kompensation_Event1 extends AbstractJUnit4TestCase {
  private UserTaskHandler Activity_0bh6n9h;

  private UserTaskHandler Activity_1idrajh;

  @Override
  protected void starting(Description description) {
    super.starting(description);

    // userTask: Activity_0bh6n9h
    Activity_0bh6n9h = new UserTaskHandler(getProcessEngine(), "Activity_0bh6n9h");

    // userTask: Activity_1idrajh
    Activity_1idrajh = new UserTaskHandler(getProcessEngine(), "Activity_1idrajh");
  }

  @Override
  protected void execute(ProcessInstance pi) {
    // startEvent: StartEvent_1
    assertThat(pi).hasPassed("StartEvent_1");

    // userTask: Activity_0bh6n9h
    assertThat(pi).isWaitingAt("Activity_0bh6n9h");
    instance.apply(Activity_0bh6n9h);
    assertThat(pi).hasPassed("Activity_0bh6n9h");

    // userTask: Activity_1idrajh
    assertThat(pi).isWaitingAt("Activity_1idrajh");
    instance.apply(Activity_1idrajh);
    assertThat(pi).hasPassed("Activity_1idrajh");

    // exclusiveGateway: Gateway_0xtvqmq
    assertThat(pi).hasPassed("Gateway_0xtvqmq");

    // endEvent: Event_097pvti
    assertThat(pi).hasPassed("Event_097pvti");
  }

  @Override
  protected String getBpmnResourceName() {
    return "25-Kompensation-Event.bpmn";
  }

  @Override
  public String getEnd() {
    return "Event_097pvti";
  }

  @Override
  public String getProcessDefinitionKey() {
    return "Process_1j9q4qa";
  }

  @Override
  public String getStart() {
    return "StartEvent_1";
  }

  /**
   * Returns the handler for userTask: Activity_0bh6n9h
   */
  public UserTaskHandler handleActivity_0bh6n9h() {
    return Activity_0bh6n9h;
  }

  /**
   * Returns the handler for userTask: Activity_1idrajh
   */
  public UserTaskHandler handleActivity_1idrajh() {
    return Activity_1idrajh;
  }
}
