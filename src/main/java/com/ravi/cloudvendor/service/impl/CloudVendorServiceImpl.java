package com.ravi.cloudvendor.service.impl;

import com.ravi.cloudvendor.exception.CloudVendorNotFoundException;
import com.ravi.cloudvendor.model.CloudVendor;
import com.ravi.cloudvendor.repository.CloudVendorRepository;
import com.ravi.cloudvendor.service.CloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudVendorServiceImpl implements CloudVendorService {

    CloudVendorRepository cloudVendorRepository;
    private String responseMessage;

    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        responseMessage = "Cloud vendor is successfully created";
        return responseMessage;
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        responseMessage = "Cloud vendor details are successfully updated";
        return responseMessage;
    }

    @Override
    public String deleteCloudVendor(String cloudVendorId) {
        cloudVendorRepository.deleteById(cloudVendorId);
        responseMessage = "Cloud vendor with ID: " + cloudVendorId + " has been successfully deleted";
        return responseMessage;
    }

    @Override
    public CloudVendor getCloudVendor(String cloudVendorId) {
        if(cloudVendorRepository.findById(cloudVendorId).isEmpty()){
            throw new CloudVendorNotFoundException("Requested cloud vendor does not exist");
        }
        return cloudVendorRepository.findById(cloudVendorId).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        return cloudVendorRepository.findAll();
    }
}
