package mta.service.services;

import java.util.List;
import java.util.Optional;

import mta.service.entity.ChiTietDonThuoc;;

public interface ChiTietDonThuocService {
	List<ChiTietDonThuoc> findAll();
	Optional<ChiTietDonThuoc> findById(Long id);
	ChiTietDonThuoc save(ChiTietDonThuoc entity);
	Long deleteById(Long id);
}
