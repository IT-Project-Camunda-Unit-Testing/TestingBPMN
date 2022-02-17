package generated.process_0wukrdx;

import static org.camunda.bpm.engine.test.assertions.ProcessEngineTests.assertThat;

import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.camunda.community.bpmndt.api.AbstractJUnit4TestCase;
import org.junit.runner.Description;

/**
 * From: startEvent: StartEvent_1, To: endEvent: Event_1bhwt1a, Length: 3
 */
public class TC_04_Aufgabe_Manuell extends AbstractJUnit4TestCase {
  @Override
  protected void starting(Description description) {
    super.starting(description);
  }

  @Override
  protected void execute(ProcessInstance pi) {
    // startEvent: StartEvent_1
    assertThat(pi).hasPassed("StartEvent_1");

    // manualTask: Activity_16bznh1
    assertThat(pi).hasPassed("Activity_16bznh1");

    // endEvent: Event_1bhwt1a
    assertThat(pi).hasPassed("Event_1bhwt1a");
  }

  @Override
  protected String getBpmnResourceName() {
    return "04-Aufgabe-Manuell.bpmn";
  }

  @Override
  public String getEnd() {
    return "Event_1bhwt1a";
  }

  @Override
  public String getProcessDefinitionKey() {
    return "Process_0wukrdx";
  }

  @Override
  public String getStart() {
    return "StartEvent_1";
  }
}
