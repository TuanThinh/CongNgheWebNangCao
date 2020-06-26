package mta.service.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mta.service.entity.NhaCungCap;
import mta.service.repository.NhaCungCapRepository;

@Service
public class NhaCungCapServiceImpl implements NhaCungCapService{

	@Autowired
	private NhaCungCapRepository nhaCungCapRepository;
	
	@Override
	public List<NhaCungCap> findAll() {
		return nhaCungCapRepository.findAll();
	}

	@Override
	public Optional<NhaCungCap> findById(Long id) {
		return nhaCungCapRepository.findById(id);
	}

	@Override
	public NhaCungCap save(NhaCungCap ncc) {
		return nhaCungCapRepository.save(ncc);
	}

	@Override
	public Long deleteById(Long id) {
		nhaCungCapRepository.deleteById(id);
		return id;
	}

}
