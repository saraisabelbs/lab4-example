package pt.ulusofona.cd.store.dto;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
public class ProductRequest {
    @NotBlank
    @Size(min = 3, max = 120)
    private String name;

    private String description;

    @NotBlank
    private String sku;

    @NotNull
    @DecimalMin("0.0")
    private BigDecimal price;

    @Min(0)
    private int stock;

    private String currency = "EUR";

    private UUID supplierId;
}