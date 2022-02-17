package generated.process_021xizn;

import static org.camunda.bpm.engine.test.assertions.ProcessEngineTests.assertThat;

import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.camunda.community.bpmndt.api.AbstractJUnit4TestCase;
import org.junit.runner.Description;

/**
 * From: startEvent: StartEvent_1, To: endEvent: Event_0jb016d, Length: 3
 */
public class TC_07_Aufgabe_Skript extends AbstractJUnit4TestCase {
  @Override
  protected void starting(Description description) {
    super.starting(description);
  }

  @Override
  protected void execute(ProcessInstance pi) {
    // startEvent: StartEvent_1
    assertThat(pi).hasPassed("StartEvent_1");

    // scriptTask: Activity_1rhdiqr
    assertThat(pi).hasPassed("Activity_1rhdiqr");

    // endEvent: Event_0jb016d
    assertThat(pi).hasPassed("Event_0jb016d");
  }

  @Override
  protected String getBpmnResourceName() {
    return "07-Aufgabe-Skript.bpmn";
  }

  @Override
  public String getEnd() {
    return "Event_0jb016d";
  }

  @Override
  public String getProcessDefinitionKey() {
    return "Process_021xizn";
  }

  @Override
  public String getStart() {
    return "StartEvent_1";
  }
}
