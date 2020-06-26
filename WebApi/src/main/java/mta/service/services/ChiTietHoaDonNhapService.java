package mta.service.services;

import java.util.List;
import java.util.Optional;

import mta.service.entity.ChiTietHoaDonNhap;

public interface ChiTietHoaDonNhapService {
	List<ChiTietHoaDonNhap> findAll();
	Optional<ChiTietHoaDonNhap> findById(Long id);
	ChiTietHoaDonNhap save(ChiTietHoaDonNhap entity);
	Long deleteById(Long id);
}
