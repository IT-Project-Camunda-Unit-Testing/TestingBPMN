package generated.process_1ijt5ts;

import static org.camunda.bpm.engine.test.assertions.ProcessEngineTests.assertThat;

import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.camunda.community.bpmndt.api.AbstractJUnit4TestCase;
import org.junit.runner.Description;

/**
 * From: startEvent: StartEvent_1, To: endEvent: Event_065sisz, Length: 5
 */
public class TC_12_2b_Gatways_AND_AND_b extends AbstractJUnit4TestCase {
  @Override
  protected void starting(Description description) {
    super.starting(description);
  }

  @Override
  protected void execute(ProcessInstance pi) {
    // startEvent: StartEvent_1
    assertThat(pi).hasPassed("StartEvent_1");

    // parallelGateway: Gateway_11e2p5i
    assertThat(pi).hasPassed("Gateway_11e2p5i");

    // task: Activity_0l9uuor
    assertThat(pi).hasPassed("Activity_0l9uuor");

    // parallelGateway: Gateway_0pnudga
    assertThat(pi).hasPassed("Gateway_0pnudga");

    // endEvent: Event_065sisz
    assertThat(pi).hasPassed("Event_065sisz");
  }

  @Override
  protected String getBpmnResourceName() {
    return "12-2-Gateway-AND-AND.bpmn";
  }

  @Override
  public String getEnd() {
    return "Event_065sisz";
  }

  @Override
  public String getProcessDefinitionKey() {
    return "Process_1ijt5ts";
  }

  @Override
  public String getStart() {
    return "StartEvent_1";
  }
}
