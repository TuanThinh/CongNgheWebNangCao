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

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "hoadon")
public class HoaDon {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "id_khachhang")
	@JsonIgnore
	private KhachHang khachHang;
	
	@Column(name = "ngay_dat")
	private Date ngayDat;
	
	@Column(name = "ngay_giao")
	private Date ngayGiao;
	
	@Column(name = "tinh_trang")
	private String tinhTrang;
	
	@Column(name = "thanhToan")
	private Long thanhToan;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "hoaDon")
	private List<ChiTietDonThuoc> listThuoc = new ArrayList<ChiTietDonThuoc>();

	public List<ChiTietDonThuoc> getListThuoc() {
		return listThuoc;
	}

	public void setListThuoc(List<ChiTietDonThuoc> listThuoc) {
		this.listThuoc = listThuoc;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public KhachHang getKhachHang() {
		return khachHang;
	}

	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}

	public Date getNgayDat() {
		return ngayDat;
	}

	public void setNgayDat(Date ngayDat) {
		this.ngayDat = ngayDat;
	}

	public Date getNgayGiao() {
		return ngayGiao;
	}

	public void setNgayGiao(Date ngayGiao) {
		this.ngayGiao = ngayGiao;
	}

	public String getTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

	public Long getThanhToan() {
		return thanhToan;
	}

	public void setThanhToan(Long thanhToan) {
		this.thanhToan = thanhToan;
	}
}
