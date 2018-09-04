package com.mc851.address.domain.response;

import com.mc851.address.domain.ResponseStatusCd;
import lombok.Data;

import java.util.List;

@Data
public class ResponseCep {
    private Integer totalElements;
    private List<CepDto> cepList;
    private ResponseStatusCd status;
}
