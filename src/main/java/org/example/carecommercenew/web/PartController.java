package org.example.carecommercenew.web;

import org.example.carecommercenew.model.Parts;
import org.example.carecommercenew.service.PartService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/parts")
@CrossOrigin(origins = "*")
public class PartController {
    private final PartService partService;

    public PartController(PartService partService) {
        this.partService = partService;
    }

    @GetMapping
    public List<Parts> getAllParts() {
        return partService.getAllParts();
    }

    @GetMapping("/{id}")
    public Parts getPartById(@PathVariable int id) {
        return partService.getPartById(id);
    }

    @PostMapping
    public Parts createPart(@RequestBody Parts part) {
        return partService.savePart(part);
    }

    @PutMapping("/{id}")
    public Parts updatePart(@PathVariable int id, @RequestBody Parts part) {
        return partService.updatePart(id, part);
    }

    @DeleteMapping("/{id}")
    public void deletePart(@PathVariable int id) {
        partService.deletePart(id);
    }
}
