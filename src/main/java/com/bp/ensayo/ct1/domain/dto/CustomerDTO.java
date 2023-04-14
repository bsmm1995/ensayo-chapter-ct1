package com.bp.ensayo.ct1.domain.dto;

import com.bp.ensayo.ct1.domain.enu.IdentificationType;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.UUID;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CustomerDTO implements Serializable {
    UUID id;
    @NotBlank
    String identification;
    @NotBlank
    String name;
    @NotBlank
    String lastname;
    IdentificationType identificationType;
//    private List<AccountDTO> accounts;
}