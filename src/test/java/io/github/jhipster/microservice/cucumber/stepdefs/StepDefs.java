package io.github.jhipster.microservice.cucumber.stepdefs;

import io.github.jhipster.microservice.JhipsterSampleMicroserviceApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = JhipsterSampleMicroserviceApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
