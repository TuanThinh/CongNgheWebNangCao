package mta.service.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "chitiethoadonnhap")
public class ChiTietHoaDonNhap {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "id_hoadonnhap")
	@JsonIgnore
	private HoaDonNhap hoaDonNhap;
	
	@ManyToOne
	@JoinColumn(name = "id_thuoc")
	private Thuoc thuoc;
	
	@Column(name = "so_luong")
	private Integer soLuong;
	
	@Column(name = "gia_nhap")
	private Long giaNhap;
	
	@Column(name = "thanh_tien")
	private Long thanhTien;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public HoaDonNhap getHoaDonNhap() {
		return hoaDonNhap;
	}

	public void setHoaDonNhap(HoaDonNhap hoaDonNhap) {
		this.hoaDonNhap = hoaDonNhap;
	}

	public Thuoc getThuoc() {
		return thuoc;
	}

	public void setThuoc(Thuoc thuoc) {
		this.thuoc = thuoc;
	}

	public Integer getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(Integer soLuong) {
		this.soLuong = soLuong;
	}

	public Long getGiaNhap() {
		return giaNhap;
	}

	public void setGiaNhap(Long giaNhap) {
		this.giaNhap = giaNhap;
	}

	public Long getThanhTien() {
		return thanhTien;
	}

	public void setThanhTien(Long thanhTien) {
		this.thanhTien = thanhTien;
	}
}
