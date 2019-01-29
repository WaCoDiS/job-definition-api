package de.wacodis.api.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.joda.time.DateTime;
import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

/** WacodisJobDefinition */
@Table(value = WacodisJobDefinition.TABLE_NAME)
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2019-01-29T11:23:45.055+01:00[Europe/Berlin]")
public class WacodisJobDefinition implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String TABLE_NAME = "jobDefinitions";
    
    @JsonProperty("id")
    @Id
    @PrimaryKeyColumn(type = PrimaryKeyType.PARTITIONED)
    private UUID id = null;

    @JsonProperty("name")
    @Column
    private String name = null;

    @JsonProperty("description")
    @Column
    private String description = null;

    @JsonProperty("useCase")
    @Column
    private String useCase = null;

    @JsonProperty("created")
    @Column
    private DateTime created = null;

    @JsonProperty("lastFinishedExecution")
    @Column
    private DateTime lastFinishedExecution;

    /** Gets or Sets status */
    public enum StatusEnum {
        WAITING("waiting"),

        RUNNING("running"),

        DELETED("deleted");

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String text) {
            for (StatusEnum b : StatusEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }

    @JsonProperty("status")
    private StatusEnum status;

    @JsonProperty("execution")
    private WacodisJobDefinitionExecution execution = null;

    @JsonProperty("temporalCoverage")
    @Column
    private WacodisJobDefinitionTemporalCoverage temporalCoverage = null;

    @JsonProperty("areaOfInterest")
    @Column
    private WacodisJobDefinitionAreaOfInterest areaOfInterest = null;

    @JsonProperty("processingTool")
    @Column
    private String processingTool = null;

    @JsonProperty("inputs")
    @Column
    @Valid
    private List<AbstractSubsetDefinition> inputs = new ArrayList<AbstractSubsetDefinition>();

    public WacodisJobDefinition id(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
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
     * a more verbose description of the WacodisJobDefinitions (e.g. purpose, inputs, ...)
     *
     * @return description
     */
    @ApiModelProperty(
            value =
                    "a more verbose description of the WacodisJobDefinitions (e.g. purpose, inputs, ...) ")
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
     * A generic use case reference. This can be used to refer to the use cases identified during
     * the initial phase of WaCoDiS
     *
     * @return useCase
     */
    @ApiModelProperty(
            value =
                    "A generic use case reference. This can be used to refer to the use cases identified during the initial phase of WaCoDiS ")
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
     */
    @ApiModelProperty(value = "")
    @Valid
    public DateTime getLastFinishedExecution() {
        return lastFinishedExecution;
    }

    public void setLastFinishedExecution(DateTime lastFinishedExecution) {
        this.lastFinishedExecution = lastFinishedExecution;
    }

    public WacodisJobDefinition status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     */
    @ApiModelProperty(value = "")
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
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
     */
    @ApiModelProperty(value = "")
    @Valid
    public WacodisJobDefinitionExecution getExecution() {
        return execution;
    }

    public void setExecution(WacodisJobDefinitionExecution execution) {
        this.execution = execution;
    }

    public WacodisJobDefinition temporalCoverage(
            WacodisJobDefinitionTemporalCoverage temporalCoverage) {
        this.temporalCoverage = temporalCoverage;
        return this;
    }

    /**
     * Get temporalCoverage
     *
     * @return temporalCoverage
     */
    @ApiModelProperty(value = "")
    @Valid
    public WacodisJobDefinitionTemporalCoverage getTemporalCoverage() {
        return temporalCoverage;
    }

    public void setTemporalCoverage(WacodisJobDefinitionTemporalCoverage temporalCoverage) {
        this.temporalCoverage = temporalCoverage;
    }

    public WacodisJobDefinition areaOfInterest(WacodisJobDefinitionAreaOfInterest areaOfInterest) {
        this.areaOfInterest = areaOfInterest;
        return this;
    }

    /**
     * Get areaOfInterest
     *
     * @return areaOfInterest
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull
    @Valid
    public WacodisJobDefinitionAreaOfInterest getAreaOfInterest() {
        return areaOfInterest;
    }

    public void setAreaOfInterest(WacodisJobDefinitionAreaOfInterest areaOfInterest) {
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
     */
    @ApiModelProperty(
            required = true,
            value = "the processingTool ID as provided by the WPS tool wrapper ")
    @NotNull
    public String getProcessingTool() {
        return processingTool;
    }

    public void setProcessingTool(String processingTool) {
        this.processingTool = processingTool;
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
                && Objects.equals(
                        this.lastFinishedExecution, wacodisJobDefinition.lastFinishedExecution)
                && Objects.equals(this.status, wacodisJobDefinition.status)
                && Objects.equals(this.execution, wacodisJobDefinition.execution)
                && Objects.equals(this.temporalCoverage, wacodisJobDefinition.temporalCoverage)
                && Objects.equals(this.areaOfInterest, wacodisJobDefinition.areaOfInterest)
                && Objects.equals(this.processingTool, wacodisJobDefinition.processingTool)
                && Objects.equals(this.inputs, wacodisJobDefinition.inputs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                name,
                description,
                useCase,
                created,
                lastFinishedExecution,
                status,
                execution,
                temporalCoverage,
                areaOfInterest,
                processingTool,
                inputs);
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
        sb.append("    lastFinishedExecution: ")
                .append(toIndentedString(lastFinishedExecution))
                .append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    execution: ").append(toIndentedString(execution)).append("\n");
        sb.append("    temporalCoverage: ").append(toIndentedString(temporalCoverage)).append("\n");
        sb.append("    areaOfInterest: ").append(toIndentedString(areaOfInterest)).append("\n");
        sb.append("    processingTool: ").append(toIndentedString(processingTool)).append("\n");
        sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first
     * line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
