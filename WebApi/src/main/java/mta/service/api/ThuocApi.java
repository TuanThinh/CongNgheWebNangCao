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

import mta.service.entity.Thuoc;
import mta.service.services.ThuocService;

@RestController
@RequestMapping("/api/thuoc")
public class ThuocApi {
	@Autowired
	private ThuocService thuocService;

	@GetMapping(value = "/all", produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<Thuoc> geList() {
		return (List<Thuoc>) thuocService.findAll();
	}

	@GetMapping(value = "/id/{id}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public Optional<Thuoc> getThuocById(@PathVariable Long id) {
		return thuocService.findById(id);
	}

//	@GetMapping(value = "/username/{username}", produces = { MediaType.APPLICATION_JSON_VALUE })
//	public Thuoc getUserByTenThuoc(@PathVariable String name) {
//		return (Thuoc) thuocService.findByTenThuoc(name);
//	}

	@PostMapping(value = "/add", produces = { MediaType.APPLICATION_JSON_VALUE })
	public Thuoc add(@RequestBody Thuoc thuoc) {
		return thuocService.save(thuoc);
	}

	@PutMapping(value = "/edit", produces = { MediaType.APPLICATION_JSON_VALUE })
	public Thuoc update(@RequestBody Thuoc thuoc) {
		return thuocService.update(thuoc);
	}

	@DeleteMapping(value = "/delete/{id}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public Long deleteUser(@PathVariable Long id) {
		return thuocService.deleteById(id);
	}
}
