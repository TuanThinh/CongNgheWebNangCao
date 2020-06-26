package mta.service.services;

import java.util.List;
import java.util.Optional;

import mta.service.entity.HoaDon;

public interface HoaDonService {
	List<HoaDon> findAll();
	Optional<HoaDon> findById(Long id);
	HoaDon save(HoaDon hoaDon);
	Long deleteById(Long id);
}
