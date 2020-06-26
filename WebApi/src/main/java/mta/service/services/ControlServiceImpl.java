package mta.service.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mta.service.entity.Control;
import mta.service.repository.ControlRepository;

@Service
public class ControlServiceImpl implements ControlService{

	@Autowired
	private ControlRepository controlRepository;
	
	@Override
	public List<Control> findAll() {
		return controlRepository.findAll();
	}

	@Override
	public Optional<Control> findById(Long id) {
		return controlRepository.findById(id);
	}

	@Override
	public Control save(Control control) {
		return controlRepository.save(control);
	}

	@Override
	public Long deleteById(Long id) {
		controlRepository.deleteById(id);
		return id;
	}

}
