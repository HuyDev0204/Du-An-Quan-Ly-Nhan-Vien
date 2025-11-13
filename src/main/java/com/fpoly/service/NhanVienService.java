package com.fpoly.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fpoly.model.NhanVienModel;
import com.fpoly.repository.NhanVienRepository;

@Service
public class NhanVienService {
NhanVienRepository nvrepo;

public NhanVienService(NhanVienRepository nvrepo) {
	
	this.nvrepo = nvrepo;
}

public List<NhanVienModel> getAllNhanVien(){
	return nvrepo.findAll();
}
public void save(NhanVienModel nv) {
    nvrepo.save(nv);
}
public NhanVienModel getById(int id) {
	return nvrepo.findById(id).orElse(null);
	}
public void delete(int id) {
	nvrepo.delete(getById(id));
}

}
