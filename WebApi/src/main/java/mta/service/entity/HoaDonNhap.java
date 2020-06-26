package mta.service.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "hoadonnhap")
public class HoaDonNhap {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "id_ncc")
	private NhaCungCap nhaCungCap;
	
	@Column(name = "ngay_nhap")
	private Date ngayNhap;
	
	@Column(name = "thanh_tien")
	private Long thanhTien;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "hoaDonNhap")
	private List<ChiTietHoaDonNhap> listChiTietHoaDonNhap = new ArrayList<ChiTietHoaDonNhap>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public NhaCungCap getNhaCungCap() {
		return nhaCungCap;
	}

	public void setNhaCungCap(NhaCungCap nhaCungCap) {
		this.nhaCungCap = nhaCungCap;
	}

	public Date getNgayNhap() {
		return ngayNhap;
	}

	public void setNgayNhap(Date ngayNhap) {
		this.ngayNhap = ngayNhap;
	}

	public Long getThanhTien() {
		return thanhTien;
	}

	public void setThanhTien(Long thanhTien) {
		this.thanhTien = thanhTien;
	}

	public List<ChiTietHoaDonNhap> getListChiTietHoaDonNhap() {
		return listChiTietHoaDonNhap;
	}

	public void setListChiTietHoaDonNhap(List<ChiTietHoaDonNhap> listChiTietHoaDonNhap) {
		this.listChiTietHoaDonNhap = listChiTietHoaDonNhap;
	}
	
}
