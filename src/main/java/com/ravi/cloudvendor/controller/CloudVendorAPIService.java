package com.ravi.cloudvendor.controller;

import com.ravi.cloudvendor.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {

    private CloudVendor cloudVendor;

    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId){
        return cloudVendor;
    }

    @PostMapping
    public String createCloudVendor(@RequestBody CloudVendor cloudVendor){
        String responseMessage;

        this.cloudVendor = cloudVendor;
        responseMessage = "Cloud vendor is created successfully";
        return responseMessage;
    }

    @PutMapping
    public String updateCloudVendor(@RequestBody CloudVendor cloudVendor){
        String responseMessage;

        this.cloudVendor = cloudVendor;
        responseMessage = "Cloud vendor details updated successfully";
        return responseMessage;
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendor(String vendorId){
        String responseMessage;

        this.cloudVendor = null;
        responseMessage = "Cloud vendor details deleted successfully";
        return responseMessage;
    }
}
