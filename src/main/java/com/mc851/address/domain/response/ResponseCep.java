package com.mc851.address.domain.response;

import com.mc851.address.domain.ResponseStatusCd;
import lombok.Data;

import java.util.List;

@Data
public class ResponseCep {
    private InternalError totalElements;
    private List<Integer> address;
    private ResponseStatusCd status;
}
