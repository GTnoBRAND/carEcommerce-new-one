package org.example.carecommercenew.service;



import org.example.carecommercenew.model.Parts;

import java.util.List;

public interface IPartsService {
    List<Parts> getAllParts();
    Parts getPartById(int id);
    Parts savePart(Parts part);
    Parts updatePart(int id, Parts part);
    void deletePart(int id);
}

