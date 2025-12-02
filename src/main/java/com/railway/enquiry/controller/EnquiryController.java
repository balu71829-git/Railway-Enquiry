package com.railway.enquiry.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.railway.enquiry.model.Enquiry;
import com.railway.enquiry.service.EnquiryService;

@Controller
public class EnquiryController {

    @Autowired
    private EnquiryService service;

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("enquiry", new Enquiry());
        return "enquiry-form";
    }

    @PostMapping("/submit")
    public String submit(@ModelAttribute Enquiry enquiry, Model model) {

        service.saveEnquiry(enquiry);  // save to local indexed storage

        model.addAttribute("message", "Enquiry Saved Successfully!");
        model.addAttribute("data", enquiry);

        return "enquiry-success";
    }

    // View all stored forms
    @GetMapping("/list")
    public String viewList(Model model) {
        model.addAttribute("enquiries", service.getAllEnquiries());
        return "enquiry-list";
    }
}
