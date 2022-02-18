



import generated.process_0a1uc4m.TC_Big_Process_1;
import generated.process_0a1uc4m.TC_Big_Process_2;
import generated.process_0a1uc4m.TC_Big_Process_3;
import generated.process_1eh6q4l.TC_Big_Process_Sub;
import org.junit.Rule;
import org.junit.Test;

import java.util.concurrent.Executor;


public class TotalTesting {

//------------------TASKS----------------------------

    @Rule
    public TC_Big_Process_1 tc01 = new TC_Big_Process_1();
    @Test
    public void tc01BigProcess() {
        tc01.handleActivity_0gad5d4().withVariable("check", true);
        tc01.createExecutor().execute();
    }

    @Rule
    public TC_Big_Process_2 tc02 = new TC_Big_Process_2();
    @Test
    public void tc02BigProcess() {
        tc02.handleActivity_0gad5d4().withVariable("check", true);
        tc02.createExecutor().execute();
    }

    @Rule
    public TC_Big_Process_3 tc03 = new TC_Big_Process_3();
    @Test
    public void tc03BigProcess() {
        tc03.handleActivity_0gad5d4().withVariable("check", false);
        tc03.createExecutor().execute();
    }

    // Sub-Process

    @Rule
    public TC_Big_Process_Sub tc_sub = new TC_Big_Process_Sub();
    @Test
    public void tcSubProcess() {
        tc_sub.createExecutor().execute();
    }



}


