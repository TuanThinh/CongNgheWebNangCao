package mta.service.services;

import java.util.List;
import java.util.Optional;

import mta.service.entity.Thuoc;;

public interface ThuocService {
	public List<Thuoc> findAll();

	public Optional<Thuoc> findById(Long id);

	public List<Thuoc> findByTenThuoc(String name);

	public Thuoc save(Thuoc thuoc);
	
	public Thuoc update(Thuoc thuoc);

	public Long deleteById(Long thuocId);
}
