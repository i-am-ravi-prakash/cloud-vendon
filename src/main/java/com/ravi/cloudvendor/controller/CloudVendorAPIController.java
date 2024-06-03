package com.ravi.cloudvendor.controller;

import com.ravi.cloudvendor.model.CloudVendor;
import com.ravi.cloudvendor.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIController {

    CloudVendorService cloudVendorService;

    public CloudVendorAPIController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") String vendorId){
        return cloudVendorService.getCloudVendor(vendorId);
    }

    @GetMapping()
    public List<CloudVendor> getAllCloudVendors(){
        return cloudVendorService.getAllCloudVendors();
    }

    @PostMapping
    public String createCloudVendor(@RequestBody CloudVendor cloudVendor){
        String responseMessage = cloudVendorService.createCloudVendor(cloudVendor);
        return responseMessage;

    }

    @PutMapping
    public String updateCloudVendor(@RequestBody CloudVendor cloudVendor){
        String responseMessage = cloudVendorService.updateCloudVendor(cloudVendor);
        return responseMessage;
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendor(@PathVariable("vendorId") String vendorId){
        String responseMessage = cloudVendorService.deleteCloudVendor(vendorId);
        return responseMessage;
    }
}
