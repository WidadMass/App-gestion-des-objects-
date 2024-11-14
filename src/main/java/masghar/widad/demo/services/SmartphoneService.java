package masghar.widad.demo.services;
import masghar.widad.demo.entities.Smartphone;
import masghar.widad.demo.repositories.SmartphoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SmartphoneService {

    @Autowired
    private SmartphoneRepository smartphoneRepository;

    // Create or Update
    public Smartphone saveSmartphone(Smartphone smartphone) {
        return smartphoneRepository.save(smartphone);
    }

    // Read
    public List<Smartphone> getAllSmartphones() {
        return smartphoneRepository.findAll();
    }

    public Optional<Smartphone> getSmartphoneById(Long id) {
        return smartphoneRepository.findById(id);
    }

    // Delete
    public void deleteSmartphoneById(Long id) {
        smartphoneRepository.deleteById(id);
    }
}
