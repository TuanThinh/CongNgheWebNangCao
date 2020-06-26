//package mta.service.services;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import mta.service.entity.SanPham;
//import mta.service.repository.SanPhamRepository;
//
//@Service
//public class SanPhamServiceImpl implements SanPhamService{
//
//	@Autowired
//	private SanPhamRepository SanPhamRepository;
//	
//	@Override
//	public List<SanPham> findAll() {
//		return SanPhamRepository.findAll();
//	}
//
//	@Override
//	public Optional<SanPham> findById(Long id) {
//		return SanPhamRepository.findById(id);
//	}
//
//	@Override
//	public List<SanPham> findByTenSp(String tenSp) {
//		return SanPhamRepository.findByTenSp(tenSp);
//	}
//
//	@Override
//	public SanPham save(SanPham sanPham) {
//		return SanPhamRepository.save(sanPham);
//	}
//
//	@Override
//	public SanPham updateSanPham(SanPham sanPham) {
//		return SanPhamRepository.save(sanPham);
//	}
//
//	@Override
//	public Long deleteById(Long id) {
//		SanPham sp = SanPhamRepository.findById(id).get();
//		SanPhamRepository.delete(sp);
//		return sp.getId();
//	}
//
//}
