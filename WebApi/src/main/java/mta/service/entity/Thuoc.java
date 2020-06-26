package mta.service.entity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
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

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "thuoc")
public class Thuoc {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;
	
	@Column(name = "hinh_anh")
	private String hinhANh;
	
	@Column(name = "ten_thuoc")
	private String tenThuoc;
	
	@Column(name = "chuc_nang")
	private String chucNang;
	
	@Column(name = "ngay_san_xuat")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", locale = "vi-VN", timezone = "Asia/Ho_Chi_Minh")
	private Date ngaySanXuat;
	
	@Column(name = "han_su_dung")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", locale = "vi-VN", timezone = "Asia/Ho_Chi_Minh")
	private Date hanSuDung;
	
	@Column(name = "ghi_chu")
	private String ghiChu;
	
	@ManyToOne
	@JoinColumn(name = "id_ncc")
	private NhaCungCap nhaCungCap;
	
	@Column(name = "so_luong_ton")
	private Integer soLuongTon;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "thuoc")
	@JsonIgnore
	private List<ChiTietDonThuoc> listThuoc = new ArrayList<ChiTietDonThuoc>();
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "thuoc")
	@JsonIgnore
	private List<ChiTietHoaDonNhap> listChiTietHoaDonNhap = new ArrayList<ChiTietHoaDonNhap>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getHinhANh() {
		return hinhANh;
	}

	public void setHinhANh(String hinhANh) {
		this.hinhANh = hinhANh;
	}

	public String getTenThuoc() {
		return tenThuoc;
	}

	public void setTenThuoc(String tenThuoc) {
		this.tenThuoc = tenThuoc;
	}

	public String getChucNang() {
		return chucNang;
	}

	public void setChucNang(String chucNang) {
		this.chucNang = chucNang;
	}

	public String getNgaySanXuat() {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		return df.format(ngaySanXuat);
	}

	public void setNgaySanXuat(Date ngaySanXuat) {
		this.ngaySanXuat = ngaySanXuat;
	}

	public String getHanSuDung() {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		return df.format(hanSuDung);
	}

	public void setHanSuDung(Date hanSuDung) {
		this.hanSuDung = hanSuDung;
	}

	public String getGhiChu() {
		return ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	public NhaCungCap getNhaCungCap() {
		return nhaCungCap;
	}

	public void setNhaCungCap(NhaCungCap nhaCungCap) {
		this.nhaCungCap = nhaCungCap;
	}

	public Integer getSoLuongTon() {
		return soLuongTon;
	}

	public void setSoLuongTon(Integer soLuongTon) {
		this.soLuongTon = soLuongTon;
	}

	public List<ChiTietDonThuoc> getListThuoc() {
		return listThuoc;
	}

	public void setListThuoc(List<ChiTietDonThuoc> listThuoc) {
		this.listThuoc = listThuoc;
	}

	public List<ChiTietHoaDonNhap> getListChiTietHoaDonNhap() {
		return listChiTietHoaDonNhap;
	}

	public void setListChiTietHoaDonNhap(List<ChiTietHoaDonNhap> listChiTietHoaDonNhap) {
		this.listChiTietHoaDonNhap = listChiTietHoaDonNhap;
	}
	
}
