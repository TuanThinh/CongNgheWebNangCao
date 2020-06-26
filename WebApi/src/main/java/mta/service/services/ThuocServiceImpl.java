package mta.service.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mta.service.entity.Thuoc;
import mta.service.repository.ThuocRepository;

@Service
public class ThuocServiceImpl implements ThuocService{

	@Autowired
	private ThuocRepository thuocRepository;
	
	@Override
	public List<Thuoc> findAll() {
		return thuocRepository.findAll();
	}

	@Override
	public Optional<Thuoc> findById(Long id) {
		return thuocRepository.findById(id);
	}

	@Override
	public List<Thuoc> findByTenThuoc(String name) {
		return ((ThuocServiceImpl) thuocRepository).findByTenThuoc(name);
	}

	@Override
	public Thuoc save(Thuoc thuoc) {
		return thuocRepository.save(thuoc);
	}

	@Override
	public Thuoc update(Thuoc thuoc) {
		return thuocRepository.save(thuoc);
	}

	@Override
	public Long deleteById(Long id) {
		thuocRepository.deleteById(id);
		return id;
	}

}
