package mta.service.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mta.service.entity.HoaDonNhap;
import mta.service.services.HoaDonNhapService;

@RestController
@RequestMapping("/api/hoa-don-nhap")
public class HoaDonNhapApi {
	@Autowired
	private HoaDonNhapService hoaDonNhapService;
	
	@GetMapping(value = "/all", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<HoaDonNhap> findAll(){
		return hoaDonNhapService.findAll();
	}
	
	@GetMapping(value = "/id/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public Optional<HoaDonNhap> findById(@PathVariable Long id){
		return hoaDonNhapService.findById(id);
	}
	
	@PostMapping(value = "/add", produces = {MediaType.APPLICATION_JSON_VALUE})
	public HoaDonNhap save(@RequestBody HoaDonNhap hoaDonNhap) {
		return hoaDonNhapService.save(hoaDonNhap);
	}
	
	@PutMapping(value = "/edit", produces = {MediaType.APPLICATION_JSON_VALUE})
	public HoaDonNhap update(@RequestBody HoaDonNhap hoaDonNhap) {
		return hoaDonNhapService.save(hoaDonNhap);
	}
	
	@DeleteMapping(value = "/delete/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public Long deleteById(@PathVariable Long id) {
		return hoaDonNhapService.deleteById(id);
	}
}
