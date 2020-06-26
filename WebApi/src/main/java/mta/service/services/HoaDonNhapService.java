package mta.service.services;

import java.util.List;
import java.util.Optional;

import mta.service.entity.HoaDonNhap;

public interface HoaDonNhapService {
	List<HoaDonNhap> findAll();
	Optional<HoaDonNhap> findById(Long id);
	HoaDonNhap save(HoaDonNhap hoaDonNhap);
	Long deleteById(Long id);
}
