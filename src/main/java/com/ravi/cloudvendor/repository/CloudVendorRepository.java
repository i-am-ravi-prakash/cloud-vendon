package com.ravi.cloudvendor.repository;

import com.ravi.cloudvendor.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorRepository extends JpaRepository <CloudVendor, String> {
}
