package com.mc851.address.resource;

import com.mc851.address.domain.response.CepDto;
import com.mc851.address.domain.response.ResponseCep;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/cep")
public class CepResource {

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<ResponseCep> list() {
        return null;
    }

    @RequestMapping(value = "/search", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<ResponseCep> search(@PathVariable(name = "address", required = false) String address) {
        return null;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<ResponseCep> insert(@RequestBody CepDto cep) {
        return null;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<ResponseCep> update(@RequestBody CepDto cep) {
        return null;
    }
}
