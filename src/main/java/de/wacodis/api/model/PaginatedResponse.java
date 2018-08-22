package de.wacodis.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import javax.validation.constraints.*;

/** PaginatedResponse */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2018-08-22T15:27:57.540+02:00[Europe/Berlin]")
public class PaginatedResponse {
    @JsonProperty("page")
    private Integer page = null;

    @JsonProperty("size")
    private Integer size = null;

    @JsonProperty("total")
    private Integer total = null;

    public PaginatedResponse page(Integer page) {
        this.page = page;
        return this;
    }

    /**
     * Get page
     *
     * @return page
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public PaginatedResponse size(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * Get size
     *
     * @return size
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public PaginatedResponse total(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * Get total
     *
     * @return total
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PaginatedResponse paginatedResponse = (PaginatedResponse) o;
        return Objects.equals(this.page, paginatedResponse.page)
                && Objects.equals(this.size, paginatedResponse.size)
                && Objects.equals(this.total, paginatedResponse.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(page, size, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PaginatedResponse {\n");

        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
