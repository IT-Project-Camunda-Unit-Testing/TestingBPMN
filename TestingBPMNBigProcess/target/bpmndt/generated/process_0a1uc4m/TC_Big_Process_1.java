package generated.process_0a1uc4m;

import static org.camunda.bpm.engine.test.assertions.ProcessEngineTests.assertThat;

import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.camunda.community.bpmndt.api.AbstractJUnit4TestCase;
import org.camunda.community.bpmndt.api.CallActivityHandler;
import org.camunda.community.bpmndt.api.EventHandler;
import org.camunda.community.bpmndt.api.JobHandler;
import org.camunda.community.bpmndt.api.UserTaskHandler;
import org.junit.runner.Description;

/**
 * From: startEvent: Event_1h2pir3, To: endEvent: Event_10zrg5f, Length: 12
 */
public class TC_Big_Process_1 extends AbstractJUnit4TestCase {
  private UserTaskHandler Activity_0gad5d4;

  private EventHandler Event_1efui7x;

  private JobHandler Activity_1abu36nBefore;

  private CallActivityHandler Activity_1abu36n;

  @Override
  protected void starting(Description description) {
    super.starting(description);

    // userTask: Activity_0gad5d4
    Activity_0gad5d4 = new UserTaskHandler(getProcessEngine(), "Activity_0gad5d4");

    // intermediateCatchEvent: Event_1efui7x
    Event_1efui7x = new EventHandler(getProcessEngine(), "Event_1efui7x", "FakeMassage");

    // callActivity: Activity_1abu36n
    Activity_1abu36nBefore = new JobHandler(getProcessEngine(), "Activity_1abu36n");

    // callActivity: Activity_1abu36n
    Activity_1abu36n = new CallActivityHandler(instance, "Activity_1abu36n");
  }

  @Override
  protected void execute(ProcessInstance pi) {
    // startEvent: Event_1h2pir3
    assertThat(pi).hasPassed("Event_1h2pir3");

    // userTask: Activity_0gad5d4
    assertThat(pi).isWaitingAt("Activity_0gad5d4");
    instance.apply(Activity_0gad5d4);
    assertThat(pi).hasPassed("Activity_0gad5d4");

    // intermediateThrowEvent: Event_13ko2eq
    assertThat(pi).hasPassed("Event_13ko2eq");

    // intermediateCatchEvent: Event_1efui7x
    assertThat(pi).isWaitingAt("Event_1efui7x");
    instance.apply(Event_1efui7x);
    assertThat(pi).hasPassed("Event_1efui7x");

    // exclusiveGateway: Gateway_1g0iea8
    assertThat(pi).hasPassed("Gateway_1g0iea8");

    // businessRuleTask: Activity_1ayve8o
    assertThat(pi).hasPassed("Activity_1ayve8o");

    // parallelGateway: Gateway_1d0hzil
    assertThat(pi).hasPassed("Gateway_1d0hzil");

    // task: Activity_1y2xlyz
    assertThat(pi).hasPassed("Activity_1y2xlyz");

    // parallelGateway: Gateway_02uoolp
    assertThat(pi).hasPassed("Gateway_02uoolp");

    // scriptTask: Activity_0xud46i
    assertThat(pi).hasPassed("Activity_0xud46i");

    // callActivity: Activity_1abu36n
    assertThat(pi).isWaitingAt("Activity_1abu36n");
    instance.apply(Activity_1abu36nBefore);
    assertThat(pi).hasPassed("Activity_1abu36n");

    // endEvent: Event_10zrg5f
    assertThat(pi).hasPassed("Event_10zrg5f");
  }

  @Override
  protected String getBpmnResourceName() {
    return "Big-Process.bpmn";
  }

  @Override
  public String getEnd() {
    return "Event_10zrg5f";
  }

  @Override
  public String getProcessDefinitionKey() {
    return "Process_0a1uc4m";
  }

  @Override
  public String getStart() {
    return "Event_1h2pir3";
  }

  /**
   * Returns the handler for userTask: Activity_0gad5d4
   */
  public UserTaskHandler handleActivity_0gad5d4() {
    return Activity_0gad5d4;
  }

  /**
   * Returns the handler for intermediateCatchEvent: Event_1efui7x
   */
  public EventHandler handleEvent_1efui7x() {
    return Event_1efui7x;
  }

  /**
   * Returns the handler for callActivity: Activity_1abu36n
   */
  public CallActivityHandler handleActivity_1abu36n() {
    return Activity_1abu36n;
  }
}
