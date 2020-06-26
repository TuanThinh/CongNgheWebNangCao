package mta.service.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mta.service.entity.ChiTietDonThuoc;
import mta.service.repository.ChiTietDonThuocRepository;

@Service
public class ChiTietDonThuocServiceImpl implements ChiTietDonThuocService{

	@Autowired
	private ChiTietDonThuocRepository chiTietDonThuocRepository;
	@Override
	public List<ChiTietDonThuoc> findAll() {
		return chiTietDonThuocRepository.findAll();
	}

	@Override
	public Optional<ChiTietDonThuoc> findById(Long id) {
		return chiTietDonThuocRepository.findById(id);
	}

	@Override
	public ChiTietDonThuoc save(ChiTietDonThuoc entity) {
		return chiTietDonThuocRepository.save(entity);
	}

	@Override
	public Long deleteById(Long id) {
		chiTietDonThuocRepository.deleteById(id);
		return id;
	}

}
