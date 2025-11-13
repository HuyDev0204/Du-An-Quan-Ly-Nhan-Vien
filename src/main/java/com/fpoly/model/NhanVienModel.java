package com.fpoly.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "NhanVien")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NhanVienModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "id")
	private int id;
	@Column (name = "ten")
	private String ten;
	@Column (name = "vitri")
	private String vitri;
	@Column (name = "luong")
	private float luong;

}
