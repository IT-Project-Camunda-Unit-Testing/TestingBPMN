package generated.process_1s7lcah;

import static org.camunda.bpm.engine.test.assertions.ProcessEngineTests.assertThat;

import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.camunda.community.bpmndt.api.AbstractJUnit4TestCase;
import org.junit.runner.Description;

/**
 * From: startEvent: StartEvent_1, To: endEvent: Event_0685lvi, Length: 4
 */
public class TC_21_Message_Throw extends AbstractJUnit4TestCase {
  @Override
  protected void starting(Description description) {
    super.starting(description);
  }

  @Override
  protected void execute(ProcessInstance pi) {
    // startEvent: StartEvent_1
    assertThat(pi).hasPassed("StartEvent_1");

    // task: Activity_059qhgg
    assertThat(pi).hasPassed("Activity_059qhgg");

    // intermediateThrowEvent: Event_1qrp957
    assertThat(pi).hasPassed("Event_1qrp957");

    // endEvent: Event_0685lvi
    assertThat(pi).hasPassed("Event_0685lvi");
  }

  @Override
  protected String getBpmnResourceName() {
    return "21-Nachricht-Werfen.bpmn";
  }

  @Override
  public String getEnd() {
    return "Event_0685lvi";
  }

  @Override
  public String getProcessDefinitionKey() {
    return "Process_1s7lcah";
  }

  @Override
  public String getStart() {
    return "StartEvent_1";
  }
}
