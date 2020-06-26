package mta.service.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mta.service.entity.HoaDonNhap;
import mta.service.repository.HoaDonNhapRepository;

@Service
public class HoaDonNhapServiceImpl implements HoaDonNhapService{
	@Autowired
	private HoaDonNhapRepository hoaDonNhapRepository;

	@Override
	public List<HoaDonNhap> findAll() {
		return hoaDonNhapRepository.findAll();
	}

	@Override
	public Optional<HoaDonNhap> findById(Long id) {
		return hoaDonNhapRepository.findById(id);
	}

	@Override
	public HoaDonNhap save(HoaDonNhap hoaDonNhap) {
		return hoaDonNhapRepository.save(hoaDonNhap);
	}

	@Override
	public Long deleteById(Long id) {
		hoaDonNhapRepository.deleteById(id);
		return id;
	}

}
