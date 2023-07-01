package com.YTnest.springboot.service.impl;

import com.YTnest.springboot.exception.ResourceNotFoundException;
import com.YTnest.springboot.model.Record;
import com.YTnest.springboot.repository.RecordRepository;
import com.YTnest.springboot.service.RecordService;

// import java.util.HashSet;
import java.util.List;
// import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class RecordServiceImpl implements RecordService {
    private RecordRepository recordRepository;

    public RecordServiceImpl(RecordRepository recordRepository) {
        super();
        this.recordRepository = recordRepository;
    }

    @Override
    public Record saveRecord(Record record) {
        return recordRepository.save(record);
    }

    @Override
    public List<Record> getAllRecords() {
        return recordRepository.findAll();
    }

    @Override
    public Record getRecordById(long id) {
        return recordRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Record", "Id", id));
    }

    @Override
    public Record updateRecord(Record record, long id) {
        Record existingRecord = recordRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Record", "Id", id));


        existingRecord.setRecordDescription(record.getRecordDescription());
        existingRecord.setStatus(record.getStatus());

        recordRepository.save(existingRecord);
        return existingRecord;
    }

    @Override
    public void deleteRecord(long id) {
        recordRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Record", "Id", id));
        recordRepository.deleteById(id);
    }
}
