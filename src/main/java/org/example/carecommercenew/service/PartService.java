package org.example.carecommercenew.service;

import jakarta.servlet.http.Part;
import org.example.carecommercenew.model.Parts;
import org.example.carecommercenew.repo.PartsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartService implements IPartsService {

    private PartsRepo partsRepo;

    @Autowired
    public PartService(PartsRepo partsRepo) {
        this.partsRepo = partsRepo;
    }

    @Override
    public List<Parts> getAllParts() {
        return partsRepo.findAll();
    }

    @Override
    public Parts getPartById(int id) {
        return partsRepo.findById(id).orElseThrow(()->new RuntimeException("Part not found"));
    }

    @Override
    public Parts savePart(Parts part) {
        return partsRepo.save(part);
    }

    @Override
    public Parts updatePart(int id, Parts part) {
        Parts existing = getPartById(id);
        existing.setName(part.getName());
        existing.setPrice(part.getPrice());
        existing.setDescription(part.getDescription());
        existing.setImage_url(part.getImage_url());
        existing.setCreated_at(part.getCreated_at());
        existing.setIn_stock(part.getIn_stock());
        return partsRepo.save(existing);
    }

    @Override
    public void deletePart(int id) {
        partsRepo.deleteById(id);
    }
}
