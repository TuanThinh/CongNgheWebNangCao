package mta.service.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mta.service.entity.KhachHang;
import mta.service.repository.KhachHangRepository;

@Service
public class KhachHangServiceImpl implements KhachHangService{

	@Autowired
	private KhachHangRepository khachHangRepository;
	
	@Override
	public List<KhachHang> findAll() {
		return khachHangRepository.findAll();
	}

	@Override
	public Optional<KhachHang> findById(Long id) {
		return khachHangRepository.findById(id);
	}

	@Override
	public KhachHang save(KhachHang khachhang) {
		return khachHangRepository.save(khachhang);
	}

	@Override
	public Long deleteById(Long id) {
		khachHangRepository.deleteById(id);
		return id;
	}

}
