/*
 * WaCoDiS Job Repository
 * The API for the WaCoDiS Job Repository 
 *
 * OpenAPI spec version: 0.1.0
 * Contact: m.rieke@52north.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package de.wacodis.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;

/**
 * GdiDeSubsetDefinition
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2018-09-05T11:02:00.597+02:00[Europe/Berlin]")
public class GdiDeSubsetDefinition extends AbstractSubsetDefinition {

    @JsonProperty("catalogueId")
    private String catalogueId = null;

    public GdiDeSubsetDefinition catalogueId(String catalogueId) {
        this.catalogueId = catalogueId;
        return this;
    }

    /**
     * the id of the dataset within the GDI-DE catalogue
     *
     * @return catalogueId
   *
     */
    @JsonProperty("catalogueId")
    @ApiModelProperty(required = true, value = "the id of the dataset within the GDI-DE catalogue ")
    @NotNull
    public String getCatalogueId() {
        return catalogueId;
    }

    public void setCatalogueId(String catalogueId) {
        this.catalogueId = catalogueId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GdiDeSubsetDefinition gdiDeSubsetDefinition = (GdiDeSubsetDefinition) o;
        return Objects.equals(this.catalogueId, gdiDeSubsetDefinition.catalogueId)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(catalogueId, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GdiDeSubsetDefinition {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    catalogueId: ").append(toIndentedString(catalogueId)).append("\n");
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
