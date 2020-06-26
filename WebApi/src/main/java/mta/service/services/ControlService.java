package mta.service.services;

import java.util.List;
import java.util.Optional;

import mta.service.entity.Control;

public interface ControlService {
	List<Control> findAll();
	Optional<Control> findById(Long id);
	Control save(Control control);
	Long deleteById(Long id);
}
