package de.wacodis.jobrepository.controller;

import de.wacodis.api.model.Job;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2018-09-05T11:37:50.848+02:00[Europe/Berlin]")
public abstract class JobsApiService {

    private String defaultMessage;

    public abstract Response createJob(Job job, SecurityContext securityContext) throws NotFoundException;

    public abstract Response deleteJob(String id, SecurityContext securityContext) throws NotFoundException;

    public abstract Response retrieveJobById(String id, SecurityContext securityContext) throws NotFoundException;

    public abstract Response retrieveJobs(Integer page, Integer size, SecurityContext securityContext) throws NotFoundException;

    public String getDefaultMessage() {
        return defaultMessage;
    }

    public void setDefaultMessage(String defaultMessage) {
        this.defaultMessage = defaultMessage;
    }

}
