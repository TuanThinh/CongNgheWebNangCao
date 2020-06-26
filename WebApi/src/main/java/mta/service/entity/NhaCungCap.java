package mta.service.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "nhacungcap")
public class NhaCungCap {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;
	
	@Column(name = "ten_ncc")
	private String tenNCC;
	
	@Column(name = "dia_chi")
	private String diaChi;
	
	@Column(name = "dien_thoai")
	private String dienThoai;
	
	@Column(name = "website")
	private String website;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "quoc_gia")
	private String quocGia;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "nhaCungCap")
	@JsonIgnore
	private List<Thuoc> listThuoc = new ArrayList<Thuoc>();
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "nhaCungCap")
	@JsonIgnore
	private List<HoaDonNhap> listHoaDonNhap = new ArrayList<HoaDonNhap>();
	
	public List<HoaDonNhap> getListHoaDonNhap() {
		return listHoaDonNhap;
	}

	public void setListHoaDonNhap(List<HoaDonNhap> listHoaDonNhap) {
		this.listHoaDonNhap = listHoaDonNhap;
	}

	public List<Thuoc> getListThuoc() {
		return listThuoc;
	}

	public void setListThuoc(List<Thuoc> listThuoc) {
		this.listThuoc = listThuoc;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTenNCC() {
		return tenNCC;
	}

	public void setTenNCC(String tenNCC) {
		this.tenNCC = tenNCC;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getDienThoai() {
		return dienThoai;
	}

	public void setDienThoai(String dienThoai) {
		this.dienThoai = dienThoai;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getQuocGia() {
		return quocGia;
	}

	public void setQuocGia(String quocGia) {
		this.quocGia = quocGia;
	}
	
}
