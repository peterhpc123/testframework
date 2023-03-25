package com.example.assemblerframework;

import com.example.assemblerframework.common.DataFromCMS;
import com.example.assemblerframework.common.DataFromGDS;
import com.example.assemblerframework.extension.AssemblerExtension;
import com.example.assemblerframework.extension.Scenario;
import com.example.assemblerframework.extension.Story;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.util.Assert;

//use case
@Story(name = "This is common test for check")
@ComponentScan(basePackages = {"com.example.assemblerframework"})
public class AssemblerTestCPDLCSpringBoot {
    DataFromCMS dataFromCMS;
    DataFromGDS dataFromGDS;
    @Scenario("This is common test for check")
    public void testwithCMSAndGDS(){
        dataFromCMS = new DataFromCMS();
        dataFromGDS = new DataFromGDS();
        Assertions.assertNotNull(dataFromCMS.getDataFromCMS().get("Prop1"));
        Assertions.assertNotNull(dataFromCMS.getDataFromCMS().get("dep1"));
        Assertions.assertEquals(dataFromGDS.queryfromGDS().get("dep1"),dataFromCMS.getDataFromCMS().get("dep1"));
    }
}
