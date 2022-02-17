package generated.process_1iqjuag;

import static org.camunda.bpm.engine.test.assertions.ProcessEngineTests.assertThat;

import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.camunda.community.bpmndt.api.AbstractJUnit4TestCase;
import org.junit.runner.Description;

/**
 * From: startEvent: StartEvent_1, To: endEvent: Event_1wl9s09, Length: 5
 */
public class TC_12_1a_Gateway_AND_XOR_PathA extends AbstractJUnit4TestCase {
  @Override
  protected void starting(Description description) {
    super.starting(description);
  }

  @Override
  protected void execute(ProcessInstance pi) {
    // startEvent: StartEvent_1
    assertThat(pi).hasPassed("StartEvent_1");

    // parallelGateway: Gateway_0m4bhjw
    assertThat(pi).hasPassed("Gateway_0m4bhjw");

    // task: Activity_0xkxmy7
    assertThat(pi).hasPassed("Activity_0xkxmy7");

    // exclusiveGateway: Gateway_087w7ss
    assertThat(pi).hasPassed("Gateway_087w7ss");

    // endEvent: Event_1wl9s09
    assertThat(pi).hasPassed("Event_1wl9s09");
  }

  @Override
  protected String getBpmnResourceName() {
    return "12-1-Gateway-AND-XOR.bpmn";
  }

  @Override
  public String getEnd() {
    return "Event_1wl9s09";
  }

  @Override
  public String getProcessDefinitionKey() {
    return "Process_1iqjuag";
  }

  @Override
  public String getStart() {
    return "StartEvent_1";
  }
}
