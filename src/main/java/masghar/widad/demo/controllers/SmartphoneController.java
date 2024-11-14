package masghar.widad.demo.controllers;
import masghar.widad.demo.entities.Smartphone;
import masghar.widad.demo.services.SmartphoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/smartphones")
public class SmartphoneController {

    @Autowired
    private SmartphoneService smartphoneService;

    @GetMapping
    public List<Smartphone> getAllSmartphones() {
        return smartphoneService.getAllSmartphones();
    }


    @GetMapping("/{id}")
    public ResponseEntity<Smartphone> getSmartphoneById(@PathVariable("id") Long id) {
        Optional<Smartphone> smartphone = smartphoneService.getSmartphoneById(id);
        return smartphone.map(ResponseEntity::ok)
                         .orElseGet(() -> ResponseEntity.notFound().build());
    }
    @PostMapping
    public Smartphone createSmartphone(@RequestBody Smartphone smartphone) {
        return smartphoneService.saveSmartphone(smartphone);
    }



    @PutMapping("/{id}")
    public ResponseEntity<Smartphone> updateSmartphone(@PathVariable("id") Long id, @RequestBody Smartphone smartphone) {
        if (smartphoneService.getSmartphoneById(id).isPresent()) {
            smartphone.setId(id);
            return ResponseEntity.ok(smartphoneService.saveSmartphone(smartphone));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSmartphone(@PathVariable("id") Long id) {
        if (smartphoneService.getSmartphoneById(id).isPresent()) {
            smartphoneService.deleteSmartphoneById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}