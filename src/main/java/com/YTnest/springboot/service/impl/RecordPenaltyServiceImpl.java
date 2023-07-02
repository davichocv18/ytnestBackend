package com.YTnest.springboot.service.impl;

import com.YTnest.springboot.exception.ResourceNotFoundException;
import com.YTnest.springboot.model.RecordPenalty;
import com.YTnest.springboot.repository.RecordPenaltyRepository;
import com.YTnest.springboot.service.RecordPenaltyService;

// import java.util.HashSet;
import java.util.List;
// import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class RecordPenaltyServiceImpl implements RecordPenaltyService {
    private RecordPenaltyRepository recordPenaltyRepository;

    public RecordPenaltyServiceImpl(RecordPenaltyRepository recordPenaltyRepository) {
        super();
        this.recordPenaltyRepository = recordPenaltyRepository;
    }

    @Override
    public RecordPenalty saveRecordPenalty(RecordPenalty recordPenalty) {
        return recordPenaltyRepository.save(recordPenalty);
    }

    @Override
    public List<RecordPenalty> getAllRecordPenaltys() {
        return recordPenaltyRepository.findAll();
    }

    @Override
    public RecordPenalty getRecordPenaltyById(long id) {
        return recordPenaltyRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("RecordPenalty", "Id", id));
    }

    @Override
    public RecordPenalty updateRecordPenalty(RecordPenalty recordPenalty, long id) {
        RecordPenalty existingRecordPenalty = recordPenaltyRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("RecordPenalty", "Id", id));


        existingRecordPenalty.setRecordId(recordPenalty.getRecordId());
        existingRecordPenalty.setPenaltyId(recordPenalty.getPenaltyId());
        existingRecordPenalty.setStatus(recordPenalty.getStatus());
        existingRecordPenalty.setPenaltyDate(recordPenalty.getPenaltyDate());

        recordPenaltyRepository.save(existingRecordPenalty);
        return existingRecordPenalty;
    }
}
