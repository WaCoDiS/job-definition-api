package de.wacodis.jobdefinition.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import de.wacodis.jobdefinition.model.AbstractDataEnvelopeAreaOfInterest;
import de.wacodis.jobdefinition.model.AbstractSubsetDefinition;
import de.wacodis.jobdefinition.model.JobOutputDescriptor;
import de.wacodis.jobdefinition.model.WacodisJobDefinitionExecution;
import de.wacodis.jobdefinition.model.WacodisJobDefinitionExecutionSettings;
import de.wacodis.jobdefinition.model.WacodisJobDefinitionRetrySettings;
import de.wacodis.jobdefinition.model.WacodisJobDefinitionTemporalCoverage;
import de.wacodis.jobdefinition.model.WacodisJobStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.joda.time.DateTime;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.springframework.data.annotation.Id;

/**
 * contains information about a WaCoDiS Job that will be used for scheduling,
 * preparing and executing certain processes
 */
@ApiModel(description = "contains information about a WaCoDiS Job that will be used for scheduling, preparing and executing certain processes")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-11-04T14:36:08.966+01:00[Europe/Berlin]")
@Document(indexName = "wacodis", type = "job")
public class WacodisJobDefinition implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final String TABLE_NAME = "jobDefinitions";

    @JsonProperty("id")
    @Id
    private UUID id = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("description")
    private String description = null;

    @JsonProperty("useCase")
    private String useCase = null;

    @JsonProperty("created")
    private DateTime created = null;

    @JsonProperty("lastFinishedExecution")
    private DateTime lastFinishedExecution = null;

    @JsonProperty("status")
    private WacodisJobStatus status = null;

    @JsonProperty("execution")
    private WacodisJobDefinitionExecution execution = null;

    @JsonProperty("temporalCoverage")
    private WacodisJobDefinitionTemporalCoverage temporalCoverage = null;

    @JsonProperty("areaOfInterest")
    private AbstractDataEnvelopeAreaOfInterest areaOfInterest = null;

    @JsonProperty("processingTool")
    private String processingTool = null;

    @JsonProperty("productCollection")
    private String productCollection = null;

    @JsonProperty("retrySettings")
    private WacodisJobDefinitionRetrySettings retrySettings = null;

    @JsonProperty("executionSettings")
    private WacodisJobDefinitionExecutionSettings executionSettings = null;

    @JsonProperty("inputs")
    @Valid
    private List<AbstractSubsetDefinition> inputs = new ArrayList<AbstractSubsetDefinition>();

    @JsonProperty("outputs")
    @Valid
    private List<JobOutputDescriptor> outputs = null;

    public WacodisJobDefinition id(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
  *
     */
    @ApiModelProperty(value = "")

    @Valid

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public WacodisJobDefinition name(String name) {
        this.name = name;
        return this;
    }

    /**
     * a human friendly short name
     *
     * @return name
  *
     */
    @ApiModelProperty(required = true, value = "a human friendly short name ")
    @NotNull

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WacodisJobDefinition description(String description) {
        this.description = description;
        return this;
    }

    /**
     * a more verbose description of the WacodisJobDefinitions (e.g. purpose,
     * inputs, ...)
     *
     * @return description
  *
     */
    @ApiModelProperty(value = "a more verbose description of the WacodisJobDefinitions (e.g. purpose, inputs, ...) ")

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public WacodisJobDefinition useCase(String useCase) {
        this.useCase = useCase;
        return this;
    }

    /**
     * a generic use case reference. This can be used to refer to the use cases
     * identified during the initial phase of WaCoDiS
     *
     * @return useCase
  *
     */
    @ApiModelProperty(value = "a generic use case reference. This can be used to refer to the use cases identified during the initial phase of WaCoDiS ")

    public String getUseCase() {
        return useCase;
    }

    public void setUseCase(String useCase) {
        this.useCase = useCase;
    }

    public WacodisJobDefinition created(DateTime created) {
        this.created = created;
        return this;
    }

    /**
     * Get created
     *
     * @return created
  *
     */
    @ApiModelProperty(value = "")

    @Valid

    public DateTime getCreated() {
        return created;
    }

    public void setCreated(DateTime created) {
        this.created = created;
    }

    public WacodisJobDefinition lastFinishedExecution(DateTime lastFinishedExecution) {
        this.lastFinishedExecution = lastFinishedExecution;
        return this;
    }

    /**
     * Get lastFinishedExecution
     *
     * @return lastFinishedExecution
  *
     */
    @ApiModelProperty(value = "")

    @Valid

    public DateTime getLastFinishedExecution() {
        return lastFinishedExecution;
    }

    public void setLastFinishedExecution(DateTime lastFinishedExecution) {
        this.lastFinishedExecution = lastFinishedExecution;
    }

    public WacodisJobDefinition status(WacodisJobStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
  *
     */
    @ApiModelProperty(value = "")

    @Valid

    public WacodisJobStatus getStatus() {
        return status;
    }

    public void setStatus(WacodisJobStatus status) {
        this.status = status;
    }

    public WacodisJobDefinition execution(WacodisJobDefinitionExecution execution) {
        this.execution = execution;
        return this;
    }

    /**
     * Get execution
     *
     * @return execution
  *
     */
    @ApiModelProperty(value = "")

    @Valid

    public WacodisJobDefinitionExecution getExecution() {
        return execution;
    }

    public void setExecution(WacodisJobDefinitionExecution execution) {
        this.execution = execution;
    }

    public WacodisJobDefinition temporalCoverage(WacodisJobDefinitionTemporalCoverage temporalCoverage) {
        this.temporalCoverage = temporalCoverage;
        return this;
    }

    /**
     * Get temporalCoverage
     *
     * @return temporalCoverage
  *
     */
    @ApiModelProperty(value = "")

    @Valid

    public WacodisJobDefinitionTemporalCoverage getTemporalCoverage() {
        return temporalCoverage;
    }

    public void setTemporalCoverage(WacodisJobDefinitionTemporalCoverage temporalCoverage) {
        this.temporalCoverage = temporalCoverage;
    }

    public WacodisJobDefinition areaOfInterest(AbstractDataEnvelopeAreaOfInterest areaOfInterest) {
        this.areaOfInterest = areaOfInterest;
        return this;
    }

    /**
     * Get areaOfInterest
     *
     * @return areaOfInterest
  *
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull

    @Valid

    public AbstractDataEnvelopeAreaOfInterest getAreaOfInterest() {
        return areaOfInterest;
    }

    public void setAreaOfInterest(AbstractDataEnvelopeAreaOfInterest areaOfInterest) {
        this.areaOfInterest = areaOfInterest;
    }

    public WacodisJobDefinition processingTool(String processingTool) {
        this.processingTool = processingTool;
        return this;
    }

    /**
     * the processingTool ID as provided by the WPS tool wrapper
     *
     * @return processingTool
  *
     */
    @ApiModelProperty(required = true, value = "the processingTool ID as provided by the WPS tool wrapper ")
    @NotNull

    public String getProcessingTool() {
        return processingTool;
    }

    public void setProcessingTool(String processingTool) {
        this.processingTool = processingTool;
    }

    public WacodisJobDefinition productCollection(String productCollection) {
        this.productCollection = productCollection;
        return this;
    }

    /**
     * collection to which the output data should be added when it becomes
     * available
     *
     * @return productCollection
  *
     */
    @ApiModelProperty(required = true, value = "collection to which the output data should be added when it becomes available ")
    @NotNull

    public String getProductCollection() {
        return productCollection;
    }

    public void setProductCollection(String productCollection) {
        this.productCollection = productCollection;
    }

    public WacodisJobDefinition retrySettings(WacodisJobDefinitionRetrySettings retrySettings) {
        this.retrySettings = retrySettings;
        return this;
    }

    /**
     * Get retrySettings
     *
     * @return retrySettings
  *
     */
    @ApiModelProperty(value = "")

    @Valid

    public WacodisJobDefinitionRetrySettings getRetrySettings() {
        return retrySettings;
    }

    public void setRetrySettings(WacodisJobDefinitionRetrySettings retrySettings) {
        this.retrySettings = retrySettings;
    }

    public WacodisJobDefinition executionSettings(WacodisJobDefinitionExecutionSettings executionSettings) {
        this.executionSettings = executionSettings;
        return this;
    }

    /**
     * Get executionSettings
     *
     * @return executionSettings
  *
     */
    @ApiModelProperty(required = true, value = "")
    public WacodisJobDefinitionExecutionSettings getExecutionSettings() {
        return executionSettings;
    }

    public void setExecutionSettings(WacodisJobDefinitionExecutionSettings executionSettings) {
        this.executionSettings = executionSettings;
    }

    public WacodisJobDefinition inputs(List<AbstractSubsetDefinition> inputs) {
        this.inputs = inputs;
        return this;
    }

    public WacodisJobDefinition addInputsItem(AbstractSubsetDefinition inputsItem) {
        this.inputs.add(inputsItem);
        return this;
    }

    /**
     * Get inputs
     *
     * @return inputs
  *
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull

    @Valid
    @Size(min = 1)
    public List<AbstractSubsetDefinition> getInputs() {
        return inputs;
    }

    public void setInputs(List<AbstractSubsetDefinition> inputs) {
        this.inputs = inputs;
    }

    public WacodisJobDefinition outputs(List<JobOutputDescriptor> outputs) {
        this.outputs = outputs;
        return this;
    }

    public WacodisJobDefinition addOutputsItem(JobOutputDescriptor outputsItem) {
        if (this.outputs == null) {
            this.outputs = new ArrayList<JobOutputDescriptor>();
        }
        this.outputs.add(outputsItem);
        return this;
    }

    /**
     * Get outputs
     *
     * @return outputs
  *
     */
    @ApiModelProperty(value = "")

    @Valid

    public List<JobOutputDescriptor> getOutputs() {
        return outputs;
    }

    public void setOutputs(List<JobOutputDescriptor> outputs) {
        this.outputs = outputs;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WacodisJobDefinition wacodisJobDefinition = (WacodisJobDefinition) o;
        return Objects.equals(this.id, wacodisJobDefinition.id)
                && Objects.equals(this.name, wacodisJobDefinition.name)
                && Objects.equals(this.description, wacodisJobDefinition.description)
                && Objects.equals(this.useCase, wacodisJobDefinition.useCase)
                && Objects.equals(this.created, wacodisJobDefinition.created)
                && Objects.equals(this.lastFinishedExecution, wacodisJobDefinition.lastFinishedExecution)
                && Objects.equals(this.status, wacodisJobDefinition.status)
                && Objects.equals(this.execution, wacodisJobDefinition.execution)
                && Objects.equals(this.temporalCoverage, wacodisJobDefinition.temporalCoverage)
                && Objects.equals(this.areaOfInterest, wacodisJobDefinition.areaOfInterest)
                && Objects.equals(this.processingTool, wacodisJobDefinition.processingTool)
                && Objects.equals(this.productCollection, wacodisJobDefinition.productCollection)
                && Objects.equals(this.retrySettings, wacodisJobDefinition.retrySettings)
                && Objects.equals(this.executionSettings, wacodisJobDefinition.executionSettings)
                && Objects.equals(this.inputs, wacodisJobDefinition.inputs)
                && Objects.equals(this.outputs, wacodisJobDefinition.outputs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, useCase, created, lastFinishedExecution, status, execution, temporalCoverage, areaOfInterest, processingTool, productCollection, retrySettings, executionSettings, inputs, outputs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WacodisJobDefinition {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    useCase: ").append(toIndentedString(useCase)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    lastFinishedExecution: ").append(toIndentedString(lastFinishedExecution)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    execution: ").append(toIndentedString(execution)).append("\n");
        sb.append("    temporalCoverage: ").append(toIndentedString(temporalCoverage)).append("\n");
        sb.append("    areaOfInterest: ").append(toIndentedString(areaOfInterest)).append("\n");
        sb.append("    processingTool: ").append(toIndentedString(processingTool)).append("\n");
        sb.append("    productCollection: ").append(toIndentedString(productCollection)).append("\n");
        sb.append("    retrySettings: ").append(toIndentedString(retrySettings)).append("\n");
        sb.append("    executionSettings: ").append(toIndentedString(executionSettings)).append("\n");
        sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
        sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
