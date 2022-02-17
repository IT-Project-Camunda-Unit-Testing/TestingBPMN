package generated.process_1cmsy6d;

import static org.camunda.bpm.engine.test.assertions.ProcessEngineTests.assertThat;

import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.camunda.community.bpmndt.api.AbstractJUnit4TestCase;
import org.junit.runner.Description;

/**
 * From: startEvent: StartEvent_1, To: endEvent: Event_11c266p, Length: 3
 */
public class TC_a_senden extends AbstractJUnit4TestCase {
  @Override
  protected void starting(Description description) {
    super.starting(description);
  }

  @Override
  protected void execute(ProcessInstance pi) {
    // startEvent: StartEvent_1
    assertThat(pi).hasPassed("StartEvent_1");

    // sendTask: Activity_0l2rwov
    assertThat(pi).hasPassed("Activity_0l2rwov");

    // endEvent: Event_11c266p
    assertThat(pi).hasPassed("Event_11c266p");
  }

  @Override
  protected String getBpmnResourceName() {
    return "01-AufgabeSenden.bpmn";
  }

  @Override
  public String getEnd() {
    return "Event_11c266p";
  }

  @Override
  public String getProcessDefinitionKey() {
    return "Process_1cmsy6d";
  }

  @Override
  public String getStart() {
    return "StartEvent_1";
  }
}
