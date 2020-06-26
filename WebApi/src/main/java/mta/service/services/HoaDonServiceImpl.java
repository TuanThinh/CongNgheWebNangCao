package mta.service.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mta.service.entity.HoaDon;
import mta.service.repository.HoaDonRepository;

@Service
public class HoaDonServiceImpl implements HoaDonService{

	@Autowired
	private HoaDonRepository hoaDonRepository;
	
	@Override
	public List<HoaDon> findAll() {
		return hoaDonRepository.findAll();
	}

	@Override
	public Optional<HoaDon> findById(Long id) {
		return hoaDonRepository.findById(id);
	}

	@Override
	public HoaDon save(HoaDon hoaDon) {
		return hoaDonRepository.save(hoaDon);
	}

	@Override
	public Long deleteById(Long id) {
		hoaDonRepository.deleteById(id);
		return id;
	}

}
