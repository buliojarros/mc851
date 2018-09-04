package com.mc851.address.domain.response;

import com.mc851.address.domain.Address;
import com.mc851.address.domain.ResponseStatusCd;
import lombok.Data;

import java.util.List;

@Data
public class ResponseAddress {
    private Integer totalElements;
    private List<AddressDto> addressList;
    private ResponseStatusCd status;
}
