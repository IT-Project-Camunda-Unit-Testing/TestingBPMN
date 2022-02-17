package generated.process_16rf89n;

import static org.camunda.bpm.engine.test.assertions.ProcessEngineTests.assertThat;

import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.camunda.community.bpmndt.api.AbstractJUnit4TestCase;
import org.camunda.community.bpmndt.api.UserTaskHandler;
import org.junit.runner.Description;

/**
 * From: startEvent: StartEvent_1, To: endEvent: Event_1n4wb38, Length: 4
 */
public class TC_11a_Gateway_XOR_true extends AbstractJUnit4TestCase {
  private UserTaskHandler Activity_0qw1xmf;

  @Override
  protected void starting(Description description) {
    super.starting(description);

    // userTask: Activity_0qw1xmf
    Activity_0qw1xmf = new UserTaskHandler(getProcessEngine(), "Activity_0qw1xmf");
  }

  @Override
  protected void execute(ProcessInstance pi) {
    // startEvent: StartEvent_1
    assertThat(pi).hasPassed("StartEvent_1");

    // userTask: Activity_0qw1xmf
    assertThat(pi).isWaitingAt("Activity_0qw1xmf");
    instance.apply(Activity_0qw1xmf);
    assertThat(pi).hasPassed("Activity_0qw1xmf");

    // exclusiveGateway: Gateway_0er57qe
    assertThat(pi).hasPassed("Gateway_0er57qe");

    // endEvent: Event_1n4wb38
    assertThat(pi).hasPassed("Event_1n4wb38");
  }

  @Override
  protected String getBpmnResourceName() {
    return "11-Gateway-XOR.bpmn";
  }

  @Override
  public String getEnd() {
    return "Event_1n4wb38";
  }

  @Override
  public String getProcessDefinitionKey() {
    return "Process_16rf89n";
  }

  @Override
  public String getStart() {
    return "StartEvent_1";
  }

  /**
   * Returns the handler for userTask: Activity_0qw1xmf
   */
  public UserTaskHandler handleActivity_0qw1xmf() {
    return Activity_0qw1xmf;
  }
}
