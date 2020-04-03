package com.pluralsight.jacket.entry.service;

import java.util.List;

import com.pluralsight.jacket.entry.service.models.JacketEntry;

/**
 * Created by Tyrone Russ on 04/02/2020
 */
 
 /**
 * adding comments to code for testing
 */

public interface JacketEntryService {

    List<JacketEntry> getAllEntries();
    void updateEntry(JacketEntry entry);
}
