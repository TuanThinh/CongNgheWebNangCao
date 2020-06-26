//package mta.service.repository;
//
//import java.util.List;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//
//import mta.service.entity.SanPham;
//
//public interface SanPhamRepository extends JpaRepository<SanPham, Long> {
//	@Query(value="select * from sanpham sp where sp.ten_sp like %:tenSp%", nativeQuery = true)
//	List<SanPham> findByTenSp(@Param("tenSp") String tenSp);
//}
