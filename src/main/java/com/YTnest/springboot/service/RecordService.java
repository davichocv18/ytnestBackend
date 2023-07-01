package com.YTnest.springboot.service;

import java.util.List;

import com.YTnest.springboot.model.Record;

public interface RecordService {
    Record saveRecord(Record record);
    List<Record> getAllRecords();
    Record getRecordById(long id);
    Record updateRecord(Record record, long id);
    void deleteRecord(long id);
}
