package com.bp.ensayo.ct1.domain.dto;

import com.bp.ensayo.ct1.domain.enu.IdentificationType;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import jakarta.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CustomerDTO implements Serializable {
    Long id;
    @NotBlank
    String identification;
    @NotBlank
    String name;
    @NotBlank
    String lastname;
    IdentificationType identificationType;
    List<Account> accounts;
}
