package com.mc851.address.resource;

import com.mc851.address.domain.response.AddressDto;
import com.mc851.address.domain.response.ResponseAddress;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/address")
public class AddressResource {

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<ResponseAddress> list() {
        return null;
    }

    @RequestMapping(value = "/search", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<ResponseAddress> getByAddress(@PathVariable(name = "cep", required = false) Integer cep,
                                                        @PathVariable(name = "address", required = false) String address) {
        return null;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<ResponseAddress> create(@RequestBody AddressDto address) {
        return null;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<ResponseAddress> update(@RequestBody AddressDto address) {
        return null;
    }
}
