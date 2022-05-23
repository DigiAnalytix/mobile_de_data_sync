package com.digianalytix.mobile_de;

import com.digianalytix.mobile_de.domain.JobRecord;
import com.digianalytix.mobile_de.repository.JobRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class StatusController {

    private final JobRecordRepository recordRepository;

    @Autowired
    public StatusController(JobRecordRepository recordRepository) {
        this.recordRepository = recordRepository;
    }

    @GetMapping("/status")
    public String showStatus(Model model) {
        List<JobRecord> jobRecords = recordRepository.getRecords();
        model.addAttribute("jobRecords", jobRecords);
        return "status";
    }
}
