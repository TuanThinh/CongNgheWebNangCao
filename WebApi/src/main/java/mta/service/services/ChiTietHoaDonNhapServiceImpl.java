package mta.service.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mta.service.entity.ChiTietHoaDonNhap;
import mta.service.repository.ChiTietHoaDonNhapRepository;

@Service
public class ChiTietHoaDonNhapServiceImpl implements ChiTietHoaDonNhapService{

	@Autowired
	private ChiTietHoaDonNhapRepository chiTietHoaDonNhapRepository;
	@Override
	public List<ChiTietHoaDonNhap> findAll() {
		return chiTietHoaDonNhapRepository.findAll();
	}

	@Override
	public Optional<ChiTietHoaDonNhap> findById(Long id) {
		return chiTietHoaDonNhapRepository.findById(id);
	}

	@Override
	public ChiTietHoaDonNhap save(ChiTietHoaDonNhap entity) {
		return chiTietHoaDonNhapRepository.save(entity);
	}

	@Override
	public Long deleteById(Long id) {
		chiTietHoaDonNhapRepository.deleteById(id);
		return id;
	}

}
