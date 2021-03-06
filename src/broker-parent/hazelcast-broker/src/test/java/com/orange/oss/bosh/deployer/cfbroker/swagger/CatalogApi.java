package com.orange.oss.bosh.deployer.cfbroker.swagger;

import io.swagger.model.CatalogServices;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringBootServerCodegen", date = "2016-06-22T19:08:11.087+02:00")
@Api(value = "catalog", description = "the catalog API")
public interface CatalogApi {

    @ApiOperation(value = "Gets services registered within the broker", notes = "The first endpoint that a broker must implement is the service catalog. Cloud Controller will initially fetch this endpoint from all brokers and make adjustments to the user-facing service catalog stored in the Cloud Controller database.  ", response = CatalogServices.class)
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = CatalogServices.class),
        @ApiResponse(code = 400, message = "Invalid status value", response = CatalogServices.class) })
    @RequestMapping(value = "/catalog",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<CatalogServices> catalog();

}
