package mta.service.services;

import java.util.List;
import java.util.Optional;

import mta.service.entity.KhachHang;

public interface KhachHangService {
	List<KhachHang> findAll();
	Optional<KhachHang> findById(Long id);
	KhachHang save(KhachHang khachhang);
	Long deleteById(Long id);
}
