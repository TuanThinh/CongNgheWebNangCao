package mta.service.services;

import java.util.List;
import java.util.Optional;

import mta.service.entity.NhaCungCap;;

public interface NhaCungCapService {
	List<NhaCungCap> findAll();
	Optional<NhaCungCap> findById(Long id);
	NhaCungCap save(NhaCungCap ncc);
	Long deleteById(Long id);
}
