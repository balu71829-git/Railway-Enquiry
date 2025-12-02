package com.railway.enquiry.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.railway.enquiry.model.Enquiry;

@Service
public class EnquiryService {

    // LOCAL INDEX STORAGE
    private List<Enquiry> enquiryList = new ArrayList<>();

    // Store data (like IndexedDB / LocalStorage but inside Java)
    public void saveEnquiry(Enquiry enquiry) {
        enquiryList.add(enquiry);
    }

    // Return all stored enquiries
    public List<Enquiry> getAllEnquiries() {
        return enquiryList;
    }
}
